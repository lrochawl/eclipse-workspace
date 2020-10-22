package aula02;

public class Caneta {
    
   public     String modelo;
   public     String cor;
   protected  double ponta;
   protected  int carga;
   private    boolean tampada;
    
    public void status(){
        System.out.println("Uma caneta " +this.modelo+" " +this.cor);
        System.out.println("A caneta está tampada? " + this.tampada );
        System.out.println("############################################");
    }
    
    public void rabiscar(){
        if(this.tampada){
            System.out.println("Não pode rabiscar, caneta esta tampada");
        }else{
            System.out.println("Rabiscando");
        }
    }
    
    public void tampar (){
       this.tampada = true;
    }
    
    public void destampar (){
        this.tampada = false;
    }
}
