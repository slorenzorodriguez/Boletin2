/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin2_3;

import java.util.Scanner;

/**
 *
 * @author slorenzorodriguez
 */
public class Boletin2_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ler=new Scanner(System.in);
        int billeteDe100, billeteDe20, billeteDe5, moedaDe1, euros;
        System.out.println("número de billetes de 100");
        billeteDe100=ler.nextInt();
        System.out.println("número de billetes de 20");
        billeteDe20=ler.nextInt();
        System.out.println("número de billetes de 5");
        billeteDe5=ler.nextInt();
        System.out.println("número de moedas de 1");
        moedaDe1=ler.nextInt();
        euros=(billeteDe100*100+billeteDe20*20+billeteDe5*5+moedaDe1*1);
        System.out.println(billeteDe100 + " billetes de 100 euros, " + billeteDe20 + " billetes de 20 euros, " + billeteDe5 + " billetes de 5 euros, " + moedaDe1 + " moedas de 1 euro son " + euros + " euros");
       
    }
    
}
