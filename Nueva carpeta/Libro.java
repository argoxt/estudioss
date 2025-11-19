public class Libro {

    private String titulo;
    private String autor;
    private int añoPublicacion;
    private int stock; //agregamos atributo stock

    public Libro() {
        this.titulo = "Desconocido";
        this.autor = "Anónimo";
        this.añoPublicacion = 0;
        this.stock = 0; //agregamos inicialización de stock
    }

    public Libro(String titulo, String autor, int añoPublicacion) {
        this(titulo, autor, añoPublicacion, 1);
    }

    public Libro(String titulo, String autor, int añoPublicacion, int stock) {
        this.titulo = titulo;
        this.autor = autor;
        this.añoPublicacion = añoPublicacion;
        this.stock = Math.max(0, stock);
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAñoPublicacion() {
        return añoPublicacion;
    }

    public int getStock() {
        return stock; //agregamos método getStock
    }

    public boolean isDisponible() {
        return stock > 0; 
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setAñoPublicacion(int añoPublicacion) {
        this.añoPublicacion = añoPublicacion;
    }

    public void setStock(int stock) {
        this.stock = Math.max(0, stock);
    }

    public void prestar() {
        if (stock > 0) {
            stock--;
            System.out.println("ne presto 1 ejemplar de '" + titulo + "'. stock restante: " + stock);
        } else {
            System.out.println("no hay libros disponibles de '" + titulo + "' para préstamo.");
        }
    }

    public void devolver() {
        stock++;
        System.out.println("se 1 libro de '" + titulo + "'. stock actual: " + stock);
    }

    public void mostrarInformacion() {
        System.out.println("\nInformación del libro:");
        System.out.println("titulo: " + titulo);
        System.out.println("autor: " + autor);
        System.out.println("año de publicación: " + añoPublicacion);
        System.out.println("stock: " + stock);
        System.out.println("disponible: " + (isDisponible() ? "si" : "no"));
    }

    public static void main(String[] args) {
        System.out.println("=== EJEMPLO ===");

        Libro libro1 = new Libro();
        Libro libro2 = new Libro("cien años de soledad", "Gabriel García Márquez", 1967, 4);

        libro1.mostrarInformacion();
        libro2.mostrarInformacion();

        libro1.setTitulo("el principito");
        libro1.setAutor("antoine de Saint-Exupéry");
        libro1.setAñoPublicacion(1943);
        libro1.setStock(10);

        System.out.println("\ndespues de modificar libro1:");
        libro1.mostrarInformacion();

        libro1.prestar();
        libro1.prestar();
        libro1.prestar();
        libro1.prestar(); 
        // prestamos 4 veces el libro1
        libro2.prestar();
        libro2.prestar();
        libro2.prestar(); 
        // prestamos 3 veces el libro2
        System.out.println("\nEstado final de los libros:");
        libro1.mostrarInformacion();
        libro2.mostrarInformacion();
    }
}
