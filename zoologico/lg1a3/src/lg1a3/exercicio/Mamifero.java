package lg1a3.exercicio;

public class Mamifero extends Animal{

	private int tempoGestacao;
	
	public Mamifero(String nome, int idade, String especie, int tempoGestacao) {
		super(nome, idade, especie);
		this.tempoGestacao = tempoGestacao;
	}
	
	@Override
	public void emitirSom() {
		System.out.println("som de mamifero");
	}

	public int getTempoGestacao() {
		return tempoGestacao;
	}

	public void setTempoGestacao(int tempoGestacao) {
		this.tempoGestacao = tempoGestacao;
	}

	@Override
	public void alimentar() {
		this.setAlimentado(true);
	}

	@Override
	public String toString() {
		return "Mamifero [tempoGestacao=" + tempoGestacao + ", getNome()=" + getNome() + ", getIdade()=" + getIdade()
				+ ", getEspecie()=" + getEspecie() + ", isAlimentado()=" + isAlimentado() + "]";
	}

}
