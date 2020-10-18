package exercicio_Jogos_jogo1;

import java.util.ArrayList;
import java.util.List;

public class GeraJogadores {
	
	public static List<String> criaJogadores(int jogadoresQT, String jogadorPrincipal) {
		List<String> jogadores = new ArrayList<>();
		try {
			Regras.validaJogadores(jogadoresQT);
			jogadores.add("Estes serão os nomes dos jogadores desta jogada");
		for(int i = 1; i < jogadoresQT; i++) {
			jogadores.add(String.format(" ==> Jogador %d", i));
			
		}
		jogadores.add(" ==> Jogador " + jogadorPrincipal);
		
		}catch (RuntimeException e) {
			jogadores.add("Ocorreu um erro ao definir a quantidade de jogadores ");
			jogadores.add("Parece que a quantidade de jogadores é superior a quantidade permitida");
		}
		
		return jogadores;
		
		
	}
	

}
