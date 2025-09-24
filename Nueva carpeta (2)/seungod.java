import java.util.Scanner;
public class seungod {
    public static void main(String[] args) {


        int material = 0;      
          
        double extraMaterial = 0;

        Scanner scanner = new Scanner(System.in);

        
        System.out.println("ingrese su nombre: ");
        
        String nombre = scanner.nextLine();
        
        System.out.println("ingrese alto: ");
        
        double alto = scanner.nextInt();
        
        System.out.println("ingrese ancho: ");
        
        double ancho = scanner.nextDouble();
        
        System.out.println("ingrese el largo; ");
        
        double largo = scanner.nextDouble();
        
        int mano0bra = 25;

        double area = alto * ancho * largo;
        
        double descuento= 0;

       
        double precioBase = 0.5;
        double subtotal = area * precioBase;


        System.out.println("ingrese el material que desea: 1. madera 2. acero 3. titanio ");
        material = scanner.nextInt();
        System.out.println();
        switch (material) {
            case 1:
                extraMaterial= 0;
                break;
                case 2:
                extraMaterial= 20;
                break;
                case 3:
                extraMaterial= 50;
        
            default:
            System.out.println("material no valido ");
                break;
        }

        if (area > 500){
            descuento = 15;}
            else if (area > 1000){
                descuento = 40;
            } else if (area > 2000){
                descuento = 80;
            } else {
                descuento = 0;
            } 

        double total = (subtotal + extraMaterial + mano0bra) - descuento;
        System.out.println("el total a pagar es: " + total);
       



       

    
        



    }
}
