
package dinamica;
import dinamica.Regras;


public abstract class Arena extends Regras{
     private Integer escolhaPalitinhos, jogadaAtual;
     private Integer jogadorVitorias, jogadorDerrotas, jogadorEmpates, jogadorNivel;

   

   
    
    public void ganharLuta(){
       
        
        this.setJogadorVitorias(this.getJogadorVitorias() + 1);
    }
    
    public void perderLuta(){
        this.setJogadorDerrotas(this.getJogadorDerrotas() + 1);
    } 
    
    public void empatesLuta(){
        this.setJogadorEmpates(this.getJogadorEmpates() + 1);
    } 
    
    public Integer getEscolhaPalitinhos() {
        return escolhaPalitinhos;
    }

    public void setEscolhaPalitinhos(Integer escolhaPalitinhos) {
        this.escolhaPalitinhos = escolhaPalitinhos;
    }

    public Integer getJogadaAtual() {
        return jogadaAtual;
    }

    public void setJogadaAtual(Integer jogadaAtual) {
        this.jogadaAtual = jogadaAtual;
    }

    public Integer getJogadorVitorias() {
        return jogadorVitorias;
    }

    public void setJogadorVitorias(Integer jogadorVitorias) {
        this.jogadorVitorias = jogadorVitorias;
    }

    public Integer getJogadorDerrotas() {
        return jogadorDerrotas;
    }

    public void setJogadorDerrotas(Integer jogadorDerrotas) {
        this.jogadorDerrotas = jogadorDerrotas;
    }

    public Integer getJogadorEmpates() {
        return jogadorEmpates;
    }

    public void setJogadorEmpates(Integer jogadorEmpates) {
        this.jogadorEmpates = jogadorEmpates;
    }

    public Integer getJogadorNivel() {
        return jogadorNivel;
    }

    public void setJogadorNivel(Integer jogadorNivel) {
        this.jogadorNivel = jogadorNivel;
    }
}
