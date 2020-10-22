/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula07;

/**
 *
 * @author lucas
 */
public class Lutador {
    
   private String nome, nacionalidade, categoria;
   private int idade, vitorias, derrotas, empates;
   private double altura, peso;
   
   public Lutador(String no,String na, int id, double al, double pe, int vi, int de, int em ){
       this.nome = no;
       this.nacionalidade = na;
       this.altura = al;
       this.idade = id;
       this.setPeso(pe);
       this.vitorias = vi;
       this.derrotas = de;
       this.empates = em;
   }
   
   public void apresentar(){
       
       System.out.println("Diretamente de " + this.getNacionalidade());
       System.out.println("");
   }
  // public void Status(){  }
   public void ganharLuta(){
   
   }
   public void perderLuta(){
   
   }
   public void empatarLuta(){
   
   }


public void apresentacao(){
    System.out.println("DHEGOU A HORA! Apresentamos o lutador " + this.getNome());
    System.out.println("Origem: " + this.getNacionalidade());
    System.out.println(this.getIdade() + " anos");
    System.out.println(this.getAltura() + "m de altura");
    System.out.println("Pesando " + this.getPeso() + "Kg");
    System.out.println("Ganhou: " + this.getVitorias());
    System.out.println("Perdeu: " + this.getDerrotas());
    System.out.println("Empatou: " + this.getEmpates());
    
    
}
public void status(){
    System.out.println("-------------Status---------------");
    System.out.println("this.getNome()");
    System.out.println("É um peso " + this.getCategoria());
    System.out.println(this.getVitorias() + "vitorias");
    System.out.println(this.getDerrotas() + "derrotas");
    System.out.println(this.getEmpates() + "empates");
}

public String getNome(){
    return this.nome;
}
public void setNome(String no){
    this.nome = no;
}

public void setNacionalidade(String na){
    this.nacionalidade = na;
}
public String getNacionalidade(){
    return this.nacionalidade;
}
public void setIdade(int id){
    this.idade = id;
}
public int getIdade(){
    return this.idade;
}
public void setAltura(double al){
    this.altura = al;
}
public double getAltura(){
    return this.altura;
}

public double getPeso(){
    return this.peso;
}
public void setPeso(double pe){
    this.peso = pe;
    setCategoria();
}
public  void setVitorias(int vi){
    this.vitorias = vi;
}
public int getVitorias(){
    return this.vitorias;
}
public void setDerrotas(int de){
    this.derrotas = de;
}
public int getDerrotas(){
    return this.derrotas;
}
public void setEmpates(int em){
    this.empates = em;
}
public int getEmpates(){
    return this.empates;
}

public void setCategoria(){

    if (this.getPeso() < 52.2){
        this.categoria = "Invalida";
    }else if(this.getPeso() <= 70.3 ){
        this.categoria = "Leve";
    }else if(this.getPeso() <= 83.9){
        this.categoria = "Médio";
    }else if(this.getPeso() <= 120.2){
        this.categoria = "Pesado";
    }else{
        this.categoria = "Invalido";
    }
    }
public String getCategoria(){
    return this.categoria;
}
 public void setganharLuta(){
     this.setVitorias(this.getVitorias() + 1);
 }
 public int getganharLuta(){
     return this.vitorias;
 }
 public void setperderLuta(){
     this.setDerrotas(this.getDerrotas() + 1);
 }
 public int getpederLuta(){
     return this.derrotas;
 }
 public void setempatarLuta(int em){
     this.setEmpates(this.getEmpates() + 1);
 }
 public int getempatarLuta(){
    return this.empates;
 }
}
   



