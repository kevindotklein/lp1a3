package lg1a3.exercicio;

public class Reptil extends Animal{

	private double temperaturaCorporal;
	
	public Reptil(String nome, int idade, String especie, double temperaturaCorporal) {
		super(nome, idade, especie);
		this.temperaturaCorporal = temperaturaCorporal;
	}

	@Override
	public void emitirSom() {
		System.out.println("som de reptil");
	}

	public double getTemperaturaCorporal() {
		return temperaturaCorporal;
	}

	public void setTemperaturaCorporal(double temperaturaCorporal) {
		this.temperaturaCorporal = temperaturaCorporal;
	}

	@Override
	public void alimentar() {
		this.setAlimentado(true);
	}

	@Override
	public String toString() {
		return "Reptil [temperaturaCorporal=" + temperaturaCorporal + ", getNome()=" + getNome() + ", getIdade()="
				+ getIdade() + ", getEspecie()=" + getEspecie() + ", isAlimentado()=" + isAlimentado() + "]";
	}

}
