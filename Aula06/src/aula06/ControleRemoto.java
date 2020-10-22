
package aula06;

public class ControleRemoto implements Controlador {
    private int volume;
    private boolean ligado;
    private boolean tocando;
    
    public ControleRemoto(){
        this.ligado = false; 
        this.tocando = false;
        this.volume = 50;
    }
    
    private void setLigado(boolean ligado){
        this.ligado = ligado;
    }
    private boolean isLigado(){
        return this.ligado;
    }
    
    private void setTocando(boolean tocando){
        this.tocando = tocando;
    }
    private boolean isTocando(){
        return this.tocando;
    }
    
    private void setVolume(int vol){
        this.volume = vol;
    }
    private int getVolume(){
        return this.volume;
    }
  
    @Override
    public void ligar(){
        this.setLigado(true);
    }
    
    @Override
    public void desligar(){
        this.setLigado(false);
    }
    
    @Override
    public void abrirMenu(){
        System.out.println("------MENU-------");
        System.out.println("Está ligado? "+this.isLigado());
        System.out.println("Está tocando? "+this.isTocando());
        System.out.print("Volume: "+this.getVolume());
        for(int i = 0; i <= this.getVolume(); i+=9){
            System.out.print("|");
            
        }
        System.out.println("");
    }
    
    @Override
    public void fecharMenu(){
        System.out.println("Fechando Menu...");
    }
    
    @Override
    public void maisVolume(){
        if(this.isLigado()){
            this.setVolume(this.getVolume() + 5);
        }
    }
    
    @Override
    public void menosVolume(){
        if(this.isLigado()){
            this.setVolume(this.getVolume() - 5);
        }
    }
    
    @Override
    public void ligarMudo(){
        if(this.isLigado() && this.getVolume() > 0){
            this.setVolume(0);
        }
    }
    
    @Override
    public void desligarMudo(){
        if(this.isLigado() && this.getVolume() == 0){
            this.setVolume(50);
        }
    }
    
    @Override
    public void play(){
        if(this.isLigado() && !(this.isTocando())){
            this.setTocando(true);
        }
    
    }
    
    @Override
    public void pause(){
        if(this.isLigado() && this.isTocando()){
            this.setTocando(false);
        }
    
    }
    
}
