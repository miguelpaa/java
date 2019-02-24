/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programas;

import java.util.Scanner;

public class Multiplicacion {
    Scanner entrada = new Scanner (System.in);
    
    public void multi(){
        int n1, n2;
        System.out.print("Ingrese primer valor:");
        n1 = entrada.nextInt();
        System.out.print("Ingrese segundo valor:");
        n2 = entrada.nextInt();

        System.out.println("La multiplicación es :" + n1*n2 );
        
    }
}
