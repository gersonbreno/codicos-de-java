/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arrylist;

import java.util.Scanner;

/**
 *
 * @author Usuário
 */


public class Arrylist {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       GerenteCarros gc = new GerenteCarros();
       Pessoa p = new Pessoa();
        Scanner ler = new Scanner(System.in);
        String modelo, cor;
        int ano, op;
        String nome;
        int numeroApartamento;
          
        do {
          p.menu();
          op = ler.nextInt();
            switch (op) {
                case 1:
                    System.out.println("digite seu nome: ");
                   nome = ler.next();
                    System.out.println("digite o numero de apartamento: ");
                   numeroApartamento = ler.nextInt();
                   System.out.println("digite o modelo do carro: ");
                   modelo = ler.next();
                   System.out.println("digite a cor do carro: ");
                   cor = ler.next();
                   System.out.println("digite o ano do carro: ");
                   ano = ler.nextInt();
                     gc.adicionarCarros(new Carro(modelo, cor, ano, new Pessoa(nome, numeroApartamento)));
                    break;
                case 2:
                    System.out.println("escola qual item voce deseja remover com o numero do apartamento: ");
                    numeroApartamento = ler.nextInt();
                    
                    gc.removerCarro(numeroApartamento);
                    break;
                    
                case 3:
                    gc.imprimirCarros();
                    break;
                case 4:
                       System.out.println("digite o nome da pessoa que voce desja busca");
                       nome = ler.next();
                       gc.buscar(nome);
                    break;
                    
                case 5:
                    System.out.println("Obrigado por usar nosso aplicativo");
                    System.out.println("saindo.........");
                    break;
                default:
                
                    throw new AssertionError("Erro tente novamente");
                    
            }
            
        } while (op != 5);
        
        
        
      
	
		
		
        
        
    }
    
}
