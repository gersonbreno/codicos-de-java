/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package questao02;

/**
 *
 * @author gerso
 */
public class Pessoa {
      private String nome;
    private int rg;

    public Pessoa(String nome, int rg) {
        this.nome = nome;
        this.rg = rg;
    }

    public Pessoa() {
        nome = "_";
        rg = 0;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setRg(int rg) {
        this.rg = rg;
    }

    public int getRg() {
        return rg;
    }

    @Override
    public String toString() {
        return "Nome: "+ nome+" RG: "+rg;
    }
    
    
}
