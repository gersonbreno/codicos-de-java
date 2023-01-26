/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bliblioteca;

/**
 *
 * @author gerso
 */
public class Historia extends Livro{
    

    public Historia(String titulo, String autor, int edicao, String genero, int codico, int ano) {
        super(titulo, autor, edicao, genero, codico, ano);
      
    }

    public Historia() {
        ano = 0;
    }
    
    

    @Override
    public void consultarLivro(int codico) {
      if (codico == getCodico()) {
        System.out.println("o codico livro do  "+getCodico() +" foi consultado com sucesso");
        
    } 
    else{
        System.out.println("o livro com esse codico: "+getCodico()+" esta dispoivel");
    }
    }
    
}
