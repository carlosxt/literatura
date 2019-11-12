package proyecto2.java.entities;
public class Editoriales {
    private int   editorial_id;
    private String nombre;
    
    public Editoriales(){
    
    }

    public Editoriales(String nombre) {
        this.nombre = nombre;
    }

    public Editoriales(int editorial_id, String nombre) {
        this.editorial_id = editorial_id;
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Editoriales{" + "editorial_id=" + editorial_id + ", nombre=" + nombre + '}';
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEditorial_id() {
        return editorial_id;
    }

    public void setEditorial_id(int editorial_id) {
        this.editorial_id = editorial_id;
    }
    
}
