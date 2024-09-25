//Escreva um método que recebe uma quantidade de minutos e retorna o equivalente em horas e minutos.
//Por exemplo: 90 min = 1 hora e 30 minutos

package models;

public class Minuto {
	//declarando atributos
	private int min;
	
	//criando construtor
	public Minuto(int min){
		this.min = min;
	}
		
	//tras os valores
	public String getValue() {
		if(getHour() != 0) {
			return
				"Minuto(s): " + min + 
				"\n Hora(s): " + getHour() + " e " + getMinutosRestantes() + " min.";
		} else {
			return
				"Minuto(s): " + min + "\nAinda não completou uma hora.";				
		}
	}
	
	//funcao que converte de minutos para horas.
	public int getHour() {
		return
			min/60;
	}
	public int getMinutosRestantes() {
		return
			min%60;
	}
	
	

}
