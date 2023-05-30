public class PaaIkkuna {



	public static void main(String[] args) {

		

		pesukone pesukone1 = new pesukone("Whirlpool","AWE6100",true,5);

		pesukone1.printData();

	}



}//End of PaaIkkuna



class pesukone

{

	

	public String merkki;

	public String malli;

	public int täyttömäärä;

	public boolean paalla;

	//Nämä arvot ovat LUOKKA pesukoneelle eli ns. pohjapiirrustus.

	//Kun arvot määrittää saadaan olio ja kun arvot määritetään uudestaan tulee uusi olio.

	

	public pesukone(String merkinNimi)

	{

		paalla=false;

		merkki=merkinNimi;

	}

	

	public pesukone(String merkinNimi,String Malli, boolean onkoPesukonePaalla, int taytto)

	{

		merkki = merkinNimi;

		malli = Malli;

		paalla = onkoPesukonePaalla;

		täyttömäärä = taytto;

	}

	

	public void start()

	{

		paalla = true;

	}

	

	public void shutdown()

	{

		paalla = false;

	}

	

	public void printData()

	{

		System.out.println("Pesukone");

		System.out.println("Merkki: " + merkki);

		System.out.println("Malli: " + malli);

		System.out.println("Koneessa on pyykkiä n." + täyttömäärä + "kg");

		

		if (paalla==true)

		{

			System.out.println("Pesukone on tällä hetkellä päällä");

			}

		else {

			System.out.println("Pesukone ei ole tällä hetkellä päällä");

		}

	}

	



}