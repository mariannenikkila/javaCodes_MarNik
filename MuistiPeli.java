import java.util.Random;

import java.util.Scanner;



public class muistipeli {



	public static void main(String[] args) {

		

		

		Random random = new Random();

		Scanner console = new Scanner (System.in);

		

		

		int[] peliNumerot = new int [7];

		int[] arvatutNumerot = new int [7];

		int i;

		

		System.out.println("Paina nämä numerot muistiin");

		

		for (i = 0; i < peliNumerot.length; i++)

		{

			peliNumerot[i] = random.nextInt(5)+1;

			System.out.print(peliNumerot[i] + "  ");

		}

		try

		{

			Thread.sleep(3000);

		}

		catch(InterruptedException ex)

		{

			Thread.currentThread().interrupt();	

		}

		

		for ( i = 0; i < 40; ++i) System.out.println();

		

		for (i = 0; i < arvatutNumerot.length; i++)

		{

			System.out.println("syötä " + (i+1) + ". numero");

			arvatutNumerot[i] = Integer.parseInt(console.nextLine());

		}

		

		System.out.println("Oikeat numerot ");

		for (i = 0; i < peliNumerot.length; i++)

		{

			System.out.print(" " + peliNumerot[i]);

		}



		System.out.println(" ");

		System.out.println("Sinun numerot ");

		for (i = 0; i < arvatutNumerot.length; i++)

		{

			

			System.out.print(" " + arvatutNumerot[i]);		

		}

		

		

		int j = 0;

		for ( int k = 0;k<peliNumerot.length; k++)

		{

			if (peliNumerot[k] == arvatutNumerot[k]) {

				j++;

			}

		}System.out.println();

	System.out.println( " "+ j+"/7 oikein");

	int prosentti= j*100/7;

	

	System.out.println( " " + prosentti + "% oikein");

	

	}

	

	



}

