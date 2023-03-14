package lg1a3.exercicio;

public class Ave extends Animal{
	
	private String tipoBico;

	public Ave(String nome, int idade, String especie, String tipoBico) {
		super(nome, idade, especie);
		this.tipoBico = tipoBico;
	}

	@Override
	public void emitirSom() {
		System.out.println("som de ave");
	}

	public String getTipoBico() {
		return tipoBico;
	}

	public void setTipoBico(String tipoBico) {
		this.tipoBico = tipoBico;
	}

	@Override
	public void alimentar() {
		this.setAlimentado(true);
	}

	@Override
	public String toString() {
		return "Ave [tipoBico=" + tipoBico + ", getNome()=" + getNome() + ", getIdade()=" + getIdade()
				+ ", getEspecie()=" + getEspecie() + ", isAlimentado()=" + isAlimentado() + "]";
	}

}
