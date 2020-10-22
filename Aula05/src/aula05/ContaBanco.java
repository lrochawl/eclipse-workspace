
package aula05;

public class ContaBanco {
    public      int numConta;
    protected   String tipo;
    private     String dono;
    private     boolean status;
    private     double saldo;
    
 // ------------------ METODO CONTRUTOR - CONFIGURA PADRÕES DE ABERTURA DE CONTA -------   
  public ContaBanco(){
      this.saldo = 0.0;
      this.status = false;
      
  }
  
  // ----------------------------- MOSTRA DADOS DA CONTA --------------------------
  
  public void exibeDadosConta(){
      System.out.println("----------------------------------------");
      System.out.println("Numero da conta: " + this.getnumConta());
      System.out.println("Tipo da conta: " + this.getTipo());
      System.out.println("Titular da conta: " + this.getDono());
      System.out.println("Status atual da conta: " + this.getStatus());
      System.out.println("Saldo atual: "+this.getSaldo());
      System.out.println("-----------------------------------------");
  }
  
   // ----------------- ABERTURA E FECHAMENTO ---------------------------------- 
  public void abrirConta(String tpC){
      this.setTipo(tpC);
            
      if(this.getTipo().equals("Conta Poupança")){
          this.setStatus(true);
          this.deposito(150);
          System.out.println(this.dono+" Você acaba de abrir uma conta poupança e ganhou um valor de R$ 150,00 em sua nova conta");
      }else if(this.tipo .equals("Conta Corrente")){
          this.setStatus(true);
          this.deposito(50);
          System.out.println("Parabens "+this.dono+", Você acaba de realizar a abertura de uma Conta Corrente e ganhor um valor de R$ 50,00 em sua nova conta ");
      }else{
          this.setStatus(false);
          System.out.println("Por favor informar o tipo da conta");
      }
  }  
  public void fecharConta(){
      
      if(this.getSaldo() > 0){
      System.out.println(this.dono + " Você precisa sacar todos os valores disponiveis em sua conta antes de realizar a fechamento");
      }else if (this.getSaldo() < 0){
      System.out.println(this.dono + " Você não pode encerrar esta conta pois existem debitos pendentes");
      }else if(this.getSaldo() == 0){
      this.setStatus(false);
      System.out.println(this.dono + " Sua conta foi encerrada com sucesso!");
      }
  }
  public void setStatus(boolean st){
      this.status = st;
  }
  
  public String getStatus(){
    String statusC = "";
        if(this.status == true){
            statusC = "Aberta";
        }
        
        if(this.status == false){
            statusC = "Fechada";
        }
    return statusC;
  }
  // ---------------------------- CONFIGURAÇÕES DE CONTA -------------------------
   public String getDono(){
      return this.dono;
  }
  public void setDono(String d){
      this.dono = d;
  }
   public final void setnumConta(int n){
      this.numConta = n;
  }
    public double getnumConta(){
      return this.numConta;
  }
   public String getTipo(){
       
    String tipoConta;   
        switch (this.tipo) {
            case "cp":
                tipoConta = "Conta Poupança";
                break;
            case "cc":
                tipoConta = "Conta Corrente";
                break;
            default:
                tipoConta = this.tipo;
                break;
        }
      return tipoConta;
  }
  public void setTipo(String t){
      this.tipo = t;
  } 

 
  // -------------------------------- OPERAÇOES DE CONTA --------------------------
  public void deposito(double v){
    this.setSaldo(this.getSaldo() + v);
  }
  
  public void sacar(double vss){
    this.setSaldo( this.getSaldo() - vss);
  }
  
  public void setDeposito(double vd){
     if(this.getStatus() .equals("Aberta")){
     this.deposito(vd);
      System.out.println("Deposito de R$" + vd + " realizado com sucesso");
      }else{
       System.out.println("Encontramos um erro ao realizar o seu deposito"+this.getStatus());
      }
  }

  public void setSaque(double vs){
     if(this.getStatus() .equals("Aberta")){
    if(this.getSaldo() >= vs){ 
        this.sacar(vs);
      System.out.println("Saque no valor de R$"+vs+" realizado com sucesso");
    }else{
    System.out.println("Não localizamos este valor para saque disponivel em sua conta");
    }
      }else{
       System.out.println("Encontramos um erro ao realizar o saque em sua conta");
      }
  }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public Double getSaldo(){
       return this.saldo;
  }
 // ---------------------------- PAGAMENTO DE MENSALIDADE ------------------
  public void pagarMensalidade(){
     if(this.getStatus() .equals("Aberta")){
      if(this.tipo .equals("cp")){
          this.saldo = this.saldo - 20;
          System.out.println("Cobrança de mensalidade realizada com sucesso");
          
      }
      if(this.tipo .equals("cc")){
          this.saldo = this.saldo - 12;
          System.out.println("Cobrança de mensalidade realizada com sucesso");
      }
     }else{
         System.out.println("Não é possivel cobrar mensalidade de uma conta fechada");
     }
  }
  

 
}
