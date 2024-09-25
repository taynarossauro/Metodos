//Escreva uma função que retorna o fatorial de número informado por parâmetro


package models;

public class Fatorial {
	//declarando variavel
	private int n;
	
	//criando construtor
	public Fatorial(int n){
		this.n = n;
	}
	
	public int fatoracao(){
		int a = 1;
		for(int i= 1;i>=n;i++) {
			a *= i;
		}
		return a;
	}
	
	//getter
	public String getValues() {
		return
			"Número usado como base: " + n +
			"\nFatorial: " + fatoracao();
	}
	
}
