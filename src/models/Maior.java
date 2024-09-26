
package models;

/* Essa Função recebe três números e retorna o maior.
 * 
 * @author taynara
 * @version 1.0
 */

public class Maior {
	// Declarando atributos
	private int a, b;
	
	// Construtor da classe
	public Maior(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	// Getter retornando informações
	public String getInfo() {
		return
		"Os números base são: " + a + " e " + b + 
		"\n " + maiorMenor();
	}
	
	// Método que valida qual é o maior e qual é o menor.
	// @return o maior número.
	public String maiorMenor() {
		if(a > b) {
			return "O maior entre esses números é: " + a;
		} else { 
			return "O maior entre esses números é: " + b;
		}
	}
	
}
