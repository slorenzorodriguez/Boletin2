/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin2_2;

import java.util.Scanner;

/**
 *
 * @author slorenzorodriguez
 */
public class Boletin2_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ler=new Scanner(System.in);
        float graosCentigrados=0, graosFarenheit, graosKelvin;
        System.out.println("teclea os graos centigrados");
         graosCentigrados=ler.nextFloat();
         graosFarenheit=(graosCentigrados*9/5)+32;
         graosKelvin=graosCentigrados+273.15F;
         System.out.println(graosCentigrados+" graos centigrados serán "+ graosFarenheit+" graos Farenheit");
         System.out.println(graosCentigrados+" graos centigrados serán "+ graosKelvin+" graos Kelvin");
        
                 
    }
    
}
