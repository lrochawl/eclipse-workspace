package exercicio_VetoresComObjetos_Product;

import java.util.Locale;
import java.util.Scanner;
import entities.Products;
public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantos produtos ser�o cadastrados: ");
		int n = sc.nextInt();
		
		Products[] vect = new Products[n];
		
		for(int i = 0; i<n; i++) {
			System.out.printf("Nome do %d� produto: ", i + 1);
			sc.nextLine();
			String name = sc.nextLine();
			System.out.printf("Pre�o do %d� produto: ", i + 1);
			double price = sc.nextDouble();
			
			vect[i] = new Products(name, price);
		}
		
		double soma = 0.0;
		
		for(int i=0; i<n; i++) {
			
			soma += vect[i].getPrice();
		}
		
		double precoMedio = soma / n;
		
		System.out.println("A m�dia de pre�os � de: R$ " + precoMedio);
		sc.close();
		
	}

}
