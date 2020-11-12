
package entities;


public class Employee {
    private Integer id;
    private String name;
    private Double salary;
    
    public Employee(){
        
    }
    public Employee(Integer id, String name, Double salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    public void setId(Integer id){
        this.id = id;
    }
    public Integer getId(){
        return this.id;
    }
    
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    
    public void setSalary(Double Salary){
        this.salary = salary;
    }
    public Double getSalary(){
        return this.salary;
    }
    
    public void adiocionalSalario(Double percentual){
        this.salary += this.salary * percentual / 100;
    }
    
    public String toString(){
        return "Lista de funcionarios: \n"
                +id+", "+this.name+ ", "+ this.salary;
    }
}
