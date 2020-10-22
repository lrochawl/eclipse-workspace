package teste;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
public class Main {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
		
		System.out.println();
		Teste[] vect = new Teste[100];
		
		int cod = 0;
		System.out.println("Digite 0 para sair da aplica��o");
		cod = sc.nextInt();
		
		do {
			System.out.println("Digite o nome e telefone: ");
			sc.nextLine();
			String nome = sc.nextLine();
			int telefone = sc.nextInt();
			
			vect[cod++] = new Teste(nome, telefone);
			
			System.out.println("Digite 0 para sair da aplica��o");
			cod = sc.nextInt();
			
			if (cod == 99) {
			System.out.println("Numero maximo de contatos atingido ");
				cod = 0;
			}
			
		} while(cod != 0);
		
		sc.close();
		
		for (int i=0; i<vect.length; i++) {
			System.out.println(vect[i]);
			if(vect[i].nome.equals("lucas")) {
				System.out.println("Codigo: "+i+", "+vect[i]);
				
			}

		}
		
		
 		
	}

}
