import java.util.*;

	

public class Lucky7 {

	public static void main (String args[]) {

			Random random = new Random();

			Scanner console = new Scanner (System.in);

			  Scanner readinput = new Scanner(System.in);

			

			

			int input;

			int rahani;

			int Slot1;

			int Slot2;

			int Slot3;

			



			

			 

			System.out.println("PELIKONE");

			System.out.println("1 pyöräytys = 1 merkki");

			

			System.out.println("Syötä haluamasi pelimerkkejen määrä");

				rahani = console.nextInt();

				System.out.println("Rahasi:" + rahani);

				

				do {

			

				Slot1 = random.nextInt(9) + 1;

				Slot2 = random.nextInt(9) + 1;

				Slot3 = random.nextInt(9) + 1;

				

				System.out.println ("-------------");

				System.out.println ("| " +  Slot1 + " | " + Slot2 + " | " + Slot3 + " |");	

				System.out.println ("-------------");

				

				if((Slot1 == 7)|| (Slot2 == 7)||(Slot3 == 7) ) {

					System.out.println("VOITI 10 EUROA");

					rahani += 9;

				System.out.println("Rahasi:" + rahani);

				}

				

				

				else if ((Slot1 <= 7)|| (Slot2 <= 7)||(Slot3 <= 7) || (Slot1 >= 7)|| (Slot2 >= 7)||(Slot3 >= 7)  ) {

					System.out.println("HÄVISIT");

					rahani -= 1;

					System.out.println("Rahasi:" + rahani);

					

				}

				System.out.println("Kirjoita 7 ja paina enter jatkaaksesi");

				System.out.println("Kirjoita 0 ja paina enter lopettaaksesi");

				input = console.nextInt();

				

			}while (input == 7);

			

}

}