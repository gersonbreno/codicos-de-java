/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package questao05;

/**
 *
 * @author Usuário
 */
public class Questao05 {


    public static void main(String[] args) {
     GerenciadorFuncionarios gf = new GerenciadorFuncionarios();
     //Gerente g = new Gerente("gerson", 12, 110);
     Vendedor v = new Vendedor("iandra", 110, 100, 10);
        Assistente a = new Assistente("cacau", 1, 100);
       
     
        gf.AddFuncionário(new Gerente("gerson", 110, 100));
        gf.AddFuncionário(a);
        gf.AddFuncionário(v);
    gf.RemoverFuncionário(1);
      
        gf.imprimirTodos();
        System.out.println("o total de gastos: "+gf.folhaSalarial());
     System.out.print("resultado: ");
        gf.imprimirFuncionário(110);
    }
    
}
