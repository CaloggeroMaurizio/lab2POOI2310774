/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pc;
import java.util.Scanner;

/**
 *
 * @author Alumno
 */
public class Ejercicio3 {
    public static void main(String[] args){
        double Salario;
        double rating;
        double raise;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Ingrese el salario actual: ");
        Salario = scan.nextDouble();
        
        System.out.println("Ingrese la calificación de desempeño: ");
        rating = scan.nextDouble();
        
        double aumento = 0; 
        
        if (rating == 1) {
            raise = Salario * 0.06;
        } else if (rating == 2) {
            raise = Salario * 0.04;
        } else if (rating == 3) {
            raise = Salario * 0.015;
        } else {
            System.out.println("Calificación no válida. Debe ser 1, 2 o 3.");
        }
        {
         Scanner.close();
            return; 
        }
        
                
    }
}
