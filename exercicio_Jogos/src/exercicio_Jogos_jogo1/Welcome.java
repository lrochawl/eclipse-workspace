package exercicio_Jogos_jogo1;

import java.util.ArrayList;
import java.util.List;

public class Welcome {
	
	public static List<String> welcome(String nome) {
		
		List<String> boasVindas = new ArrayList<String>();
		
		if(nome.equals("administrador")) {
			
		}else {
			
			throw new RuntimeException( "\n\n======= Olá "+ nome +" seja bem vindo ao jogo dos palitinhos =========\n"
										+ "Você vai iniciar o campeonato jogando com dois adversários\n"
										+ "Você e seus adversários poderão escolher inicialmente até dois palitinhos\n"
										+ "Na primeira rodada todos devem vir pelo menos com um palitinho, leve isso em consideração na hora de contar o total de palitinos do jogo \n\n");
		}
		
		
		
		return boasVindas;
	}

}
