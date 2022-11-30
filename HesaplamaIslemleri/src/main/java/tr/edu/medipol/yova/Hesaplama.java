package tr.edu.medipol.yova;

public class Hesaplama {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hesaplama h = new Hesaplama();
		long topla = h.toplama(42, 28);
		int cikar = h.cikarma(42, 28);
		int carp = h.carpma(5, 2);
		int bol = h.bolme(10, 2);
		System.out.println(topla);
		System.out.println(cikar);
		System.out.println(carp);
		System.out.println(bol);
		
	}
	
	long toplama(int sayi1, int sayi2) {
		long sonuc =(long) sayi1 + sayi2;
		return sonuc;
	}
	
	int cikarma(int sayi1, int sayi2) {
		int sonuc = sayi1 - sayi2;
		return sonuc;
	}
	
	int carpma(int sayi1, int sayi2) {
		int sonuc = sayi1 * sayi2;
		return sonuc;
	}
	
	int bolme(int sayi1, int sayi2) {
		int sonuc = sayi1 / sayi2;
		return sonuc;
	}
}
