/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin2_4;

import java.util.Scanner;

/**
 *
 * @author slorenzorodriguez
 */
public class Boletin2_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ler= new Scanner(System.in);
        float cantidad1=0;
        int billetesDe100, billetesDe20, billetesDe5,moedasDe1;
        System.out.println("Cantidad de dinero");
        cantidad1=ler.nextFloat();
        billetesDe100=(int) (cantidad1/100);
        billetesDe20= (int) ((cantidad1%100)/20);
        billetesDe5= (int) ((cantidad1%100)%20/5);
        moedasDe1= (int) cantidad1%100%20%5;
        System.out.println(cantidad1+" euros son "+billetesDe100+" billetes de 100 euros");
        System.out.println(cantidad1+" euros son "+billetesDe20+ "billetes de 20 euros");
        System.out.println(cantidad1+" euros son "+billetesDe5+ "billetes de 5 euros");
        System.out.println(cantidad1+" euros son "+moedasDe1+ "moedas de 1 euro");
                
    }
    
}
