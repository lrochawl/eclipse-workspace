/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.util.ArrayList;

/**
 *
 * @author Lucas
 */
public class Departamentos {
    private Integer Codigo;
    private String Name;
    
    private ArrayList ListFunc;

    public Departamentos() {
        ListFunc = new ArrayList();
    }
    
    public Departamentos(Integer Codigo, String Name) {
        this.Codigo = Codigo;
        this.Name = Name;
        
        ListFunc = new ArrayList();
    }

    public Integer getCodigo() {
        return Codigo;
    }

    public void setCodigo(Integer Codigo) {
        this.Codigo = Codigo;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public ArrayList getListFunc() {
        return ListFunc;
    }

    public void setListFunc(ArrayList funcionario) {
        ListFunc.add(funcionario);
        
    }
    
    
    
}
