class Libro{
    String titulo; 
    String autor;
    String codigo;
    boolean estado;
    String nombre;
    String id;
    int librosPrestados;

    public Libro(String titulo, String autor, String codigo, boolean estado, String nombre, String id, int librosPrestados){
        this.titulo = titulo;
        this.autor = autor;
        this.codigo = codigo;
        this.estado = estado;
        this.nombre = nombre;
        this.id = id;
        this.librosPrestados = librosPrestados;
        
    }
    public void Prestar(Libro libro){
        System.out.println("Se presto el libro " + libro.titulo);
        libro.estado = false;
}
    public void Devolver(Libro libro){
        System.out.println("Se devolvio el libro " + libro.titulo);
        libro.estado = true;
    }
    public void prestarLibro(Libro libro){
        System.out.println("Se le presto el libro "+ libro.titulo +" a " + libro.nombre);
        libro.estado = false;
    }
    public void devolverLibro(Libro libro){
        System.out.println(libro.nombre+" devolvio el libro "+ libro.titulo );
        libro.estado = true;
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        Libro libro = new Libro("Divina Comedia", "Dante", "1923", true, "Juan", "1092", 0);
        

    }
}
