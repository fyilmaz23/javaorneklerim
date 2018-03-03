package paket1;

import java.util.Scanner;

public class st_class {

	private static Scanner input;

	public static void main(String[] args) {

		//Hesap Makinesi Giriþ
		hesapmakinesi();
	}

	private static void hesapmakinesi() {
		input = new Scanner(System.in);
		byte islem = 1;
		System.out.println("1.Sayýyý Giriniz");
		byte sayi1 = input.nextByte();

		System.out.println("2.Sayýyý Giriniz");
		byte sayi2 = input.nextByte();

		System.out.println("1.Sayý= " + sayi1);
		System.out.println("2.Sayý= " + sayi2);

		System.out.println("\n\n\nToplama için 1 \nÇýkarma için 2 \nÇarpma Ýçin 3 \nBölme için 4 \n");
		while (islem != 0) {
			islem = input.nextByte();

			if (islem == 1)
				System.out.println("2 sayýnýn Toplamý: " + (sayi1 + sayi2));
			else if (islem == 2)
				System.out.println("2 Sayýnýn Farký: " + (sayi1 - sayi2));
			else if (islem == 3)
				System.out.println("2 Sayýnýn çarpýmý: " + (sayi1 * sayi2));
			else if (islem == 4)
				System.out.println("2 sayýnýn bölümü: " + (sayi1 / sayi2));
			else if (islem == 0) {
				System.out.println("Çýkýþ Yapýlýyor..");
				break;
			} else
				System.out.println("Hatalý tuþlama yaptýnýz");
			System.out.println("\n\nToplama için 1 \nÇýkarma için 2 \nÇarpma Ýçin 3 \nBölme için 4 \nÇýkýþ için 0\n");

		}

		System.out.println("Çýkýþ Baþarýyla Tamamlandý.");

	}

}
