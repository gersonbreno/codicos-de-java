/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bliblioteca;

/**
 *
 * @author gerso
 */
public abstract class CadrastoLivro {
    private String titulo;
    private String autor;
    private int edicao;
    private String genero;
    int codico;

    public CadrastoLivro(String titulo, String autor, int edicao, String genero, int codico) {
        this.titulo = titulo;
        this.autor = autor;
        this.edicao = edicao;
        this.genero = genero;
        this.codico = codico;
    }

    public CadrastoLivro() {
        titulo = "_";
        autor = "_";
        edicao = 0;
        genero = "_";
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getAutor() {
        return autor;
    }

    public void setEdicao(int edicao) {
        this.edicao = edicao;
    }

    public int getEdicao() {
        return edicao;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getGenero() {
        return genero;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setCodico(int codico) {
        this.codico = codico;
    }

    public int getCodico() {
        return codico;
    }
    
    public abstract void consultarLivro(int codico);

    @Override
    public String toString() {
        return "O titulo: "+titulo+" Autor: "+autor+" ediçao: "+ edicao+" O genero: "+genero+" Codico: "+codico;
    }
    
    
    
   
    
}
