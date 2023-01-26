/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package questao05;

/**
 *
 * @author Usuário
 */
public abstract class Funcionario {
    private  String nome;
    private int matricula;
    private double salario_base;

    public Funcionario(String nome, int matricula, double salario_base) {
        this.nome = nome;
        this.matricula = matricula;
        this.salario_base = salario_base;
    }

    public Funcionario() {
        nome = "_";
        matricula = 0;
        salario_base = 0;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setSalario_base(double salario_base) {
        this.salario_base = salario_base;
    }

    public double getSalario_base() {
        return salario_base;
    }
    
   public abstract double calculaSalario();

    @Override
    public String toString() {
        return "Nome: "+ nome + " matricula: "+matricula+" salario: "+salario_base+ " seu salario: "+calculaSalario();
                }
            
    
}
