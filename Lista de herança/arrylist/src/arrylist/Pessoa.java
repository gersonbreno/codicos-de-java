/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arrylist;

/**
 *
 * @author Usuário
 */
public class Pessoa {
    private String nome;
    private int numeroApartamento;

    public Pessoa(String nome, int numeroApartamento) {
        this.nome = nome;
        this.numeroApartamento = numeroApartamento;
    }

    public Pessoa() {
        nome = "_";
        numeroApartamento = 0;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNumeroApartamento(int numeroApartamento) {
        this.numeroApartamento = numeroApartamento;
    }

    public int getNumeroApartamento() {
        return numeroApartamento;
    }

    @Override
    public String toString() {
        return ""+ nome + " Numero do apartamento: "+ numeroApartamento;
    }

   public void menu(){
       System.out.println("1 - Adcionar pessoa");
       System.out.println("2 - remover pessoas");
       System.out.println("3 - imprimir pessoas");
       System.out.println("4 - busca pessoas");
       System.out.println("5 - sair");
          
   }
    
}
