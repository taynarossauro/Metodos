package models;

/* Essa classe calcula a média artmetica 
 * baseado nos 3 numeros que ela receber. 
 * 
 * @author taynara
 * @version 1.0
 */
public class Aritmetica {
	
	//declarar atributos
	private int a, b, c;
	
	//criar construtor
	public Aritmetica(int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	//Método que retorna as informações e valores.
	public String getNum() {
		return
			"Os números base são: " + a + ", " + b + ", " + c +
			"\nA média aritmética desses números é: " + mediaAritmetica();
	}
	
	//Método que efetua cálculo de média
	public double mediaAritmetica() {
		return
		a + b/c;
	}
}
