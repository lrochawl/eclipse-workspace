
package machine;
import dinamica.Arena;



public class JogadoresVirtuais extends Arena {
     private Integer quantidade;
   
     
     public JogadoresVirtuais(){
 
      int jogadorSorteado = (int) Math.round(1 + Math.random() * 6);  
       
     
            switch(jogadorSorteado){
                case 1:
                setJogadorId(2010);
                setJogadorName("Evilasio");
                setLoginJogador("eviAtribulado");
                setSenhaJogador("machine1");
                setJogadorSexo("Masculino");
             break;


                case 2:
                setJogadorId(2011);
                setJogadorName("Clandestino");
                setLoginJogador("clandestinoDeBalada");
                setSenhaJogador("calnBal");
                setJogadorSexo("Masculino");
             break;


                case 3:
                setJogadorId(2012);
                setJogadorName("Pedro de Lara");
                setLoginJogador("pedroPaliteiro");
                setSenhaJogador("pedroP20");
                setJogadorSexo("Masculino");
             break;

                case 4:
                setJogadorId(2013);
                setJogadorName("Rafaelado de Dante");
                setLoginJogador("rafante2030");
                setSenhaJogador("2030rafa");
                setJogadorSexo("Masculino");
             break;

                case 5:
                setJogadorId(2014);
                setJogadorName("Zuleica de Ubanda");
                setLoginJogador("zulaBrasil");
                setSenhaJogador("brasilNaCopa97");
                setJogadorSexo("Feminino");
             break;

                case 6:
                setJogadorId(2015);
                setJogadorName("Pombinha Guerreira da Capadócia");
                setLoginJogador("Capombeira");
                setSenhaJogador("guepoca@");
                setJogadorSexo("Feminino");
             break;

                default:
                getErro(1);
             break;
             }
        }
        
    

    
}
