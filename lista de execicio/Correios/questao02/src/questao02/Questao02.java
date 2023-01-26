/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package questao02;

/**
 *
 * @author gerso
 */
public class Questao02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       CarroPasseio cp = new CarroPasseio("bmw", "verde", 1000, 200, 200000, new Pessoa("gerson", 3120));
       cp.imprimir();
       
      Caminhao c = new Caminhao(10, 5, 10, 10000, 90, 140000, new Pessoa("sabrina", 258));
      c.imprimir();
    }
    
}
