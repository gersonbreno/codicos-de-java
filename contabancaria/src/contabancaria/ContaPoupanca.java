/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package contabancaria;

/**
 *
 * @author Usuário
 */
public class ContaPoupanca extends Conta{
    private float taxa;

    public ContaPoupanca(float taxa, int num, float saldo, Pessoa dono) {
        super(num, saldo, dono);
        this.taxa = taxa;
    }

    public ContaPoupanca() {
        super();
        taxa = 0;
     
    }

    public void setTaxa(float taxa) {
        this.taxa = taxa;
    }

    public float getTaxa() {
        return taxa;
    }
     public  void imprmir(){
      super.imprimir();
         System.out.println("essa e uma conta CP e tem o limite de  "+this.taxa + " R$");
   }
    
    
}
