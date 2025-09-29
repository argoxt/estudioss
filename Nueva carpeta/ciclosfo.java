
import java.util.Scanner;
public class ciclosfo {

    public static void main(String[] args) {
       /*   
        int contador = 0;
        for (int i = 1; i <= 70; i++) {
            if (i % 7 == 0){
                contador++;
                System.out.println(i);
                

            }
        } 
      */

        // mostrar en pantalla las tabalas de multiplicar del 1 al 10
        
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese un numero");
       
        int numero = sc.nextInt();
    
        for (int a = 1; a <=10; a++);
        System.out.println("tablas d multiplicar");
        for (int b = 1; b <=10; b++){
        
            
            System.out.println(numero +  " x " + b + " = " + (numero*b));
        }

            
            

        

        

        
    }
    
}
