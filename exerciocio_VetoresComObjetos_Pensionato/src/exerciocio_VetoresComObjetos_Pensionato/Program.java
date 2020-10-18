package exerciocio_VetoresComObjetos_Pensionato;

import java.util.Locale;
import java.util.Scanner;
import entities.CadastraQuarto;
public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		
		
		CadastraQuarto[] vect = new CadastraQuarto[10];
		System.out.print("Opa, Quantos quartos serão ocupados? ");
		int quartos = sc.nextInt();
		
		for(int i=0; i<quartos;i++) {
			
			System.out.printf("******** Cadastrando o %dº aluno *************%n", 1+i);
			System.out.printf("NOME: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.printf("E-MAIL: ");
			String email =  sc.nextLine();
			System.out.printf("QUARTO: ");
			int quarto = sc.nextInt();
			quarto -= 1;
			while(quarto > 10 || vect[quarto] != null) {
				System.out.printf("Desculpe temos apenas dez quartos diponiveis: %n");
				System.out.printf("Escolha novamente o número do quarto: %n");
				quarto = sc.nextInt();
			}
			vect[quarto] = new CadastraQuarto(name, email);
			
		}
		
		for(int i=0; i<vect.length; i++) {
			if(vect[i] != null) {
			System.out.println("\n****** Dados dos alunos cadastrados **********\n");
			System.out.printf("NOME: %s%n", vect[i].getName());
			System.out.printf("E-MAIL: %s%n", vect[i].getEmail());
			System.out.printf("QUARTO: %d%n", i+1);
			}
		}
	
	sc.close();
	}

}
