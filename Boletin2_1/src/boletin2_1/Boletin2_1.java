/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin2_1;

import java.util.Scanner;

/**
 *
 * @author slorenzorodriguez
 */
public class Boletin2_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        float prezoTarifa=0, prezoPagado=0, porcentaxeDesconto;
        System.out.println("teclea prezo tarifa");
        prezoTarifa=ler.nextFloat();
        System.out.println("teclea prezo pagado");
        prezoPagado=ler.nextFloat();
        porcentaxeDesconto= prezoPagado*100/prezoTarifa;
        System.out.println("a porcentaxe descontada é do "+porcentaxeDesconto+"%");
        
        
        
        
          }
    
}
