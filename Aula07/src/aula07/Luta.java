/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula07;

import java.util.Random;
/**
 *
 * @author lucas
 */
public class Luta {
    
    private     Lutador desafiado, desafiante;
    private     int rounds;
    private     boolean aprovada;
    
    public void marcarLuta(Lutador l1, Lutador l2){
        if (l1.getCategoria().equals(l2.getCategoria()) && l1 != l2){
                this.aprovada = true;
                this.desafiado = l1;
                this.desafiante = l2;
                
    }else{
        this.aprovada = false;
        this.desafiante = null;
        this.desafiante = null;
        
        }
    }
    public void lutar(){
        if(this.aprovada){
            System.out.println("\n ############DESAFIANTE############# \n");
        this.desafiante.apresentacao();
        
            System.out.println("\n ############DESAFIADO#############\n");
        this.desafiado.apresentacao();
        
        Random aleatorio = new Random();
        
        int vencedor = aleatorio.nextInt(3);
            System.out.println("---------- RESULTADO DA LUTA -----------------");
        switch(vencedor){
            case 0:
                System.out.println("Empatou");
                this.desafiado.empatarLuta();
                this.desafiante.empatarLuta();
                break;   
            case 1:
                System.out.println("Vitoria do " + this.getDesafiado().getNome());
                this.desafiado.ganharLuta();
                this.desafiante.perderLuta();
                break;
            case 2:
                System.out.println("Vitoria do " + this.getDesafiante().getNome());
                this.desafiante.ganharLuta();
                this.desafiado.perderLuta();
                break;
        }      
        }else{
            System.out.println("A luta não pode acontecer");
        }
        System.out.println("-----------------------------------------------");
    }
    
    public void setDesafiado(Lutador dee){
        this.desafiado = dee;
    }
    public Lutador getDesafiado(){
        return this.desafiado;
    }
    public void setDesafiante(Lutador de){
        this.desafiante = de;
    }
    public Lutador getDesafiante(){
        return this.desafiante;
    }
    public void setRounds(int ro){
        this.rounds = ro;
    }
    public int getRounds(){
        return this.rounds;
    }
    public void setAprovada(boolean ap){
        this.aprovada = ap;
    }
    public boolean getAprovada (){
        return this.aprovada;
    }
}
