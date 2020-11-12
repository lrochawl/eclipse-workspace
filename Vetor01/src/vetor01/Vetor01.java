
package vetor01;

import java.util.Arrays;

public class Vetor01 {

    public static void main(String[] args) {
       
        int[] n = {3, 6, 7, 12, 16, 40, 200};
        for(int numero : n){
            System.out.print(numero + " ");
        }
         System.out.println("");
         int p = Arrays.binarySearch(n, 12);
         System.out.println("Encontrado na posição "+p);
   }
    
}
