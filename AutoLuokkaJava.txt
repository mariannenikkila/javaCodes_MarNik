import java.util.Scanner;



public class Auto {



	public static void main(String[] args) {

	

		//Autoo Autoo = new Autoo("Nissan","ABC",9);

		//Autoo.Auto1olio();

		

		Autoo Autoo2 = new Autoo("Ferrari","CBA",11);

		Autoo2.Auto1olio();



	}//Mainin loppu



}//Auto luokan loppu



class Autoo

{

	

	public String merkki;

	public String malli;

	public int bensanMaara;

	

	public Autoo(String merkinNimi,String Malli, int bensa)

	{

		merkki = merkinNimi;

		malli = Malli;

		bensanMaara = bensa;

	

	}



	public void Jarruta()

	{

		System.out.println("Auto jarruttaa");

	}

	

	public void Kiihdyta()

	{

		if (bensanMaara >= 8) {

		

		System.out.println("Auto kiihtyy");

		bensanMaara = (bensanMaara - 1);

		}

		else {

			System.out.println("Sinulla ei ole bensaa tarpeeksi kiihdyttääksesi");

		}

	}

	

	public void NaytaTiedot()

	{

		System.out.print(merkki);

		System.out.println(" "+malli);

		System.out.println("BensaTilanne = " + bensanMaara + " Litraa");

	}

		

	public void Auto1olio()

	{

		NaytaTiedot();

		Kiihdyta();

		NaytaTiedot();

		Tankkaa();

	

	}

	public void Tankkaa()

	{

		int tankattu;

		Scanner console = new Scanner (System.in);

		

		System.out.println("Syötä tankattava määrä");

		tankattu = console.nextInt();

		int yht = tankattu + bensanMaara;

	System.out.println("Bensan määrä tankkauksen jälkeen " + yht);

	}

	



	

}//Auto1 luokan loppu