package Main;

import java.util.Locale;
import java.util.Scanner;

public class ex4 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int f, h;
		double valorh, salario;
		
		
		
		f = sc.nextInt();
		h = sc.nextInt();
		valorh = sc.nextDouble();
		
		
		salario = valorh * h;
		
		System.out.println("NUMBER = " +f);
		System.out.printf("SALARY = U$ %.2f%n " ,salario);
		
		

		sc.close();

	}

}
