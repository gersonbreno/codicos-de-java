/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.questao01;

/**
 *
 * @author Usuário
 */
public class Retangulo extends Poligono{
     private double area;

    public Retangulo( int comprimento, int altura) {
        super(comprimento, altura);
   
    }

    public Retangulo() {
      super();
     
        
    }
    

    @Override
    public void setAltura(int altura) {
        super.setAltura(altura); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public int getAltura() {
        return super.getAltura(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getArea() {
        return area;
    }

    @Override
    public void setComprimento(int comprimento) {
        super.setComprimento(comprimento); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public int getComprimento() {
        return super.getComprimento(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
     public double calculArea(){
         area = getComprimento() * getAltura();
         return getArea();
     }
     public void imprimir(){
         System.out.println("sua area: "+getArea());
     }
     
}
