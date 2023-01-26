/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bliblioteca;

/**
 *
 * @author gerso
 */
public class Fantasia extends CadrastoLivro{
protected int idade;

    public Fantasia(int idade, String titulo, String autor, int edicao, String genero, int codico) {
        super(titulo, autor, edicao, genero, codico);
        this.idade = idade;
    }
    

    public Fantasia() {
        idade = 0;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getIdade() {
        return idade;
    }
    

    @Override
    public void consultarLivro(int codico) {
        if (getIdade() >= 18) {
            System.out.println("o livro pode ser consultado pelo usaurio");
           if (codico == getCodico()) {
        System.out.println("o livro do codico "+getCodico() +" foi consultado com sucesso");
        
    } 
    else{
        System.out.println("o livro com esse codico: "+getCodico()+" esta dispoivel");
    }
          
           
        }
        else{
            System.out.println("livro nao permitido para menores de 18 anos");
        }
    }


    
    
   

   
    
}
