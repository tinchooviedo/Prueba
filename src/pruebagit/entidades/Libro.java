package pruebagit.entidades;


public class Libro {

    private Integer isbn;

    private String titulo;

    private String autor;

    private Integer ejemplaresPrestados;

    private Integer ejemplares;

    public Libro(Integer isbn, String titulo, String autor, Integer ejemplaresPrestados, Integer ejemplares) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.ejemplaresPrestados = ejemplaresPrestados;
        this.ejemplares = ejemplares;
    }

    public Libro() {
    }
    
    

    public Integer getIsbn() {
        return isbn;
    }

    public void setIsbn(Integer isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Integer getEjemplaresPrestados() {
        return ejemplaresPrestados;
    }

    public void setEjemplaresPrestados(Integer ejemplaresPrestados) {
        this.ejemplaresPrestados = ejemplaresPrestados;
    }

    public Integer getEjemplares() {
        return ejemplares;
    }

    public void setEjemplares(Integer ejemplares) {
        this.ejemplares = ejemplares;
    }

    
    
    
}
