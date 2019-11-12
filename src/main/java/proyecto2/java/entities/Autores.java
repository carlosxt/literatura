package proyecto2.java.entities;
public class Autores {
               
     private int      autor_id;         
     private String   nombre;           
     private String   apellido;        
     private int      año_nacimiento;  
     private String   nacionalidad;    
     private String   distinciones;    
     
     public Autores(){
     
     }

    public Autores(String nombre, String apellido, int año_nacimiento, String nacionalidad, String distinciones) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.año_nacimiento = año_nacimiento;
        this.nacionalidad = nacionalidad;
        this.distinciones = distinciones;
    }

    public Autores(int autor_id, String nombre, String apellido, int año_nacimiento, String nacionalidad, String distinciones) {
        this.autor_id = autor_id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.año_nacimiento = año_nacimiento;
        this.nacionalidad = nacionalidad;
        this.distinciones = distinciones;
    }

    @Override
    public String toString() {
        return "Autores{" + "autor_id=" + autor_id + ", nombre=" + nombre + ", apellido=" + apellido + ", año_nacimiento=" + año_nacimiento + ", nacionalidad=" + nacionalidad + ", distinciones=" + distinciones + '}';
    }

    public int getAutor_id() {
        return autor_id;
    }

    public void setAutor_id(int autor_id) {
        this.autor_id = autor_id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getAño_nacimiento() {
        return año_nacimiento;
    }

    public void setAño_nacimiento(int año_nacimiento) {
        this.año_nacimiento = año_nacimiento;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getDistinciones() {
        return distinciones;
    }

    public void setDistinciones(String distinciones) {
        this.distinciones = distinciones;
    }
    
}
