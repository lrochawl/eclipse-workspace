package exercicio_Jogos_jogo1;

import java.util.ArrayList;
import java.util.List;

public class Welcome {
	
	public static List<String> welcome(String nome) {
		
		List<String> boasVindas = new ArrayList<String>();
		
		if(nome.equals("administrador")) {
			
		}else {
			
			throw new RuntimeException( "\n\n======= Ol� "+ nome +" seja bem vindo ao jogo dos palitinhos =========\n"
										+ "Voc� vai iniciar o campeonato jogando com dois advers�rios\n"
										+ "Voc� e seus advers�rios poder�o escolher inicialmente at� dois palitinhos\n"
										+ "Na primeira rodada todos devem vir pelo menos com um palitinho, leve isso em considera��o na hora de contar o total de palitinos do jogo \n\n");
		}
		
		
		
		return boasVindas;
	}

}
