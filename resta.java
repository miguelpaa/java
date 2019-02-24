/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programas;

import java.util.Scanner;

public class resta {
    
    Scanner entrada = new Scanner(System.in);
   
    public void rest(){
         int num1,num2, resta;
         System.out.println("Dijte el numero 1: ");
         num1 = entrada.nextInt();
         System.out.println("Dijite el numero 2: ");
         num2 = entrada.nextInt();
         
         resta = num1 - num2;
         System.out.println("La resta es: "+resta);
         
    }        
    
}
