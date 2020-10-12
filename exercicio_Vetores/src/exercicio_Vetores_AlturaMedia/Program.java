package exercicio_Vetores_AlturaMedia;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantas pessoas serão analisadas: ");
		int n = sc.nextInt();
		
		double[] vect = new double[n];
		
		for(int i=0; i<n; i++) {
			
			System.out.printf("Qual a altura da %d pessoa: ", i + 1);
			vect[i] = sc.nextDouble();
			
			
		}
		
		double soma = 0.0;
		for(int i=0; i<n; i++) {
		soma += vect[i];
				
		}	
		
		double alturaMedia = soma / n;
		
		System.out.printf("A altura média é: %.2f", alturaMedia);
		sc.close();

	}

}
