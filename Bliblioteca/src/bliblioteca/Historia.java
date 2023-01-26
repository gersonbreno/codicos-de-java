/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bliblioteca;

/**
 *
 * @author gerso
 */
public class Historia extends CadrastoLivro{
    protected int ano;

    public Historia(int ano, String titulo, String autor, int edicao, String genero, int codico) {
        super(titulo, autor, edicao, genero, codico);
        this.ano = ano;
    }

    public Historia() {
        ano = 0;
    }
    
    

    @Override
    public void consultarLivro(int codico) {
      if (codico == getCodico()) {
        System.out.println("o livro do codico "+getCodico() +" foi consultado com sucesso");
        
    } 
    else{
        System.out.println("o livro com esse codico: "+getCodico()+" esta dispoivel");
    }
    }
    
}
