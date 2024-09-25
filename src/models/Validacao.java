package models;

public class Validacao {
	//declarando atributos
	private int a;
	
	// construtor
	public Validacao(int a) {
		this.a = a;
	}
	
	
	public String getNum() {
		return
			"Número base: " + a +
			"\nPositivo ou Negativo: " + numValidate();
	}
	
	public String numValidate() {
		if(a >= 0) {
			return "Positivo";
		} else
			return "Negativo";
	}
}
