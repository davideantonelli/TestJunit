package esercizioTest;

public class Sommatoria {
	private int addendo1,addendo2;
	
	public int somma () {
		
			return addendo1+addendo2;
		
	}
	public void setAddendo1(int val1) {
		this.addendo1=val1;
		
	}
	public void setAddendo2(int val2) {
		this.addendo2=val2;
	}
	
	public int getAddendo1() {
		
		return this.addendo1;
		
	}
	public int getAddendo2() {
		return this.addendo2;
	}
}