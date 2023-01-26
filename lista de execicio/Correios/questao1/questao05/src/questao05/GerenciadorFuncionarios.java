/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package questao05;
import java.util.ArrayList;
import javax.print.DocFlavor;
/**
 *
 * @author Usuário
 */
public class GerenciadorFuncionarios {
    ArrayList<Funcionario> lista ;

    public GerenciadorFuncionarios() {
        lista = new ArrayList<Funcionario>();
    }
    
    
    
    public void AddFuncionário(Funcionario f){
           for (Funcionario ff: lista) {
               if (ff.getMatricula() == f.getMatricula()) {
                     System.out.println("erro nao adionar porque esta com o mesmo numero de matricula");
                     return;
               }
               
        }
       lista.add(f);
   
    }
    public void RemoverFuncionário(int matricula){
        for (Funcionario f: lista) {
            if (f.getMatricula() == matricula) {
                lista.remove(f);
            }
           
        }
    }
    

    public void imprimirTodos(){
       
        for(Funcionario f:lista) {
	System.out.println(f);
		}
    }
   
    public void imprimirFuncionário(int matricula){
           
        for (Funcionario f: lista) {
            if (f.getMatricula() == matricula) {
                System.out.println(f);
            }
        }
   
    }
    public double folhaSalarial(){
        double cont = 0;
      for (Funcionario f: lista ) {
      cont = cont + f.calculaSalario();
           
     }
      return cont;
   }
}