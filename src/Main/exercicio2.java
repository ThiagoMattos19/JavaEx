package Main;

import java.util.Locale;

import java.util.Scanner;

public class exercicio2 {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double pi = 3.14159;
		double r = sc.nextDouble();
		double area;
		
		area = pi * r * r;
		
	    
	    
	    System.out.printf("A=%.4f%n" ,area);
	    
		
		
		
				
		
		
		

		sc.close();

	}

}
