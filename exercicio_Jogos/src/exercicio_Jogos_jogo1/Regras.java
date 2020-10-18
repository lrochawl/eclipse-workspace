package exercicio_Jogos_jogo1;


public class Regras {
	
	private char resposta;
	
	public static void defineRegras(char respostaRegras) {
		if(respostaRegras == 'n') {
			throw new RuntimeException(" \n-------- Aqui est�o as regras do jogo ----------------\n\n"
										+" 1� Permitido at� cinco jogadores por torneio\n"
										+" 2� Primeira jogada n�o pode ser zero palitinhos\n"
										+" 3� Quem acertar a quantidade total de palitinos ganha a partida\n"
										+" 4� Se n�o houver ganhadores � iniciada nova partida at� que um dos jogadores acerte a quantidade jotal de palitinhos\n"
										+" 5� O jogador que acertar a quantidade de palitinhos na primeira rodada ganha apenas um ponto e os proximos ganha o dobro de pontos do anterior\n\n"
										+ "\n-Est� pronto para jogar? ");
		}else {
		
		throw new RuntimeException(" --------- Ok, ent�o vamos jogar -------------");
		
		}
		
	}
	
	public static void validaJogadores(int jogadoresQT) {
		
		if(jogadoresQT > 5) {
			throw new RuntimeException("Ocorreu um erro ao definir a quantidade de jogadores \n"
									   + "Parece que a quantidade de jogadores � superior a quantidade permitida \n");
		}
		
	}


	
	public void setResposta(char resposta) {
		this.resposta = resposta;
	}
	
	public char getResposta() {
		return this.resposta;
	}
	
	
}
