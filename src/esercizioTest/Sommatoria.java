package esercizioTest;



/** *
 * la classe è stata scritta da @author Davide
 *La classe non fa altro che prendere due parametri, li somma tra loro ottendendo così la somma 
 
 */
public class Sommatoria {
	private int addendo1,addendo2;
	/**
	 
	 * Somma di addendo1 e addendo2
	 * @return la somma dei due addendi
	 **/
	  
	 
	public int somma () {
		
			return addendo1+addendo2;
		
	}
	/**
	 * Imposta il valore della variabile privata addendo1
	 * @param val1 è il primo valore addendo
	 */
	public void setAddendo1(int val1) {
		
		this.addendo1=val1;
		
	}
	/**
	 * Imposta il valore della variabile privata addendo2
	 * @param val2 è il secondo addendo
	 */
	public void setAddendo2(int val2) {
				
		this.addendo2=val2;
		
	}
	/**
	 * restituisce il valore di addendo1
	 * @return ritorna il valore di addendo1
	 */
	public int getAddendo1() {
		
		return this.addendo1;
		
	}
	/**
	 * restituisce il valore di addendo2
	 * @return ritorna il valore di addendo2
	 */
	public int getAddendo2() {
		
		return this.addendo2;
	}
}