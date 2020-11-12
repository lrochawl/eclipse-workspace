/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author Lucas
 */
public class Funcionarios {
    private Integer Matricula;
    private String Name;

    public Funcionarios() {
    }

    public Funcionarios(Integer Matricula, String Name) {
        this.Matricula = Matricula;
        this.Name = Name;
    }

    public Integer getMatricula() {
        return Matricula;
    }

    public void setMatricula(Integer Matricula) {
        this.Matricula = Matricula;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }
    
    
}
