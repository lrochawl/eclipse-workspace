package aula04;

import java.util.HashSet;
import java.util.Set;

public class Aula04 {

    public static void main(String[] args) {
     Caneta c1 = new Caneta("x10","amarela", 0.4f);
     c1.status();
     System.out.println("Tenho uma caneta "+ c1.getModelo()+" de ponta " + c1.getPonta());
     
     Caneta c2 = new Caneta("Mic", "laranja", 0.7f);
     
     c2.status();
     System.out.println("Tenho uma caneta "+ c1.getModelo()+" de ponta " + c1.getPonta());
     
     
        
        
    }
    
}
