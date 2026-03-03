
package metodosjava;

public class Operaciones {
    public static void saludar(String nombre){
        System.out.println("Hola, "+nombre);
    }
    public static Double sumar(Double valor1, Double valor2){
        return valor1 + valor2;
    }
    public static Double restar(Double valor1, Double valor2){
        return valor1 - valor2;
    }
    public static Double multiplicar(Double valor1, Double valor2){
        return valor1 * valor2;
    }
    public static Double dividir(Double valor1, Double valor2){
        return valor1 / valor2;
    }
    public static Double potenciar(Double valor1, Double valor2){
        return Math.pow(valor1, valor2);
    }
    public static Double radicar(Double valor1, Double valor2){
        return Math.pow(valor1, 1/valor2);
    }




}
