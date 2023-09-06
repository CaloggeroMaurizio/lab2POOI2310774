package pc;

import java.util.Scanner;

       
public class Ejercicio2 {
    
    private static final Scanner scanner = new Scanner(System.in);
   
    public static void main (String[] args) {
        
        int N = scanner.nextInt();
        
        
          if (N % 2 != 0) {
            System.out.println("Luna");
        } else {
            if (N >= 2 && N <= 5) {
                System.out.println("Sol");
            } else if (N >= 6 && N <= 20) {
                System.out.println("Tierra");
            } else if (N > 20) {
                System.out.println("Galaxia");
            } else {
                System.out.println("Número fuera de rango");
        
    }
          }
    }
    
    
}
