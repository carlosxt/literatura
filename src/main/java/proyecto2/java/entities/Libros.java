package proyecto2.java.entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "libros")
@NamedQueries({
    @NamedQuery(name = "Libros.findAll", query = "SELECT l FROM Libros l"),
    @NamedQuery(name = "Libros.findByLibroId", query = "SELECT l FROM Libros l WHERE l.libroId = :libroId"),
    @NamedQuery(name = "Libros.findByNombreLibro", query = "SELECT l FROM Libros l WHERE l.nombreLibro = :nombreLibro"),
    @NamedQuery(name = "Libros.findByGeneroLibro", query = "SELECT l FROM Libros l WHERE l.generoLibro = :generoLibro")})
public class Libros implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "libro_id")
    private Integer libroId;
    @Column(name = "nombre_libro")
    private String nombreLibro;
    @Column(name = "genero_libro")
    private String generoLibro;
    @JoinColumn(name = "autor_id", referencedColumnName = "autor_id")
    @ManyToOne
    private Autores autorId;
    @JoinColumn(name = "editorial_id", referencedColumnName = "editorial_id")
    @ManyToOne
    private Editoriales editorialId;

    public Libros() {
    }

    public Libros(Integer libroId) {
        this.libroId = libroId;
    }

    public Integer getLibroId() {
        return libroId;
    }

    public void setLibroId(Integer libroId) {
        this.libroId = libroId;
    }

    public String getNombreLibro() {
        return nombreLibro;
    }

    public void setNombreLibro(String nombreLibro) {
        this.nombreLibro = nombreLibro;
    }

    public String getGeneroLibro() {
        return generoLibro;
    }

    public void setGeneroLibro(String generoLibro) {
        this.generoLibro = generoLibro;
    }

    public Autores getAutorId() {
        return autorId;
    }

    public void setAutorId(Autores autorId) {
        this.autorId = autorId;
    }

    public Editoriales getEditorialId() {
        return editorialId;
    }

    public void setEditorialId(Editoriales editorialId) {
        this.editorialId = editorialId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (libroId != null ? libroId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Libros)) {
            return false;
        }
        Libros other = (Libros) object;
        if ((this.libroId == null && other.libroId != null) || (this.libroId != null && !this.libroId.equals(other.libroId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "proyecto2.java.entities.Libros[ libroId=" + libroId + " ]";
    }
    
}
