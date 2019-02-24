package programas;
import java.util.Scanner;
/**
 *
 * @author DELL
 */
public class Programas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        int dato;
        int dato2;
        do{
        System.out.println(" .:Bienvenido:.");
        System.out.println("Seleccion la opcion deseada:.");
        System.out.println("1.- Suma de numeros");
        System.out.println("2.- Multiplicacion de dos numeros");
        System.out.println("3.- Division");
        System.out.println("4.- resta de dos numeros");
        System.out.println("opcion: ");
        dato = entrada.nextInt();
       
        
        switch(dato){
            case 1:
                 suma objeto1 = new suma();
                 objeto1.sum();
                break;
            case 2:
                Multiplicacion  objeto2 = new Multiplicacion();
                 objeto2.multi();
            case 3:
                division objeto3 = new division();
                 objeto3.divisionsita();
            case 4:
                resta objeto4 = new resta();
                 objeto4.rest();
            
        }
        
        System.out.println("desea terminar: ");
        System.out.println("1.- no ");
        System.out.println("2.- si ");
        dato2 = entrada.nextInt();
         }while( dato2 != 2);
        
    }
    
}
