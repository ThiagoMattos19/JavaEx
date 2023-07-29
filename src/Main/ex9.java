package Main;

import java.util.Scanner;

public class ex9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A, B;

		A = sc.nextInt();
		B = sc.nextInt();
		
		double x;
		
		if ( A % B == 0 || B % A == 0) {
			System.out.println("Sao multiplos");
			
		}
		else {
			System.out.println("nao sao multiplos");
		}

	}

}
