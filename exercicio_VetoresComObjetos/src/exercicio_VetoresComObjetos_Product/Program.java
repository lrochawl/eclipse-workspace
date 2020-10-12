package exercicio_VetoresComObjetos_Product;

import java.util.Locale;
import java.util.Scanner;
import entities.Products;
public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantos produtos serão cadastrados: ");
		int n = sc.nextInt();
		
		Products[] vect = new Products[n];
		
		for(int i = 0; i<vect.length; i++) {
			System.out.printf("Nome do %dº produto: ", i + 1);
			sc.nextLine();
			String name = sc.nextLine();
			System.out.printf("Preço do %dº produto: ", i + 1);
			double price = sc.nextDouble();
			
			vect[i] = new Products(name, price);
		}
		
		double soma = 0.0;
		
		for(int i=0; i<vect.length; i++) {
			
			soma += vect[i].getPrice();
		}
		
		double precoMedio = soma / vect.length;
		
		System.out.printf("A média de preços é de: R$ %.2f", precoMedio);
		sc.close();
		
	}

}
