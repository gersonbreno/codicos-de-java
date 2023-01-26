/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package contabancaria;

/**
 *
 * @author Usuário
 */
public class ContaCorrente extends Conta{
    private float limite;

    public ContaCorrente(float limite, int num, float saldo, Pessoa dono) {
        super(num, saldo, dono);
        setNum(num);
        setSaldo(saldo);
        setDono(dono);
        this.limite = limite;
    }

    public ContaCorrente() {
        super();
        this.limite=1000;
    }

    public void setLimite(float limite) {
        this.limite = limite;
    }

    public float getLimite() {
        return limite;
    }
   public  void imprmir(){
         super.imprimir();
         System.out.println("essa e uma conta CC e tem o limite de "+this.limite+ " R$");
         System.out.println("----------------------------------------------------------------------\n");
   }
    
    
}
