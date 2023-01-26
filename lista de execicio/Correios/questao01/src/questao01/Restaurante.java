/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package questao01;

/**
 *
 * @author gerso
 */
public class Restaurante extends Empresa{
    private String tipoComida;
    private double precoMedio;

    public Restaurante(String tipoComida, double precoMedio, String nome, String endereco, String cidade, String estado, int cep, int tel) {
        super(nome, endereco, cidade, estado, cep, tel);
        this.tipoComida = tipoComida;
        this.precoMedio = precoMedio;
    }

    public Restaurante() {
        tipoComida = "_";
        precoMedio = 0;
    }

    public void setPrecoMedio(double precoMedio) {
        this.precoMedio = precoMedio;
    }

    public double getPrecoMedio() {
        return precoMedio;
    }

    public void setTipoComida(String tipoComida) {
        this.tipoComida = tipoComida;
    }

    public String getTipoComida() {
        return tipoComida;
    }

   public void imprimir(){
       System.out.println("tipo do prato: "+ getTipoComida()+ " preco medio: "+precoMedio);
   }
    
}
