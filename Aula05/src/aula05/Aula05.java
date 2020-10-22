
package aula05;

import java.util.HashSet;
import java.util.Set;


public class Aula05 {

    public static void main(String[] args) {
           ContaBanco c1 = new ContaBanco();
           
           c1.setDono("Lucas");
           
           c1.setnumConta(2763);
           c1.abrirConta("cp");
           
           c1.setDeposito(150);
           c1.setSaque(300);
           c1.fecharConta();
           c1.exibeDadosConta(); 
           
          
           
           
          
           
           
    }
    
}
