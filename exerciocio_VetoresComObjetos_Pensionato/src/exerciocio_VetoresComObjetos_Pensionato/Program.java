package exerciocio_VetoresComObjetos_Pensionato;

import java.util.Locale;
import java.util.Scanner;
import entities.CadastraQuarto;
public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Opa, Quantos quartos serão ocupados? ");
		int quartos = sc.nextInt();
		
		CadastraQuarto[] vect = new CadastraQuarto[quartos];
		
		for(int i=0; i<vect.length;i++) {
			
			System.out.printf("******** Cadastrando o %dº aluno *************%n", 1+i);
			System.out.printf("NOME: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.printf("E-MAIL: ");
			String email =  sc.nextLine();
			System.out.printf("QUARTO: ");
			int quarto = sc.nextInt();
			if(quarto > 10) {
				System.out.printf("Desculpe temos apenas dez quartos diponiveis: %n");
				System.out.printf("Escolha novamente o número do quarto: %n");
				quarto = sc.nextInt();
			}
			vect[i] = new CadastraQuarto(name, email, quarto);
			
		}
		
		for(int i=0; i<vect.length; i++) {
			System.out.printf("NOME: %s%n", vect[i].getName());
			System.out.printf("E-MAIL: %s%n", vect[i].getEmail());
			System.out.printf("QUARTO: %d%n", vect[i].getQuarto());
		}
	}

}
