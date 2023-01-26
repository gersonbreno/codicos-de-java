/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package questao03;

/**
 *
 * @author Usuário
 */
public class Aniversario extends CartaoWeb{

    public Aniversario( String destinatario) {
        super(destinatario);
  
    }

    public Aniversario() {
    }

    @Override
    public void showMessage() {
        System.out.println("feliz aniversario "+"para :"+getDestinatario());
    }
   
   
  
    
    
}
