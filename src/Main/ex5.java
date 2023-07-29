package Main;

import java.util.Locale;
import java.util.Scanner;

public class ex5 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		int peca1, peca2, n1, n2;
		double valor, valor1, valor2;
		
		
		
		peca1 = sc.nextInt();
		n1 = sc.nextInt();
		valor1 = sc.nextDouble();
			
		peca2 = sc.nextInt();
		n2 = sc.nextInt();
		valor2 = sc.nextDouble();
		
		valor = valor1 * n1  +  valor2 * n2;
		
		System.out.printf("VALOR A PAGAR: R$:%.2f%n" ,valor);
		
		sc.close();
		

	}

}
