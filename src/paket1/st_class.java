package paket1;

import java.util.Scanner;

public class st_class {

	private static Scanner input;

	public static void main(String[] args) {

		//Hesap Makinesi Giri�
		hesapmakinesi();
	}

	private static void hesapmakinesi() {
		input = new Scanner(System.in);
		byte islem = 1;
		System.out.println("1.Say�y� Giriniz");
		byte sayi1 = input.nextByte();

		System.out.println("2.Say�y� Giriniz");
		byte sayi2 = input.nextByte();

		System.out.println("1.Say�= " + sayi1);
		System.out.println("2.Say�= " + sayi2);

		System.out.println("\n\n\nToplama i�in 1 \n��karma i�in 2 \n�arpma ��in 3 \nB�lme i�in 4 \n");
		while (islem != 0) {
			islem = input.nextByte();

			if (islem == 1)
				System.out.println("2 say�n�n Toplam�: " + (sayi1 + sayi2));
			else if (islem == 2)
				System.out.println("2 Say�n�n Fark�: " + (sayi1 - sayi2));
			else if (islem == 3)
				System.out.println("2 Say�n�n �arp�m�: " + (sayi1 * sayi2));
			else if (islem == 4)
				System.out.println("2 say�n�n b�l�m�: " + (sayi1 / sayi2));
			else if (islem == 0) {
				System.out.println("��k�� Yap�l�yor..");
				break;
			} else
				System.out.println("Hatal� tu�lama yapt�n�z");
			System.out.println("\n\nToplama i�in 1 \n��karma i�in 2 \n�arpma ��in 3 \nB�lme i�in 4 \n��k�� i�in 0\n");

		}

		System.out.println("��k�� Ba�ar�yla Tamamland�.");

	}

}
