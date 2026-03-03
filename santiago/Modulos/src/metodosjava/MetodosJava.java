package metodosjava;

import java.util.Scanner;
public class MetodosJava {


    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char opcion;
        Double nro1, nro2;
        // Leer los numeros
        System.out.print("Numero 1: ");
        nro1 = sc.nextDouble();
        System.out.print("Numero 2: ");
        nro2 = sc.nextDouble();
        do{

            System.out.println("Menú de Operaciones Matematicas \n");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Exponente");
            System.out.println("6. Radical");
            System.out.println("7. Terminar");
            //System.out.println("\n");
            System.out.print(" Opción: ");
            opcion = sc.next().charAt(0);
            double resultado = switch (opcion) {
                case '1' -> Operaciones.sumar(nro1, nro2);
                case '2' -> Operaciones.restar(nro1, nro2);
                case '3' -> Operaciones.multiplicar(nro1, nro2);
                case '4' -> Operaciones.dividir(nro1, nro2);
                case '5' -> Operaciones.potenciar(nro1, nro2);
                case '6' -> Operaciones.radicar(nro1, nro2);
                default -> 0.0;
            };
            System.out.println("El resultado es: "+resultado);
        } while (opcion != '7' );

    }

}
