/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package questao05;

/**
 *
 * @author Usuário
 */
public class Vendedor extends Funcionario{
  private double  comissao;
 
    public Vendedor( String nome, int matricula, double salario_base, double comissao) {
        super(nome, matricula, salario_base);
        this.comissao = comissao;
    }

    public Vendedor() {
        comissao = 0;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    public double getComissao() {
        return comissao;
    }
    
   
    @Override
    public double calculaSalario() {
       return getSalario_base() + getComissao();
    }

    @Override
    public String toString() {
        return super.toString()+ " dados do vendedor"; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
  

    
    
 
    
}
