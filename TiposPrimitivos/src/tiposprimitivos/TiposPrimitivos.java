/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiposprimitivos;
import java.util.Scanner;

/**
 *
 * @author lucas
 */
public class TiposPrimitivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o nome do aluno ");
        String nome = teclado.nextLine();
        System.out.println("Digite a primeira nota do aluno ");
        float nota1 = teclado.nextFloat();
        System.out.println("Digite a segunda nota do aluno ");
        float nota2 = teclado.nextFloat();
        System.out.println("Digite a terceira nota do aluno");
        Float nota3 = teclado.nextFloat();
        double media = (nota1 + nota2 + nota3)/3;
        System.out.format("A média de %S é %.2f \n ", nome, media);
        
    }
    
}
