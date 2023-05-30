import java.util.Scanner;



public class arvauspeli {



	public static void main(String[] args) {

		

		String nimi1 = "Linda";

		String nimi2 = "Erkki";

		String nimi3 = "Pekka";

		String nimi4 = "Outi";

		String vastaus;

		Scanner in = new Scanner(System.in);

		

			System.out.println("Tervetuloa arvauspeliin!");

			System.out.println("Tehtävänäsi on arvata nimi");

			

			int arvauksienMäärä = 0;

			

		do {

		

		System.out.println("Kirjoita nyt veikkauksesi tähän");

		vastaus = in.nextLine();

		arvauksienMäärä++;

			

			

			

		

			

			

		if(vastaus.equals(nimi1)) {

			System.out.println("Arvasit oikein");

			System.out.println("Arvauksienmäärä=" + arvauksienMäärä);

			

		}

			

		if(vastaus.equals(nimi2)) {

			System.out.println("Arvasit oikein");

			System.out.println("Arvauksienmäärä=" + arvauksienMäärä);

			

		}

		if(vastaus.equals(nimi3)) {

			System.out.println("Arvasit oikein");

			System.out.println("Arvauksienmäärä =" + arvauksienMäärä);

			

		}

		if(vastaus.equals(nimi4)) {

			System.out.println("Arvasit oikein");

			System.out.println("Arvauksienmäärä =" + arvauksienMäärä);

			

		}

		

		else if (vastaus.equals("nimi")){

			System.out.println("Arvasit väärin");

			System.out.println("Yritä uudelleen");

			System.out.println("Arvauksienmäärä =" + arvauksienMäärä);

		}

		

			System.out.println("Arvauksienmäärä=" + arvauksienMäärä);

			System.out.println("Kirjoita k jatkaaksesi ja loppu lopettaaksesi");

			vastaus = in.nextLine();

		

			

}while  (vastaus.equals("k"));

	}



}