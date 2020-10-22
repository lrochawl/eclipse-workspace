/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pernas;

import java.util.Scanner;

/**
 *
 * @author lucas
 */
public class Pernas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner teclado = new Scanner(System.in);
        System.out.println("Quantas pernas? ");
    int perna = teclado.nextInt();
    String tipo;
        System.out.print("Isto é um(a) ");
  switch (perna){
    case 1:
        tipo="Saci";
        break;
        
    case 2:
        tipo = "Bipede";
        break;
    case 3:
        tipo="Tripé";
        break;
    case 4:
        tipo="Quadrupede";
        break;
    case 6:
        tipo="Aranha";
        break;
    default:
        tipo="ET";
        break;
}
        System.out.println(tipo);
    }
    
}
