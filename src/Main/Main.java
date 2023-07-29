package Main;

import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		String produto1 = "Computer";
		String produto2 = "Office desk";
		
		int idade = 30;
		int codigo = 5290;
		char gênero = 'F';
		
		double preco1 = 2100.0;
		double preco2 = 650.50;
		double medida = 53.234567;
		 
		System.out.println("Produto:");
		System.out.printf("O Preço do %s é $%.2f%n", produto1, preco1);
		System.out.printf("O preço do %s é $%.2f%n%n", produto2, preco2);
		System.out.printf("Registro: %d anos, o codigo é %d e Gênero %s%n%n", idade, codigo, gênero);
		System.out.printf("Medido em oito casas decimais: %.8f%n",medida);
		System.out.printf("Medida em 3 casas decimas: %.3f%n",medida);
		System.out.printf("Preço Decimal em US: %3f",medida);
		Locale.setDefault(Locale.US);
		
		
		
	
		
		
				
			
				
				
				
				
		
		
		
		
		
		
		
		
		
		
	
		
		
	}

}
