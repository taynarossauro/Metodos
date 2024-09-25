/* 
 * Escreva um método que recebe três números e retorna o maior.
 */


package models;

public class Maior {
	//declarando atributos
	private int a, b;
	
	//iniciando construtor
	public Maior(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	//retornando informações 
	public String getInfo() {
		return
		"Os números base são: " + a + " e " + b + 
		"\n " + maiorMenor();
	}
	
	public String maiorMenor() {
		if(a > b) {
			return "O maior entre esses números é: " + a;
		} else { 
			return "O maior entre esses números é: " + b;
		}
	}
	
}
