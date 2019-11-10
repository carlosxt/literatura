package proyecto2.java.entities;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "autores")
@NamedQueries({
    @NamedQuery(name = "Autores.findAll", query = "SELECT a FROM Autores a"),
    @NamedQuery(name = "Autores.findByAutorId", query = "SELECT a FROM Autores a WHERE a.autorId = :autorId"),
    @NamedQuery(name = "Autores.findByNombre", query = "SELECT a FROM Autores a WHERE a.nombre = :nombre"),
    @NamedQuery(name = "Autores.findByApellido", query = "SELECT a FROM Autores a WHERE a.apellido = :apellido"),
    @NamedQuery(name = "Autores.findByA\u00f1oNacimiento", query = "SELECT a FROM Autores a WHERE a.a\u00f1oNacimiento = :a\u00f1oNacimiento"),
    @NamedQuery(name = "Autores.findByNacionalidad", query = "SELECT a FROM Autores a WHERE a.nacionalidad = :nacionalidad"),
    @NamedQuery(name = "Autores.findByDistinciones", query = "SELECT a FROM Autores a WHERE a.distinciones = :distinciones")})
public class Autores implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "autor_id")
    private Integer autorId;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "apellido")
    private String apellido;
    @Column(name = "a\u00f1o_nacimiento")
    private Integer añoNacimiento;
    @Column(name = "nacionalidad")
    private String nacionalidad;
    @Column(name = "distinciones")
    private String distinciones;
    @OneToMany(mappedBy = "autorId")
    private Collection<Libros> librosCollection;

    public Autores() {
    }

    public Autores(Integer autorId) {
        this.autorId = autorId;
    }

    public Integer getAutorId() {
        return autorId;
    }

    public Autores(String nombre, String apellido, Integer añoNacimiento, String nacionalidad, String distinciones) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.añoNacimiento = añoNacimiento;
        this.nacionalidad = nacionalidad;
        this.distinciones = distinciones;
    }

    public Autores(Integer autorId, String nombre, String apellido, Integer añoNacimiento, String nacionalidad, String distinciones) {
        this.autorId = autorId;
        this.nombre = nombre;
        this.apellido = apellido;
        this.añoNacimiento = añoNacimiento;
        this.nacionalidad = nacionalidad;
        this.distinciones = distinciones;
    }
    
    public void setAutorId(Integer autorId) {
        this.autorId = autorId;
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

    public Integer getAñoNacimiento() {
        return añoNacimiento;
    }

    public void setAñoNacimiento(Integer añoNacimiento) {
        this.añoNacimiento = añoNacimiento;
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

    public Collection<Libros> getLibrosCollection() {
        return librosCollection;
    }

    public void setLibrosCollection(Collection<Libros> librosCollection) {
        this.librosCollection = librosCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (autorId != null ? autorId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Autores)) {
            return false;
        }
        Autores other = (Autores) object;
        if ((this.autorId == null && other.autorId != null) || (this.autorId != null && !this.autorId.equals(other.autorId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Autores{" + "autorId=" + autorId + ", nombre=" + nombre + ", apellido=" + apellido + ", a\u00f1oNacimiento=" + añoNacimiento + ", nacionalidad=" + nacionalidad + ", distinciones=" + distinciones + '}';
    }

    
    
}
