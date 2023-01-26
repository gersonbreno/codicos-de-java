/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package questao02;

/**
 *
 * @author gerso
 */
public abstract class  Veiculo {
  private double peso;
  private int velocidadeMaxima;
  private double preco;
  private Pessoa dono;

    public Veiculo(double peso, int velocidadeMaxima, double preco, Pessoa dono) {
        this.peso = peso;
        this.velocidadeMaxima = velocidadeMaxima;
        this.preco = preco;
        this.dono = dono;
    }

    public Veiculo() {
        peso = 0;
        velocidadeMaxima =0;
        preco = 0;
    }

    public void setDono(Pessoa dono) {
        this.dono = dono;
    }

    public Pessoa getDono() {
        return dono;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getPeso() {
        return peso;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getPreco() {
        return preco;
    }

    public void setVelocidadeMaxima(int velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public int getVelocidadeMaxima() {
        return velocidadeMaxima;
    }
    public void imprimir(){
      //  System.out.println("Peso: "+peso +" Velocidade Maxima: "+velocidadeMaxima+" preço: "+ preco+ " Dono: "+dono);
    }

    @Override
    public String toString() {
        return "Peso: "+peso+ " Velocidade Maxima: "+velocidadeMaxima+" preço: "+ preco+ " Dono:"+dono;
    }
  
    
    
}
