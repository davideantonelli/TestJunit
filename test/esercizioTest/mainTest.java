package esercizioTest;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.Test;

class mainTest {
	
	@Test
	void test() {
		Sommatoria somma = new Sommatoria();
		somma.setAddendo1(1);
		somma.setAddendo2(2);
		assertEquals("Somma dovrebbe essere ",3,somma.somma());
		
	}

}
