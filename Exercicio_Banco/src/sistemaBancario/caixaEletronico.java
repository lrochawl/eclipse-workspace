package sistemaBancario;

import java.util.Locale;
import java.util.Scanner;
import util.CadastraConta;

public class caixaEletronico {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" ---------- Sistema Banc�rio ----------");
		System.out.println();
		System.out.println(" $$$$$$$ Abra sua conta $$$$$$$$$");
		System.out.print("Para prosseguir informe seu nome: ");
		String name = sc.nextLine();
		System.out.print("\n*Para iniciarmos a abertura da sua conta � necessario que seja realizado um deposito inicial");
		System.out.println();
		System.out.printf("\nOl� %s deseja realizar agora seu deposito inicial? (sim/nao) ", name);
		String confirma = sc.next().toLowerCase();
		System.out.print("Qual ser� o valor do deposito? R$ ");
		double deposito = sc.nextDouble();
		CadastraConta conta = new CadastraConta(name, deposito);
		conta.setConfirma(confirma);
		conta.setMensagem("%n Deseja realizar nova opera��o? (sim/nao) ");
		String opcao = sc.next();
		
		if(opcao.equals("sim")) {
			conta.setMensagem("\nDigite 1 para depos�to e 2 para saque: ");
			int op = sc.nextInt();
			while(op > 0 && op < 4) {
				switch(op) {
					case 1:
						conta.setMensagem("\nOp��o 1: %nOp��o deposito selecionada\n");
						conta.setMensagem("Informe o valor do deposito: ");
						conta.setDeposito(sc.nextInt());
						conta.setMensagem("\nSALDO ATUAL: R$ " + String.format("%.2f", conta.getSaldo()));
						conta.setMensagem("\nE agora qual o proximo passo? \n");
						conta.setMensagem("\nFINALIZAR ou realizar outra OPERA��O? \n");
						conta.setMensagem("\nDigite o numero da opera��o ou 4 para finalizar: ");
						op = sc.nextInt();
						break;
					case 2:
						conta.setMensagem("\nOp��o 2: %nOp��o saque selecionada \n");
						conta.setMensagem("Informe o valor do saque: ");
						conta.setSaque(sc.nextInt());
						conta.setMensagem("\nSALDO ATUAL: R$ " + String.format("%.2f", conta.getSaldo()));
						conta.setMensagem("\n\nE agora qual o proximo passo? \n");
						conta.setMensagem("\nFINALIZAR ou realizar outra OPERA��O? \n");
						conta.setMensagem("\nDigite o numero da opera��o ou 4 para finalizar: ");
						op = sc.nextInt();
						break;
					case 3:
							conta.setMensagem("\nOp��o 3: %nVoc� est� prestes a realizar uma atualiza��o cadastral \n");
							conta.setMensagem("Para continuar digite sua senha: ");
							int senha  = conta.verificaSenha(sc.nextInt());
							
							if(senha == 1) {
								conta.setMensagem("\n**** Acesso permitido :) **** \n \n");
								conta.setMensagem("Campos diponiveis para altera��o: (Nome) \n");
								conta.setMensagem("\nInforme o novo nome para concluir a altera��o: ");
								sc.nextLine();
								name = sc.nextLine();
								conta.setName(name);
								conta.getDadosConta();
								conta.setMensagem("\nE agora qual o proximo passo? \n");
								conta.setMensagem("\nFINALIZAR ou realizar outra OPERA��O? \n");
								conta.setMensagem("\nDigite o numero da opera��o ou 4 para finalizar: ");
								op = sc.nextInt();
							}else {
								conta.setMensagem("**** Acesso negado :( **** \n \n");
							}
						break;
					default:
						conta.setMensagem("Opera��o finalizada pelo usuario");
						break;
				}
		}
		
		}else {
			
			conta.setMensagem("xxxxxxxxx Op��o invalida! xxxxxxxxxxx\n");
			
		}
		conta.setMensagem("Opera��o finalizada pelo usuario");
		
		System.out.println();
		
		sc.close();
		
	}

}
