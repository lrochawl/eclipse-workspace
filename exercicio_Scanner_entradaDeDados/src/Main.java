import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nome, cidade, estado, rua, bairro;
		double idade;
		int numero;

		Scanner sc = new Scanner(System.in);
		nome   =  sc.nextLine();
		idade  = sc.nextDouble();
		sc.nextLine();
		cidade = sc.nextLine();
		estado = sc.nextLine();
		rua    = sc.nextLine();
		numero = sc.nextInt();
		sc.nextLine();
		bairro = sc.nextLine();
		

				System.out.println("******* Bom dia ************");
		System.out.println("Vamos atualizar seu cadastro....");
		System.out.println("Informe seu nome: " + nome);
		System.out.println("Informe sua idade: " + idade);
		System.out.printf("Qual sua cidade %s, seu estado %s, sua rua %s, o numero da casa %d e seu bairro %s", cidade, estado, rua, numero, bairro);

		sc.close();
	}

}
