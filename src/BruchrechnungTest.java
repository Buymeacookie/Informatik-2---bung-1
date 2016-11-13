import static org.junit.Assert.*;

import org.junit.Test;

public class BruchrechnungTest {


Bruchrechnung bruch1 = new Bruchrechnung(1,2);
Bruchrechnung bruch2 = new Bruchrechnung(1,2);
Bruchrechnung bruch3 = new Bruchrechnung();
Bruchrechnung bruch4 = new Bruchrechnung(3,6);
Bruchrechnung bruch5 = new Bruchrechnung(1,4);
	
	@Test
	public void testBruchrechnung() {
		assertEquals(1 ,bruch3.getNenner());
		assertEquals(1, bruch3.getZaehler());
	}

	@Test
	public void testBruchrechnungIntInt() {
		assertEquals(1 , bruch1.getZaehler());
		assertEquals(2 , bruch1.getNenner());
	}

	@Test
	public void testBruchAddition() {
		bruch1.bruchAddition(bruch2);
		assertEquals(1 , bruch1.getZaehler());
		assertEquals(1 , bruch1.getNenner());
	}

	@Test
	public void testBruchSubtraktion() {
		bruch1.bruchSubtraktion(bruch2);
		assertEquals(0 , bruch1.getZaehler());
		assertEquals(2 , bruch1.getNenner());
		
		
	}

	@Test
	public void testBruchMultiplikation() {
		bruch1.bruchMultiplikation(bruch2);
		assertEquals(1, bruch1.getZaehler());
		assertEquals(4, bruch1.getNenner());
	}

	@Test
	public void testBruchDivision() {
		bruch1.bruchDivision(bruch2);
		assertEquals(1, bruch1.getZaehler());
		assertEquals(1, bruch1.getNenner());
	}

	@Test
	public void testKuerzen() {
		bruch4.kuerzen();
		assertEquals(1, bruch4.getZaehler());
		assertEquals(2, bruch4.getNenner());
	}

}
