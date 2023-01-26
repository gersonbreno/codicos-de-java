/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package questao03;

/**
 *
 * @author Usuário
 */
public abstract class CartaoWeb {
    private String destinatario;

    public CartaoWeb(String destinatario) {
        this.destinatario = destinatario;
    }

    public CartaoWeb() {
        destinatario = "_"; 
    }

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }

    public String getDestinatario() {
        return destinatario;
    }
    
    public   abstract void showMessage();
    
    
    
}
