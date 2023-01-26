/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bliblioteca;

/**
 *
 * @author gerso
 */
public class Ciencias extends Livro{
    protected String classe;

    public Ciencias(String classe, String titulo, String autor, int edicao, String genero, int codico, int ano) {
        super(titulo, autor, edicao, genero, codico, ano);
        this.classe = classe;
    }

    

    public Ciencias() {
        classe = "_";
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }
   
    
    
    
    @Override
    public void consultarLivro(int codico) {
      if (codico == getCodico()) {
        System.out.println("o codico do livro "+getCodico() +" e o titulo do livro: "+getTitulo()+" foi consultado com sucesso");
        
    } 
    else{
        System.out.println("o livro com esse codico: "+getCodico()+" esta dispoivel");
    }
    }
    
}
