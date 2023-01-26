/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package contabancaria;

/**
 *
 * @author Usuário
 */
public class Conta {
    private int num;
    private float saldo;
    private Pessoa dono;

    public Conta(int num, float saldo, Pessoa dono) {
        this.num = num;
        this.saldo = saldo;
        this.dono = dono;
    }

    public Conta() {
        num = 0;
        saldo = 0;
        dono = new Pessoa();
    }

   

    public void setNum(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setDono(Pessoa dono) {
        this.dono = dono;
    }

    public Pessoa getDono() {
        return dono;
    }

   public void imprimir(){
      
       System.out.println("numero da conta: "+this.num+"\nSaldo: "+ this.saldo+ "\nDados do dono: " + this.dono);
        
   }
    
    
    
}
