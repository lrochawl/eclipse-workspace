
package aula02;

public class Aula02 {
   
    public static void main(String[] args) {
       //************************ Caneta 1 ******************************  
        Caneta canetaNova = new Caneta();
     
       canetaNova.cor = "Branca";
       canetaNova.carga = 10;
       canetaNova.modelo = "X10";
       canetaNova.ponta = 0.5;
       
       canetaNova.tampar();
       canetaNova.rabiscar();
       canetaNova.status();
       
       //******************* Caneta 2 *******************************
       Caneta canetaBic = new Caneta();
       
       canetaBic.carga = 8;
       canetaBic.cor = "Preta";
       canetaBic.modelo = "C90";
       canetaBic.ponta = 0.7;
       
       canetaBic.destampar();
       canetaBic.rabiscar();
       canetaBic.status();
    }
    
}
