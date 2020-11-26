package game;

import java.sql.SQLOutput;
import java.util.Scanner;

/**
 * Klasse til user interface
 */
public class UI
{
	int bestemAntalSpillere()
	{
		int spillerAntal;
		Scanner input = new Scanner(System.in);

		System.out.println("Velkommen til Matador Junior af IOOuterActive");


		for(int i = 1; i < 5; i++)
		{
			System.out.println("Velkommen spiller " + i + ".");

			System.out.println("");

			System.out.println("");


		}

		return spillerAntal;
	}
}
