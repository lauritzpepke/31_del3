package game;

import java.sql.SQLOutput;
import java.util.Scanner;

/**
 * Klasse til user interface
 */
public class UI
{
	static int bestemAntalSpillere()
	{
		int spillerAntal = 0;
		Scanner input = new Scanner(System.in);

		System.out.println("Velkommen til Matador Junior af IOOuterActive");

		while (true)
		{
			System.out.println("Indtast hvor mange spillere i er fra 2-4.");
			while (input.hasNextInt()) //check at der er givet den korrekte værdi, inden vi gemmer i int.
			{
				spillerAntal = input.nextInt();

				if (spillerAntal <= 1) // for få spillere til at spille spillet.
				{
					System.out.println("I skal være mindst 2 spillere for at spille spillet.");
				}
				if (spillerAntal <=4) // best case, fortsæt programmet med det antal spillere.
				{
					System.out.println("Der gøres "+ spillerAntal + " biler klar til jer.");
					return spillerAntal;
				}
				if (spillerAntal > 4)
				{
					System.out.println("Der er desværre kun 4 biler.");
				}



			}
		}
	}

	/*
		for(int i = 1; i < 5; i++)
	{
		System.out.println("Velkommen spiller " + i + ".");

		System.out.println("");

		System.out.println("");

		spillerAntal++;

	}

	 */
}
