
package novojogopalitinhos;

import java.util.Locale;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import dinamica.Welcome;
import bd.JogadorCadastrado;
import machine.JogadoresVirtuais;

public class NovoJogoPalitinhos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Locale.setDefault(Locale.US);
        
        Scanner sc = new Scanner(System.in);
        
       
        List<JogadorCadastrado> jogadores = new ArrayList<>();
   
        System.out.println(Welcome.getMsgWelcome());
        
        
        
        do{
           
            int id = jogadores.size();
            JogadorCadastrado cadastrarJogador = new JogadorCadastrado();
            System.out.println(cadastrarJogador.solicitaCadastro(1, id));
            System.out.print(cadastrarJogador.solicitaCadastro(2, id));
            String nameUser = sc.nextLine();
            System.out.print(cadastrarJogador.solicitaCadastro(3, id));
            String nickUser = sc.nextLine();
            System.out.print(cadastrarJogador.solicitaCadastro(4, id));
            String senhaUser = sc.nextLine();
            
            JogadorCadastrado jogador = new JogadorCadastrado(id + 100, nameUser, nickUser, senhaUser, senhaUser);
            jogadores.add(jogador);
            
            System.out.println(jogadores.get(id));
            System.out.println(cadastrarJogador.getRegras(id));
            System.out.print(cadastrarJogador.solicitaCadastro(5, id));
            
            jogadores.get(id).setCadNovo(sc.nextLine());
           
        }while(jogadores.get(jogadores.size()-1).getCadNovo().equals('s'));
        
         if(jogadores.size() > 0){
            

        for(int i = 0; i < 3; i++){
             JogadoresVirtuais geraJogadores = new JogadoresVirtuais();
             List<JogadoresVirtuais> jogadoresVirtuais = new ArrayList<>();
             jogadoresVirtuais.add(geraJogadores);
             
             for(JogadoresVirtuais jogadorVirtual : jogadoresVirtuais){
             System.out.println(jogadorVirtual);
         }

         }
         
         
         }
    
        
    }
    
}
