/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package contabancaria;

/**
 * 
 * @author Usuário
 * 
 */
public class Contabancaria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Pessoa p = new Pessoa("gerson", 12);
      // Conta c = new Conta(12, 100, p);
      ContaCorrente cc = new ContaCorrente(1000, 12, 200, p);
      ContaPoupanca cp = new ContaPoupanca(2000, 13, 300, new Pessoa("ana", 13));
        cc.imprmir();
     cp.imprmir();
    }
    
}
