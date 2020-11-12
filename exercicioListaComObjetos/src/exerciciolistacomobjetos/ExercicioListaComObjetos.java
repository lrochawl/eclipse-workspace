
package exerciciolistacomobjetos;

import java.util.Locale;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import entities.Employee;


public class ExercicioListaComObjetos {


    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Employee> list = new ArrayList<>();
        
        System.out.print("Quantos funcionários serão cadastrados? ");
        Integer N = sc.nextInt();
        
        for(int i = 0; i < N; i++){
            System.out.print("Qual a ID do funcionario "+i+" ");
            Integer id = sc.nextInt();
            System.out.print("Qual o nome do funcionário ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Qual o salario do funcionário ");
            Double salario = sc.nextDouble();
            
            Employee funcionarios = new Employee(id, name, salario);
            
            list.add(funcionarios);
            
           
        }
        System.out.println("Informe a ID de um funcionario para ter aumento de salario ");
            Integer idFunc = sc.nextInt();
            Integer verificador = verificaId(list, idFunc);
            if(verificador == null){
                System.out.println("Esse funcionário não exista");
            }else{
            System.out.println("Informe o percentual de aumento ");
            Double percentual = sc.nextDouble();
            list.get(verificador).adiocionalSalario(percentual);
            
            
        }
        
        for(Employee funcionario : list ){
            System.out.println(funcionario);
        }
        sc.close();
        
        
    }
    public static Integer verificaId(List<Employee> list, Integer idFunc){
       for(int i = 0; i < list.size(); i++){
           if(list.get(i).getId().equals(idFunc)){
               return i;
           }
           
       }
       return null;
    }
    
}
