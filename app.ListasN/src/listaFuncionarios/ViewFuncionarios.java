
package listaFuncionarios;

import java.util.Locale;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author Lucas
 */
public class ViewFuncionarios {
    
    public static void main(String args[]){
        
        Locale.setDefault(Locale.US);
        
        List<Cadastro> funcionarios = new ArrayList();
        
        
        Scanner sc = new Scanner(System.in);
        System.out.println("-------------------------------------------");
        System.out.println(" | Bem vindo ao cadastro de funcionários | ");
        System.out.println("-------------------------------------------");
        System.out.println("");
        System.out.print("Quantos funcionários serão cadastrados? ");
        int cont = sc.nextInt();
        
        
        for(int i = 0; i < cont; i++){
            
            System.out.printf("Cadastrando o %dº funcionarios \n", (i+1) );
            System.out.print("ID: ");
            int id = sc.nextInt();
            System.out.print("NOME: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.print("SÁLARIO: ");
            Double salario = sc.nextDouble();
            System.out.println("");
            
            Cadastro funcionario = new Cadastro(id, nome, salario);
            
            funcionarios.add(funcionario);
    
        }
        
        System.out.println("Podemos oferecer um aumento a um dos funcionários ");
        System.out.println("Basta informar o Id do funcionario? seguido do percentual do aumento ");
        int idFunc = sc.nextInt();
        Double percentual = sc.nextDouble();
        
    
        System.out.printf("LISTA DE FUNCIONÁROS \n");
        for(int c = 0; c < funcionarios.size(); c++){
       
            
            if(funcionarios.get(c).getId() == idFunc){
               double salFunc =  funcionarios.get(c).getSalario();
                funcionarios.get(c).setSalario(salFunc + salFunc * percentual /100) ;
                
            }  
            int funcId     = funcionarios.get(c).getId();
            String func    = funcionarios.get(c).getNome();
            Double salFunc = funcionarios.get(c).getSalario();
            
            System.out.printf("%d, %s, %.2f \n", funcId, func, salFunc);
        }
        
        
        
        
        
        
        
    }
    
}
