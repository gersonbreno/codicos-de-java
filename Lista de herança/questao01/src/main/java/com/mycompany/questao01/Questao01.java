/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.questao01;

import java.util.Scanner;

/**
 *
 * @author Usuário
 */
public class Questao01 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int comprimento, altura;
        
        System.out.println("digite o comprimento do retangulo: ");
        comprimento = ler.nextInt();
          System.out.println("digite o altura do retangulo: ");
        altura = ler.nextInt();
        
    Retangulo r = new Retangulo(comprimento,altura);
       
       
         System.out.println("digite o comprimento do triangulo: ");
        comprimento = ler.nextInt();
          System.out.println("digite o altura do triangulo: ");
        altura = ler.nextInt();
     Triangulo t = new Triangulo(comprimento, altura);
       
      r.calculArea();
        System.out.println("sua area do retangulo e: "+r.getArea());
     
     t.calculArea();
        System.out.println("sua area do triangulo: "+t.getArea());
     
       
        
         
    }
}
