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
    ArrayList<CadrastoLivro> lista;

    public Bibliotecario_ADM() {
        lista = new ArrayList<CadrastoLivro>();
    }
  public void adicionarLivro(CadrastoLivro cd){
      for (CadrastoLivro c : lista) {
          if (cd.getCodico() == c.getCodico()) {
              System.out.println("erro ao adiconar livro codico iguais");
              return;
          }
       
      }
       System.out.println("adicionado com sucesso!");
      lista.add(cd);
  }
    public void buscarLivro(int codico){
        for (CadrastoLivro c : lista) {
            if (c.getCodico() == codico) {
                System.out.println("busca  encontrada: "+c);
                
            }
        
        }
        System.out.println("busca nao encontrada");
    }
    
    public void imprimirLivro(){
        for (CadrastoLivro c: lista) {
            System.out.println(c);
        }
    }
    
    public void removerLivro(int codico){
        for (CadrastoLivro c : lista) {
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
        System.out.println("1 - para adicinar um livro na cartegoria fantasia");
        System.out.println("2 - para adicionar um livro na cartegoria historia");
        System.out.println("3 - para adiciona na cartegoria ciencias");
        System.out.println("4 - busca livro pelo codico");
        System.out.println("5 - consulta livro");
        System.out.println("6 - remover livro pelo codico");
        System.out.println("7 - imprimir todos os livros");
        System.out.println("8 - sair do programa");
    }
}
