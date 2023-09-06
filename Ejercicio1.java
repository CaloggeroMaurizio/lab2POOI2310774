/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pc;

import java.util.Scanner;

/**
 *
 * @author Alumno
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero a evaluar: ");
        
        try{
 
            long x=sc.nextLong();
            System.out.println(x+ " puede ser almacenado en: ");
            
            if (x >= Byte.MIN_VALUE && x <= Byte.MAX_VALUE) {
            System.out.println("Puede ser almacenado en byte.");
        }
        if (x >= Short.MIN_VALUE && x <= Short.MAX_VALUE) {
            System.out.println("Puede ser almacenado en short.");
        }
        if (x >= Integer.MIN_VALUE && x <= Integer.MAX_VALUE) {
            System.out.println("Puede ser almacenado en int.");
        }
        System.out.println("Puede ser almacenado en long.");
                
          
        
        } catch (Exception x){
            System.out.println( "no puede ser almacenado en ningun lado");
         
        }
    }
}
        

