/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bliblioteca;

/**
 *
 * @author gerso
 */
public class Fantasia extends Livro{
protected int idade;

    public Fantasia(int idade) {
        this.idade = idade;
    }

    public Fantasia(int idade, String titulo, String autor, int edicao, String genero, int codico, int ano) {
        super(titulo, autor, edicao, genero, codico, ano);
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
      Status s = new Status();
        if (getIdade() >= 18) {
         //   System.out.println("o livro pode ser consultado pelo usaurio");
         s.disponibilidade();
           if (codico == getCodico()) {
        System.out.println("o codico do livro "+getCodico() +" e o titulo do livro: "+getTitulo()+" foi consultado com sucesso");
        
    } 
    else{if (getCodico() == getCodico()) {
                    System.out.println("o livro com esse codico: "+getCodico()+" e o tittulo do livro: "+getTitulo()+ " não esta disponivel para a consulta");
               }
              
      // 
    }
          
           
        }
        else{
            System.out.println("livro nao permitido para menores de 18 anos");
        }
    }


    
    
   

   
    
}
