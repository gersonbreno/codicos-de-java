/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package questao01;

/**
 *
 * @author gerso
 */
public class Questao01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Restaurante r = new Restaurante("pizza", 30, "piazzaria florence", "rua Antonio", "portalegre", "RN", 5981000, 9624567);
        System.out.println(r);
        r.imprimir();
    }
    
}
