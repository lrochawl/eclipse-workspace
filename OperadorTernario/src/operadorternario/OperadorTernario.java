/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operadorternario;

/**
 *
 * @author lucas
 */
public class OperadorTernario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n1 = 14;
        int n2 = 7;
        int r  = (n1>n2 ^ n2>n1)?n1-3:n2-3;
        System.out.println("O resultado da operação é "+r);
    }
    
}
