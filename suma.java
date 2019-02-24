/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programas;
import java.util.Scanner;
/**
 *
 * @author DELL
 */
public class suma {
    public int numero=0;
    Scanner entrada = new Scanner(System.in);
    
   public  void sum(){
        int num1,sum=0,num2;
        System.out.println("Cuantos numeros desea sumar: ");
        num1 = entrada.nextInt();
        for (int i=1;i<=num1;i++){
            System.out.println("dijite el numero a sumar: "+i);
            num2 = entrada.nextInt();
            sum  += num2;
        }
        System.out.println("La suma es: "+sum);
    }
}
