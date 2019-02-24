/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programas;

import java.util.Scanner;

public class division {
    
    Scanner entrada = new Scanner (System.in);
    
    public void divisionsita(){
        float numero1 = 0;
        float numero2 = 0;
        float resultado;
        
        System.out.println("Introduce el primer número:");			
        numero1 = entrada.nextFloat();
 
        System.out.println("Introduce el segundo número:");
        numero2 = entrada.nextFloat();
        
        resultado = numero1/numero2;
        System.out.println("La división es " + numero1 + " / " + numero2 + " = " + resultado);
        
    }
    
}
