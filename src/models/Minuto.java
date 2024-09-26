package models;

/* Classe que recebe uma quantidade de minutos e retorna o equivalente em horas e minutos.
 * 
 * @author taynara
 * @version 1.0
 */
public class Minuto {
	//Declarar atributos
	private int min;
	
	//Construtor da classe
	public Minuto(int min){
		this.min = min;
	}
		
	// Getter que printa as informações/resultados
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
	
	//Método que converte de minutos para horas.
	public int getHour() {
		return
			min/60;
	}
	public int getMinutosRestantes() {
		return
			min%60;
	}

}
