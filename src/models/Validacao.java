package models;

/* Classe que valida se um número é positivo ou negativo
 * 
 * @author taynara
 * @version 1.0
 */
public class Validacao {
	// Declarando atributos.
	private int a;
	
	// Construtor.
	public Validacao(int a) {
		this.a = a;
	}
	
	// Getter que retorna as informações.
	public String getNum() {
		return
			"Número base: " + a +
			"\nPositivo ou Negativo: " + numValidate();
	}
	
	//Valida se o inteiro é positivo ou negativo.
	public String numValidate() {
		if(a >= 0) {
			return "Positivo";
		} else
			return "Negativo";
	}
}
