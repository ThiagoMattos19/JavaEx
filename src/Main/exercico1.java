package Main;

import java.util.Scanner;

public class exercico1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite o primeiro número:");
		int x = sc.nextInt();
		System.out.println("Digite o segundo número:");
		int y = sc.nextInt();
		
		int soma = x + y;
		
		System.out.println("SOMA = " + soma);
		
		sc.close();

	}

}
