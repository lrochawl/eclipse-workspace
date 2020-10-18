package exercicio_Jogos_jogo1;

import java.util.Scanner;

public class Palitinhos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Controles control = new Controles();

		System.out.println(" --------- Bem vindo ao jogo dos palitinhos ------------");

		System.out.print("Qual seu nome? ");
		String jogadorPrincipal = sc.nextLine();
		try {
			Welcome.welcome(jogadorPrincipal);
			System.out.print("Você comfirma que é o administrador do sistema? (sim/nao)");
			String confirmaAdm = sc.nextLine();
			char confirmaAd = confirmaAdm.charAt(0);
			if (confirmaAd == 's') {
				System.out.println("\n Ok, agora você precisa autenticar-se \n");
				System.out.print("Digite sua senha: ");
				int senhaAdmin = sc.nextInt();
				int tentativas = 1;
				while (senhaAdmin != 2002) {
					if (tentativas < 4) {
						System.out.println("Erro de autenticação, senha inválida " + tentativas + "/3");
						System.out.println(" Digite a senha novamente: ");
						senhaAdmin = sc.nextInt();
					} else {
						System.out.println("xxxxxxx Senha bloqueada xxxxx");
					}
					tentativas++;
				}
				
				
				
			}
		} catch (RuntimeException e) {
			System.out.println(e.getMessage());
		}


		try {
			GeraJogadores.criaJogadores(control.getJogadoresQtDefault(), jogadorPrincipal);

			for (String jogador : GeraJogadores.criaJogadores(control.getJogadoresQtDefault(), jogadorPrincipal)) {
				System.out.println(jogador);
			}

		} catch (RuntimeException e) {
			System.out.println(e.getMessage());
		}
		System.out.println();

		System.out.print("Você sabe as regras do jogo? (sim/nao) ");
		String rRegras = sc.next();
		char respostaRegras = rRegras.charAt(0);

		try {
			Regras.defineRegras(respostaRegras);
		} catch (RuntimeException e) {

			System.out.println(e.getMessage());

		}

		sc.close();

	}

}
