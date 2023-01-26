/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package questao05;

/**
 *
 * @author Usuário
 */
public class Assistente extends Funcionario{


    public Assistente( String nome, int matricula, double salario_base) {
        super(nome, matricula, salario_base);
        
    }

    @Override
    public double calculaSalario() {
       return getSalario_base();
        
    }

    @Override
    public String toString() {
        return super.toString()+ " dadods do assitente"; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    
}
