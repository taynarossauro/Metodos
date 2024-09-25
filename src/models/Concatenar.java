//Escreva um método que recebe dois números, a e b, e retorna ab.


package models;

public class Concatenar {
	//declarando atributos
	private int a, b;
	
	public Concatenar(int a, int b){
		this.a = a;
		this.b = b;
	}
	
	public String getInfo() {
		return
			"Os números base são: " + a + " e " + b +
			"\nO retorno concatenado é: " + concatena();
	}
	
	public String concatena() {
		return
			Integer.toString(a) + Integer.toString(b);
	}
}
