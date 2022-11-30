package tr.edu.medipol.yova;

import static org.junit.Assert.*;

import org.junit.Test;

public class HesaplamaTest {

	@Test
	public void testToplama() {
		int sayi1 = 42;
		int sayi2 = 28;
		Hesaplama h = new Hesaplama();
		
		long gerceklesen = h.toplama(sayi1, sayi2);
		
		assertEquals(70, gerceklesen);
	}

	@Test
	public void testCikarma() {
		int sayi1 = 10;
		int sayi2 = 2;
		Hesaplama h = new Hesaplama();
		
		long gerceklesen = h.cikarma(sayi1, sayi2);
		
		assertEquals(8, gerceklesen);
	}

	@Test
	public void testCarpma() {
		int sayi1 = 10;
		int sayi2 = 2;
		Hesaplama h = new Hesaplama();
		
		long gerceklesen = h.carpma(sayi1, sayi2);
		
		assertEquals(20, gerceklesen);
	}

	@Test
	public void testBolme() {
		int sayi1 = 10;
		int sayi2 = 2;
		Hesaplama h = new Hesaplama();
		
		long gerceklesen = h.bolme(sayi1, sayi2);
		
		assertEquals(5, gerceklesen);
	}

	
	
	
}
