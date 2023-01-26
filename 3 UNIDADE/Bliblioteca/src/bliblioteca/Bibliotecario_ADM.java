/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


package bliblioteca;

/**
 *
 * @author gerso
 */

import java.util.ArrayList;
public class Bibliotecario_ADM {
    ArrayList<Livro> lista;

    public Bibliotecario_ADM() {
        lista = new ArrayList<Livro>();
    }
  public void adicionarLivro(Livro cd){
      for (Livro c : lista) {
          if (cd.getCodico() == c.getCodico()) {
              System.out.println("erro ao adiconar livro codico iguais");
              return;
          }
       
      }
       System.out.println("adicionado com sucesso!");
      lista.add(cd);
  }
    public void buscarLivro(int codico){
        for (Livro c : lista) {
            if (c.getCodico() == codico) {
                System.out.println("busca  encontrada: "+c);
                
            }
        
        }
        System.out.println("busca nao encontrada");
    }
    
    public void imprimirLivro(){
        for (Livro c: lista) {
            System.out.println(c);
        }
    }
    
    public void removerLivro(int codico){
        for (Livro c : lista) {
            if (c.getCodico() == codico) {
                System.out.println("livro removido com sucesso codico do livro: "+c.getCodico());
                lista.remove(c);
            }
               
        }
      
    }
    
    
    public void menu(){
        System.out.println("#################################");
        System.out.println("bem vindo ao nosso sistena");
        System.out.println("####################################");
        System.out.println("1 - para adicinar um livro");
        System.out.println("2 - consulta livro");
        System.out.println("3 - remover livro pelo codico");
        System.out.println("4 - imprimir todos os livros disponivel");
        System.out.println("5 - sair do programa");
    }
    public void menu2(){
        System.out.println("1 - para adicinar um livro na cartegoria fantasia");
        System.out.println("2 - para adicionar um livro na cartegoria historia");
        System.out.println("3 - para adiciona na cartegoria ciencias");
        System.out.println("0 - voltar ao menu principal");
    }
}
