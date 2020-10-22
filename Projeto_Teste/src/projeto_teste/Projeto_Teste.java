package projeto_teste;

public class Projeto_Teste{
    
    public static void main(String[] args){
        
        String nome;
        int idade;
        
        nome = "Lucas";
        
        idade = 16;
       
        
        if(idade <= 12){
            System.out.println(nome + " tem " +idade+ " e é criança");
        }else if(idade >= 12 && idade <= 18){
            System.out.println(nome + " tem " +idade+ " e é adolescente");
        }else if(idade > 18){
            System.out.println(nome + " tem " +idade+ " e é adulto");
        }
        
        
        
    }
    
}