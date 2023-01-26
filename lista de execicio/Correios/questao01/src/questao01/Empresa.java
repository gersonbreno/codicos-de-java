/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package questao01;

/**
 *
 * @author gerso
 */
public class Empresa {
        private String nome;
    private String endereco;
    private  String cidade;
    private String estado;
    private int cep;
    private int tel;

    public Empresa(String nome, String endereco, String cidade, String estado, int cep, int tel) {
        this.nome = nome;
        this.endereco = endereco;
        this.cidade = cidade;
        this.estado = estado;
        this.cep = cep;
        this.tel = tel;
    }

    public Empresa() {
          nome = "_";
          endereco = "_";
           cidade = "_";
            estado = "_";
            cep = 0;
            tel = 0;
                       
    }

    public void setCep(int cep) {
        this.cep = cep;
    }

    public int getCep() {
        return cep;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getCidade() {
        return cidade;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getEstado() {
        return estado;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setTel(int tel) {
        this.tel = tel;
    }

    public int getTel() {
        return tel;
    }

    @Override
    public String toString() {
        return "nome: "+nome+" Endereço: "+ endereco +" cidade: "+cidade + " Estado: "+estado+" Cep: "+cep+" Telefone: "+tel;
  }
    
    
}
