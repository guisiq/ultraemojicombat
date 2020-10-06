/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ultraemojicombat;


import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author eolui
 */
public class Luta {
    //#region atributos
    //private Calendar dia;
    private Lutador desafiado;
    private Lutador desafiante;
    private final int  rounds = 1;
    private boolean aprovada  ;
    private String nome;
    //#endregion

    //DEFINE O VALOR DE SEUS  ATRIBUTOS
    public void imprimirLuta(){
        System.out.println("aprovada:"+(this.aprovada ? "aprovada":"reprovada"));
        System.out.println("rounds:"+this.rounds);
        System.out.print("desafiado");
        this.desafiado.apresentar();
        System.out.print("desafiante");
        this.desafiante.apresentar();

    }
    public Luta(Lutador desafiado, Lutador desafiante) {
        this.desafiado = desafiado;
        this.desafiante = desafiante;
        this.nome= this.desafiante.getNome() + " X " + this.desafiado.getNome();
        this.marcarLuta(this.desafiado,  this.desafiante);
        this.imprimirLuta();
        
    }        
    public String getNome (){
         return nome;
     }  
    public void marcarLuta(Lutador l1, Lutador l2){
        
        if(l1.getCategoria().equals(l2.getCategoria()) && l1 != l2){
            this.aprovada=true;
            this.desafiante=l1;
            this.desafiado=l2;
           // desafiado.setNome("lele");
        }
        else{ 
            this.aprovada= false;
           
        }
    }
    public void lutar(){
       if(this.aprovada) {
           System.out.println("#######  DESAFIADO  ########");
           this.desafiado.apresentar();
           System.out.println("#######  DESAFIADNTE  ########");
           this.desafiante.apresentar();
           
           Random gerar = new Random();
           int vencedor = gerar.nextInt(3);
           switch(vencedor){
               case 0:
                   System.out.println("EMPATOU"); 
                   this.desafiado.empatarLuta();
                   this.desafiante.empatarLuta();
               break;
               
               case 1:
                   System.out.println("Vitoria do "+ this.desafiado.getNome()); 
                   this.desafiado.ganharLuta();
                   this.desafiante.perderLuta();
               break;
               
               case 2:
                     System.out.println("Vitoria do "+ this.desafiante.getNome()); 
                   this.desafiado.perderLuta();
                   this.desafiante.ganharLuta();
               break;
           }
       }
       else{
           System.out.println("Essa luta não pode acontecer");
       }
    }
//#region metodos gets e seters e construtor
    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public boolean isAprovado() {
        return aprovada;
    }

    public void setAprovado(boolean aprovado) {
        this.aprovada = aprovado;
    }
//#endregion        
}
