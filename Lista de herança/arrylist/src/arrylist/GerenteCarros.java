/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arrylist;
import java.util.ArrayList;
/**
 *
 * @author Usuário
 */
public class GerenteCarros {
private ArrayList<Carro> lista;


    public GerenteCarros() {
       lista= new ArrayList<Carro>();
       
    }
    
    
    public void adicionarCarros(Carro x) {
        for(Carro c: lista) {
            
            if (x.getDono().getNumeroApartamento() == c.getDono().getNumeroApartamento()) {
                  System.out.println("erro nao adionar porque esta com o mesmo apartamento");
                  return;
            }
           
        }
		lista.add(x);
		//return true;
	}
    public boolean removerCarro(int numeroApt) {
		for(Carro c:lista) {
			if(c.getDono().getNumeroApartamento() == numeroApt) {
				lista.remove(c);
				return true;
			}
		}
		return false;
	}
	public void imprimirCarros() {
		for(Carro c:lista) {
				System.out.println(c);
		}
	}
    public void buscar(String nome){
        Pessoa p = new Pessoa();
             
        for (Carro c: lista) {
            Carro achou = new Carro();
            if (c.getDono().getNome().equals(nome)) {
                System.out.println("usario encontrado");
                imprimirCarros();
                return;
            }
            else{
                System.out.println("nome nao encontrado tente novamente");
            }
        }
      
    }
}



