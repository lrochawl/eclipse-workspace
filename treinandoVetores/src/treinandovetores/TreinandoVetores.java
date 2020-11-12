/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package treinandovetores;

import java.util.Arrays;

/**
 *
 * @author Lucas
 */
public class TreinandoVetores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int vet[] = {3, 7, 6 ,1 ,9 ,4, 2};
        
        
        System.out.print(" -----------------------\n| ");
        for(int v : vet){
        System.out.printf(" %d ",v);
        }
        System.out.print(" |\n -----------------------\n");
        
        Arrays.sort(vet);
        
        System.out.print(" ---- Valores Oredenados ----\n  | ");
        for(int v : vet){
        System.out.printf(" %d ",v);
        }
        System.out.print(" |\n ----------------------------\n");
        
        int encontrarValor = Arrays.binarySearch(vet, 3);
        System.out.println(encontrarValor);
    }
    
}
