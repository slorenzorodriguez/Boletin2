/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin2_5;

import java.util.Scanner;

/**
 *
 * @author slorenzorodriguez
 */
public class Boletin2_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner (System.in);
        double sueldoBruto, sueldoLiquido , sueldoFijo, km, dias, ventas;
        System.out.println("Introduzca sueldo fijo: ");
        sueldoFijo = leer.nextDouble();
        System.out.println("Introduzca quilometraje: ");
        km = leer.nextDouble();
        System.out.println("Introduzca dias desplazamiento: ");
        dias = leer.nextDouble();
        System.out.println("Importe de las ventas ");
        ventas = leer.nextDouble();
        sueldoBruto= sueldoFijo + (km*2) + (dias*30) + (ventas*5/100);
        sueldoLiquido= sueldoBruto - (sueldoBruto*18/100) - 36;
        System.out.println("El empleado tiene un saldo bruto de "+sueldoBruto+" € pero su saldo neto es de " +sueldoLiquido+ "€");
    }
    
}
