public class carro {
//atrivutos
    private double peso;
    private String marca;
    
    //constructor defecto
    public carro(){
        peso = 1000;
        marca = " chevrolet";

    }

    //constructor con parametros
    public carro (double peso, String marca){
        this.peso = peso;
        this.marca = marca;


    }

    //metodos get y set
    public double getPeso(){
        return peso;
    }
    public String getMarca(){
        return marca;
    }
    public void setPeso(double peso){
        this.peso = peso;

    }
}


