/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BD;
import java.util.ArrayList;

/**
 *
 * @author Lucas
 */
public class Funcionario {
    
    private int Matricula;
    private String Nome;
    private Departamento Dep;
    
    
    public Funcionario(){
        
    }
    public Funcionario(int Matricula, String Nome){
        this.Matricula = Matricula;
        this.Nome = Nome;
        
    }
    
    public void setMatricula(int Matricula){
        this.Matricula = Matricula;
    }
    public int getMatricula(){
        return this.Matricula;
    }
    
    public void setNome(String Nome){
        this.Nome = Nome;
    }
    public String getNome(){
        return this.Nome;
    }
    
    public void setDep(Departamento Dep){
        this.Dep = Dep;
    }
    public Departamento getDep(){
        return this.Dep;
    }
    
   
}
