/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package questao02;

/**
 *
 * @author gerso
 */
public class CarroPasseio extends Veiculo{
    private String modelo;
    private String cor;

    public CarroPasseio(String modelo, String cor, double peso, int velocidadeMaxima, double preco, Pessoa dono) {
        super(peso, velocidadeMaxima, preco, dono);
        this.modelo = modelo;
        this.cor = cor;
    }

    public CarroPasseio() {
        modelo = "_";
        cor = "_";
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getCor() {
        return cor;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getModelo() {
        return modelo;
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Modelo: "+modelo+" Cor: "+cor+ " peso: "+getPeso()+" velocidade Maxima: "+getVelocidadeMaxima()+" preço: "+ getPreco()+ " Dono: "+getDono());
    }
    
    
}
