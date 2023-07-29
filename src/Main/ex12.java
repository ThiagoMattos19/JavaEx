package Main;

import java.util.Locale;

import java.util.Scanner;

public class ex12 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double a;

		a = sc.nextDouble();

		if (a < 0 || a > 100) {
			System.out.println(" fora do intervalo");
		}
		else if( a <= 25.00) {
			System.out.println("Intervalo [0,25]");
			
		}
		else if (a <= 50.00) {
			System.out.println("Intervalo (25,50]");
		}
		else if ( a <= 75.00) {
			System.out.println("Intervalo (50,75]");
		}
		else {
			System.out.println("Intervalo (75, 100]");
			
		}
		sc.close();
		
			

	}

}
