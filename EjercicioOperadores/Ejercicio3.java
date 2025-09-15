public class Ejercicio3 {
    public static void main(String[] args) {
        int numeroUno = 8;
        int numeroDos = 2;

        int cambio = numeroUno;
        numeroUno = numeroDos;
        numeroDos = cambio;

        System.out.println("numeroUno: " + numeroUno);
        System.out.println("numeroDos: " + numeroDos);
    }
}
