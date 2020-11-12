/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interFace;

import java.util.ArrayList;

/**
 *
 * @author Lucas
 */
public class Departamento {
    
    private int Codigo;
    private String Nome;
    ArrayList<Funcionario> ListFunc;

    public Departamento() {
        ListFunc = new ArrayList();
        
    }

    public Departamento(int Codigo, String Nome) {
        this.Codigo = Codigo;
        this.Nome = Nome;
        ListFunc = new ArrayList();
    }

    
    
    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int Codigo) {
        this.Codigo = Codigo;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public ArrayList<Funcionario> getListFunc() {
        return ListFunc;
    }

    public void setListFunc(ArrayList<Funcionario> ListFunc) {
        this.ListFunc = ListFunc;
    }
    
    public void addFunc(Funcionario F){
        F.setDep(this);
        ListFunc.add(F);
    }
    
}
