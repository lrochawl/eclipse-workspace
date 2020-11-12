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
public class Departamento {
    
    private int code;
    private String Nome;
    private ArrayList<Funcionario> ListFunc;
    
    private Departamento(){
        this.ListFunc = new ArrayList();
    }
    private Departamento(int code, String Nome){
        this.code = code;
        this.Nome = Nome;
        ListFunc = new ArrayList();
    }
    
    public void setCode(int Code){
        this.code = Code;
    }
    public int getCode(){
        return this.code;
    }
    
    public void setNome(String Nome){
        this.Nome = Nome;
    }
    public String getName(){
        return this.Nome;
    }
    
  public void setListFunc(ArrayList<Funcionario> ListFunc){
     this.ListFunc = ListFunc;
    }
    public ArrayList<Funcionario> getListFunc(){
        return this.ListFunc;
    }
    
    public void addFunc(Funcionario F){
        F.setDep(this);
        this.ListFunc.add(F);
    }
    
}
