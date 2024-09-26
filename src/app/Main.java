package app;

import models.*;

/*
 * Essa é a classe principal que instancia os objetos mencionados
 * nas classes em "models".
 * 
 * @author taynara
 * version 1.0
 */
public class Main {
	
	//Colocando valores direto no método
	static int fatoracao(int n){
		int a = 1;
		for(int i= 1;i<=n;i++) {
			a *= i;
		}
		return a;
	}
	
	public static void main(String[]args) {
		
			//criando objeto numero para validacao de negativo ou positivo
			Validacao NegPos = new Validacao(23);
			//printando os atributos e a validação de negativo ou positivo
			System.out.println(NegPos.getNum() + "\n");
			
			
			//criando objeto para média aritmética
			Aritmetica media = new Aritmetica(2, 2, 1);
			//printando os atributos e a média aritmética desses atributos.
			System.out.println(media.getNum() + "\n");
			
			//criando objeto maior menor
			Maior maior = new Maior(1, 2);
			//printando os atributos e qual e o maior entre eles.
			System.out.println(maior.getInfo() + "\n");
			
			//criando objeto concatenar
			Concatenar concat = new Concatenar(1, 2);
			//printando os atributos e a concatenação deles
			System.out.println(concat.getInfo() + "\n");
			
			//criando objeto minuto
			Minuto minut = new Minuto(6);
			//printando os minutos e sua conversao em horas
			System.out.println(minut.getValue() + "\n");
			
			//Escreva uma função que retorna o fatorial de número informado por parâmetro
			System.out.println(fatoracao(5));
			
			
	}
}
