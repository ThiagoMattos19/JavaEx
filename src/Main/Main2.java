package Main;

import java.util.Locale;
import java.util.Scanner;

public class Main2 {
	
	
	public static void main (String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite os dados!");
		
		
		String x;
		int y;
		double z;
		x = sc.next();
		y = sc.nextInt();
		z = sc.nextDouble();
			
		System.out.println("dados digitados");
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
				
		sc.close();
		
		
		
		
	}

}
