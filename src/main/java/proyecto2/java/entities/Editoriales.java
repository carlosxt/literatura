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
@Table(name = "editoriales")
@NamedQueries({
    @NamedQuery(name = "Editoriales.findAll", query = "SELECT e FROM Editoriales e"),
    @NamedQuery(name = "Editoriales.findByEditorialId", query = "SELECT e FROM Editoriales e WHERE e.editorialId = :editorialId"),
    @NamedQuery(name = "Editoriales.findByNombre", query = "SELECT e FROM Editoriales e WHERE e.nombre = :nombre")})
public class Editoriales implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "editorial_id")
    private Integer editorialId;
    @Column(name = "nombre")
    private String nombre;
    @OneToMany(mappedBy = "editorialId")
    private Collection<Libros> librosCollection;

    public Editoriales() {
    }

    public Editoriales(Integer editorialId) {
        this.editorialId = editorialId;
    }

    public Integer getEditorialId() {
        return editorialId;
    }

    public Editoriales(String nombre) {
        this.nombre = nombre;
    }

    public Editoriales(Integer editorialId, String nombre) {
        this.editorialId = editorialId;
        this.nombre = nombre;
    }
    
    public void setEditorialId(Integer editorialId) {
        this.editorialId = editorialId;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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
        hash += (editorialId != null ? editorialId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Editoriales)) {
            return false;
        }
        Editoriales other = (Editoriales) object;
        if ((this.editorialId == null && other.editorialId != null) || (this.editorialId != null && !this.editorialId.equals(other.editorialId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Editoriales{" + "editorialId=" + editorialId + ", nombre=" + nombre + '}';
    }

    
    
}
