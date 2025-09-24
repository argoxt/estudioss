import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. Pedir datos
        System.out.print("Ingrese el nombre del cliente: ");
        String nombre = sc.nextLine();

        System.out.print("Ingrese el ancho del tatuaje (cm): ");
        double ancho = sc.nextDouble();

        System.out.print("Ingrese el alto del tatuaje (cm): ");
        double alto = sc.nextDouble();

        System.out.print("Ingrese el número de colores: ");
        int colores = sc.nextInt();

        // 2. Calcular área
        double area = ancho * alto;

        // 3. Subtotal (2 € por cm²)
        double subtotal = area * 2;

        // 4. Mano de obra fija
        double manoObra = 40;

        // 5. Incremento por colores
        double incrementoColores = 0;
        if (colores == 2) {
            incrementoColores = 10;
        } else if (colores == 3) {
            incrementoColores = 15;
        }

        // 6. Descuento por área
        double descuento = 0;
        if (area > 300) {
            descuento = 30;
        } else if (area > 200) {
            descuento = 20;
        } else if (area > 100) {
            descuento = 10;
        }

        // 7. Total neto
        double total = (subtotal + manoObra + incrementoColores) - descuento;

        // 8. Mostrar resultados
        System.out.println("\n--- FACTURA ---");
        System.out.println("Cliente: " + nombre);
        System.out.println("Área: " + area + " cm²");
        System.out.println("Subtotal: " + subtotal + " €");
        System.out.println("Mano de obra: " + manoObra + " €");
        System.out.println("Incremento por colores: " + incrementoColores + " €");
        System.out.println("Descuento aplicado: " + descuento + " €");
        System.out.println("TOTAL NETO: " + total + " €");

        sc.close();
    }
}
