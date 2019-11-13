package proyecto2.java.entities;
public class Libros {
    private int      libro_id;
    private String   nombre_libro;
    private String   genero_libro;
    private int      editorial_id;
    private int      autor_id;
    
    public Libros(){
    
    }

    public Libros(String nombre_libro, String genero_libro, int editorial_id, int autor_id) {
        this.nombre_libro = nombre_libro;
        this.genero_libro = genero_libro;
        this.editorial_id = editorial_id;
        this.autor_id = autor_id;
    }

    public Libros(int libro_id, String nombre_libro, String genero_libro, int editorial_id, int autor_id) {
        this.libro_id = libro_id;
        this.nombre_libro = nombre_libro;
        this.genero_libro = genero_libro;
        this.editorial_id = editorial_id;
        this.autor_id = autor_id;
    }

    @Override
    public String toString() {
        return "Libros{" + "libro_id=" + libro_id + ", nombre_libro=" + nombre_libro + ", genero_libro=" + genero_libro + ", editorial_id=" + editorial_id + ", autor_id=" + autor_id + '}';
    }
    
    public int getLibro_id() {
        return libro_id;
    }

    public void setLibro_id(int libro_id) {
        this.libro_id = libro_id;
    }

    public String getNombre_libro() {
        return nombre_libro;
    }

    public void setNombre_libro(String nombre_libro) {
        this.nombre_libro = nombre_libro;
    }

    public String getGenero_libro() {
        return genero_libro;
    }

    public void setGenero_libro(String genero_libro) {
        this.genero_libro = genero_libro;
    }

    public int getEditorial_id() {
        return editorial_id;
    }

    public void setEditorial_id(int editorial_id) {
        this.editorial_id = editorial_id;
    }

    public int getAutor_id() {
        return autor_id;
    }

    public void setAutor_id(int autor_id) {
        this.autor_id = autor_id;
    }
            
}
