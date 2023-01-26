/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bliblioteca;

/**
 *
 * @author gerso
 */
public class Bliblioteca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Bibliotecario_ADM ba = new Bibliotecario_ADM();
        Fantasia f = new Fantasia(20, "games", "gerson", 4, "fantasia",11);
         Fantasia f1 = new Fantasia(20, "games", "gabriel", 5, "fantasia",12);
         Historia h = new Historia(200, "guerra", "mariono", 10, "historia", 110);
         Ciencias c = new Ciencias("biologia", "sere vivos", "maria", 1, "ciencia", 123);
         
       ba.adicionarLivro(f);
      ba.adicionarLivro(c);
      ba.adicionarLivro(h);
        f.consultarLivro(11);
        c.consultarLivro(1);
        h.consultarLivro(123);
     //   ba.buscarLivro(11);
        //ba.removerLivro(123);
        ba.imprimirLivro();
       // System.out.println("\n");
      //  f.consultarLivro();
    }
    
}
