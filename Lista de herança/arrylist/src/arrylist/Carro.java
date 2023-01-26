/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arrylist;

/**
 *
 * @author Usuário
 */
public class Carro {
    private String modelo;
    private String cor;
    private int ano;
    private Pessoa dono;

    public Carro(String modelo, String cor, int ano, Pessoa dono) {
        this.modelo = modelo;
        this.cor = cor;
        this.ano = ano;
        this.dono = dono;
    }
     
   
    public Carro() {
        modelo = "_";
        cor = "-";
        ano = 0;
        
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getAno() {
        return ano;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getCor() {
        return cor;
    }

    public void setDono(Pessoa dono) {
        this.dono = dono;
    }

    public Pessoa getDono() {
        return dono;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getModelo() {
        return modelo;
    }

    @Override
    public String toString() {
        return " Modelo: "+modelo+" cor: "+cor+" ano: "+ano+" Dono: "+dono;
    }

    
    
}
