package Main;

import java.util.Locale;

import java.util.Scanner;

public class ex11 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int codigo, quantidade;
		double valor;

		codigo = sc.nextInt();
		quantidade = sc.nextInt();

		if (codigo == 1) {
			valor = quantidade * 4.00;
		}
		else if (codigo == 2) {
			valor = quantidade * 4.50;
		}
		else if (codigo == 3){
			valor = quantidade * 5.00;
		}
		else if (codigo == 4){
			valor = quantidade * 2.00;
		}
		else {
			codigo = 5;
			valor = quantidade * 1.50;
		}
		
		
		System.out.printf("Total: R$%.2f%n " ,valor);
		
		sc.close();
			
			
			
			
			
			
		}
		
		

	}


