package models;

/* Essa classe concatena 2 numeros que ela receber. 
 * 
 * @author taynara
 * @version 1.0
 */

public class Concatenar {
	//declarando atributos
	private int a, b;
	
	//Construtor da classe Concatenar
	public Concatenar(int a, int b){
		this.a = a;
		this.b = b;
	}
	
	//Método que retorna as informações.
	public String getInfo() {
		return
			"Os números base são: " + a + " e " + b +
			"\nO retorno concatenado é: " + concatena();
	}
	
	//Concatenando os inteiros que entraram
	public String concatena() {
		return
			Integer.toString(a) + Integer.toString(b);
	}
}
