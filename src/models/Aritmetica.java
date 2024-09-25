package models;

/* essa classe calcula a média artmetica 
 * baseado nos 3 numeros que ela receber. 
 * 
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
	
	public String getNum() {
		return
			"Os números base são: " + a + ", " + b + ", " + c +
			"\nA média aritmética desses números é: " + mediaAritmetica();
	}
	
	public double mediaAritmetica() {
		return
		a + b/c;
	}
}
