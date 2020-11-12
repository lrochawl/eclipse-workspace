
package dinamica;
import bd.Cadastro;


public abstract class Regras extends Cadastro {
    
    
     
    public static String getRegras(int quantidade){
        
        if(quantidade == 0){
        return "\n-------- Aqui alguns termos utilizados no jogo ----------------\n"
            + "VIR DE LONA: Escolher zero palitinhos \n"
            + "PATO DO JOGO: Jogador que perdeu a ultima rodada \n"
            + "TORNEIO: È um conjunto da rodadas até a semi-final e final"
            + "RODADA: São as partidas realizadas no jogo entre o jogador e jogadores virtuais a fim de ganhar pontos e vencer seu jogador adversário ou um jogador virtual"
            + "\n\n------------------ Regras do Jogo ---------------------------------\n"
            +" 1º Primeira jogada não pode vir de lona \n"
            +" 2º Os proximos jogadores não podem repetir palpites ja utilizados pelos jogadores anteriores na partida"
            +" 3º Quem acertar a quantidade total de palitinos ganha a partida \n"
            +" 4º Se não houver ganhadores é iniciada nova partida até que um dos jogadores acerte a quantidade total de palitinhos do jogo\n"
            +" 5º O jogador que acertar a quantidade de palitinhos na primeira rodada ganha apenas um ponto e nos proximos ganha o dobro de pontos da rodada anterior \n"
            +" 6º É necessário o cadastro de pelo menos um jogador para cada torneio, os jogadores cadastrados competirão em numero de pontos obtidos em partidas com jogadores virtuais. \n"
            +" 7º Caso seja realizado o cadastro de apenas um jogador o jogo definirá um jogador virtual para competir com o jogador no torneio\n";
        }
        return " ";
    }

   


}
