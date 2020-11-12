
package listaFuncionarios;

public class Cadastro{
    private int id;
    private String nome;
    private Double salario;
    
    public Cadastro(){
        
    }
    
    public Cadastro(int id, String nome, Double salario){
        this.id = id;
        this.nome = nome;
        this.salario = salario;
    }
    
    public void setId(int id){
        this.id = id;
    }
    public int getId(){
        return this.id;
    }
    
    public void setName(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return this.nome;
    }
    
    public void setSalario(Double salario){
        this.salario = salario;
    }
    public Double getSalario(){
        return this.salario;
    }
}
