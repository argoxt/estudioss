public class UsoDelCarro {
    public static void main(String[] args) {
        //crear un objeto de la clase carro
        carro miCarro = new carro();
        
        //mostrar los valores por defecto
        System.out.println("Marca: " + miCarro.getMarca());
        System.out.println("Peso: " + miCarro.getPeso() + " kg");
        
        //modificar el peso del carro
        miCarro.setPeso(1200);
        
        //mostrar el peso modificado
        System.out.println("Peso modificado: " + miCarro.getPeso() + " kg");
    }

    
}
