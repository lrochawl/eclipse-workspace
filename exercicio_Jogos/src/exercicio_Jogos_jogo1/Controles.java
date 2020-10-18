package exercicio_Jogos_jogo1;

import java.util.Scanner;

public class Controles {

	private String name;
	private int palitinhosLim, jogadoresLim, palitinhos, jogadores, score, torneio, jogada, pontuacao;
	private int jogadoresQtDefault = 2;
	
	Scanner sc = new Scanner(System.in);

	public void setControlesAdmin(int senhaAdmin) {
		if (senhaAdmin == 2002) {
			System.out.println("\n ----- Administrador autenticado ------ \n"
					+ "Você pode fazer as seguintes alterações \n\n" 
					+ "1- Definir o limite de jogadores \n"
					+ "2- Definir o limite de palitinhos \n"
					+ "3- Definir a quantidade de jogadores da partida inicial \n"
					+ "4- Definir a quantidade de palitinhos dos jogadores da partida inicial \n"
					+ "5- Definir o score do jogador principal \n\n"
					+ "6- Definir o nome do jogador principal"
					+ "Selecione um das opções: ");
			
			int opcao = sc.nextInt();
		
		while(opcao < 6 ) {
			switch (opcao) {
			case 1:
				System.out.print("Opção 1 - Limite de Jogadores \n" 
								+ "Informe a opção de limete de jogadores: " );
			int	config1 = sc.nextInt();
			setJogadoresLim(config1);	
				break;
			case 2:
				System.out.print("Opção 2 - Limite de Palitinhos \n" 
								  + "Informe a opção de limete de palitinhos: " );
			int	config2 = sc.nextInt();
			setPalitinhosLim(config2);	
				break;
			case 3:
				System.out.print("Opção 3 - Quantidade de jogadores de inicio \n" 
								  + "Informe a quantidade inicial de jogadores: ");
			int	config3 = sc.nextInt();
			setJogadores(config3);
				break;
			case 4:
				System.out.print("Opção 4 - Quantidade de palitinhos de inicio \n" 
								  + "Informe a quantidade inicial de palitinhos: ");
			int	config4 = sc.nextInt();
			setPalitinhos(config4);
				break;
			case 5:
				System.out.print("Opção 5 - Definir score do jogador principal \n" 
								  + "Defina agora o score do jogador principal: ");
			int	config5 = sc.nextInt();
			setScore(config5);
				break;
			case 6:
				System.out.print("Opção 6 - Definir o nome do jogador principal \n" 
								  + "Defina nome do jogador principal: ");
			String	config6 = sc.nextLine();
			setName(config6);
				break;
			default:
				System.out.println("Parece que você escolheu uma opção desconhecida \n");

			}
		System.out.println(" --> Deseja realizar outras auterações (sim/nao) ");
		String confirma = sc.nextLine();
		char conf = confirma.charAt(0);
		if (conf == 's') {
			System.out.println("\n ----- Administrador autenticado ------ \n"
					+ "Você pode fazer as seguintes alterações \n\n" 
					+ "1- Definir o limite de jogadores \n"
					+ "2- Definir o limite de palitinhos \n"
					+ "3- Definir a quantidade de jogadores da partida inicial \n"
					+ "4- Definir a quantidade de palitinhos dos jogadores da partida inicial \n"
					+ "5- Definir o score do jogador principal \n\n"
					+ "6- Definir o nome do jogador principal"
					+ "Selecione um das opções: ");
			opcao = sc.nextInt();
		}
			}
		
		}
	}
	
	
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getScore() {
		return this.score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	
	public int getPalitinhos() {
		return this.palitinhos;
	}
	public void setPalitinhos(int palitinhos) {
		this.palitinhos = palitinhos;
	}
	
	public int getJogadores() {
		return this.jogadores;
	}
	public void setJogadores(int jogadores) {
		this.jogadores = jogadores;
	}
	
	public int getJogadoresLim() {
		return this.jogadoresLim;
	}
	public void setJogadoresLim(int jogadoresLim) {
		this.jogadoresLim = jogadoresLim;
	}
	
	public int getPalitinhosLim() {
		return this.palitinhosLim;
	}
	public void setPalitinhosLim(int palitinhosLim) {
		this.palitinhosLim = palitinhosLim;
	}
	
	public int getJogadoresQtDefault() {
		return this.jogadoresQtDefault;
	}
	
}
