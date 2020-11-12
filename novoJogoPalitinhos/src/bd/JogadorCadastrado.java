
package bd;

import dinamica.Arena;
public class JogadorCadastrado extends Arena{
    
   public JogadorCadastrado(){
       
   }
   public JogadorCadastrado(Integer jogadorId, String jogadorName, String jogadorNick, String jogadorSexo, String jogadorSenha){
       setJogadorId(jogadorId);
       setJogadorName(jogadorName);
       setLoginJogador(jogadorNick);
       setSenhaJogador(jogadorSenha);
       setJogadorSexo(jogadorSexo);
   }
    
}
