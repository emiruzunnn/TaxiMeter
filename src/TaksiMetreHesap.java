import java.util.Scanner;

public class TaksiMetreHesap {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		double kmbasiucret = 4;
		double acilisucreti = 15;
		double kisamesafe = 40;
		
		System.out.print("Kac Km Yol Gidildi? : ");
		double gidilenkm = scanner.nextDouble();
		double toplamucret = (acilisucreti + gidilenkm * kmbasiucret);
		
		if (toplamucret <= 40) {
			System.out.println("Toplam Tutar: 40 TL (Kisa Mesafe Ucreti)");
		} else {
			System.out.println("Odenilecek Ucret: " + toplamucret + "TL");
		}
		

	}

}
