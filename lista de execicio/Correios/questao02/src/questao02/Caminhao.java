/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package questao02;

/**
 *
 * @author gerso
 */
public class Caminhao extends Veiculo{
   private double toneladas;
   private double alturaMaxima;
    private double comprimento;

    public Caminhao(double toneladas, double alturaMaxima, double comprimento, double peso, int velocidadeMaxima, double preco, Pessoa dono) {
        super(peso, velocidadeMaxima, preco, dono);
        this.toneladas = toneladas;
        this.alturaMaxima = alturaMaxima;
        this.comprimento = comprimento;
    }

    public Caminhao() {
        toneladas = 0;
        alturaMaxima = 0;
        comprimento = 0;
    }

    public void setAlturaMaxima(double alturaMaxima) {
        this.alturaMaxima = alturaMaxima;
    }

    public double getAlturaMaxima() {
        return alturaMaxima;
    }

    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }

    public double getComprimento() {
        return comprimento;
    }

    public void setToneladas(double toneladas) {
        this.toneladas = toneladas;
    }

    public double getToneladas() {
        return toneladas;
    }

    @Override
    public void imprimir() {
        super.imprimir(); 
        System.out.println("Toneladas: "+ toneladas+" Altura Maxima: "+alturaMaxima+" Comprimento: "+comprimento+" peso: "+getPeso()+" velocidade Maxima: "+getVelocidadeMaxima()+" preço: "+ getPreco()+ " Dono: "+getDono());
    }
    
    
    
}
