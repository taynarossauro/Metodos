

package models;

/* Essa função retorna o fatorial de número informado por parâmetro.
 * 
 * @author taynara
 * @version 1.0
 */

public class Fatorial {
	//Declarando variavel
	private int n;
	
	//Construtor da classe
	public Fatorial(int n){
		this.n = n;
	}
	
	//Método que fatora por meio de um for.
	public int fatoracao(){
		int a = 1;
		for(int i= 1;i>=n;i++) {
			a *= i;
		}
		return a;
	}
	
	// Getter para obter os valores.
	public String getValues() {
		return
			"Número usado como base: " + n +
			"\nFatorial: " + fatoracao();
	}
	
}
