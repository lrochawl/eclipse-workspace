
package bd;
import dinamica.Welcome;

public abstract class Cadastro extends Welcome {
    private Integer jogadorId, jogadorIdade;
    private String jogadorName, loginJogador, senhaJogador, jogadorSexo;
    private String loginAdministrador, senhaAdministrador;
    
    
    public Integer getJogadorId() {
        return jogadorId;
    }

    public void setJogadorId(Integer jogadorId) {
        this.jogadorId = jogadorId;
    }

    public Integer getJogadorIdade() {
        return jogadorIdade;
    }

    public void setJogadorIdade(Integer jogadorIdade) {
        this.jogadorIdade = jogadorIdade;
    }

    public String getJogadorName() {
        return jogadorName;
    }

    public void setJogadorName(String jogadorName) {
        this.jogadorName = jogadorName;
    }

    public String getLoginJogador() {
        return loginJogador;
    }

    public void setLoginJogador(String loginJogador) {
        this.loginJogador = loginJogador;
    }

    public String getSenhaJogador() {
        return senhaJogador;
    }

    public void setSenhaJogador(String senhaJogador) {
        this.senhaJogador = senhaJogador;
    }

    public String getJogadorSexo() {
        return jogadorSexo;
    }

    public void setJogadorSexo(String jogadorSexo) {
        this.jogadorSexo = jogadorSexo;
    }

    public String getLoginAdministrador() {
        return loginAdministrador;
    }

    public void setLoginAdministrador(String loginAdministrador) {
        this.loginAdministrador = loginAdministrador;
    }

    public String getSenhaAdministrador() {
        return senhaAdministrador;
    }

    public void setSenhaAdministrador(String senhaAdministrador) {
        this.senhaAdministrador = senhaAdministrador;
    }

    public Character getCadastroNovo() {
        return cadastroNovo;
    }

    public void setCadastroNovo(Character cadastroNovo) {
        this.cadastroNovo = cadastroNovo;
    }
    
    
    private Character cadastroNovo;
    
    
   
    public static String solicitaCadastro(Integer status, Integer id){
        
        String info;
        
        if(id > 0 && status < 5){
           status = status + 5;
        }
        
        
        switch(status){
            case 1:
                info =   "\n    ----------------------------------- \n"
                        + "   | Você precisa realizar seu cadastro |"
                        +"\n    ----------------------------------- \n";
             break;
            case 2:
                info =  "  -Digite seu nome: ";
                break;
            case 3:
                info =  "  -Digite seu nick nome: ";
                break;
            case 4:
                info =  "  -Digite uma senha: ";
                break;
            case 5:
                info =  "  Cadastrar novo jogador?: (Sim/Não) ";
                break;
            case 6:
                info =  "\nVamos agora realizar o proximo cadastro ";
                break;
            case 7:
                info =  "  -Digite o nome do jogador: ";
                break;
            case 8:
                info =  "  -Digite o nick do jogador: ";
                break;
            case 9:
                info =  "  -Digite a senha do jogador: ";
                break;
                
            default:
                info = "#Erro: 01 (Status)"; 
        }
        
        return info; 
        
    }
 
    public Character getCadNovo(){
        return this.cadastroNovo;
    }
    public void setCadNovo(String option){
        this.cadastroNovo = option.toLowerCase().charAt(0);
    }
    public String toString(){
        return "\n**** O cadastro foi realizado com sucesso\n"
                + "  Id do jogador: "+this.jogadorId+"\n"
                + "  Nome do jogador: " + this.jogadorName+"\n"
                + "  Nick name do jogador: "+ this.loginJogador+"\n"
                + "  Senha de acesso ao jogo: "+this.senhaJogador;
    }
        
        
}
