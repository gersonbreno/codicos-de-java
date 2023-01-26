/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bliblioteca;

/**
 *
 * @author gerso
 */
public class Status implements Notificar{

    Fantasia ff = new Fantasia();
    Historia h = new Historia();
    
    
    
    
    public void disponibilidade() {
        System.out.println("O LIVRO ESTA DISPONIVEL  PARA A CONSULTA!"); 
    }
    
}
