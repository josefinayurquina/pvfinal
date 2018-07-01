package aplicacion.modelo.dominio;
// Generated 21/06/2018 23:28:52 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 *Peliculas generated by hbm2java
 */
public class Pelicula  implements java.io.Serializable {


     private Integer pelCodigo;
     private String pelNombre;
     private String pelDescripcion;
     private boolean pelEstado;
     

    public Pelicula() {
    }

	
    public Pelicula(String pelNombre, String pelDescripcion, boolean pelEstado) {
        this.pelNombre = pelNombre;
        this.pelDescripcion = pelDescripcion;
        this.pelEstado = pelEstado;
    }
    
   
    public Integer getPelCodigo() {
        return this.pelCodigo;
    }
    
    public void setPelCodigo(Integer pelCodigo) {
        this.pelCodigo = pelCodigo;
    }
    public String getPelNombre() {
        return this.pelNombre;
    }
    
    public void setPelNombre(String pelNombre) {
        this.pelNombre = pelNombre;
    }
    public String getPelDescripcion() {
        return this.pelDescripcion;
    }
    
    public void setPelDescripcion(String pelDescripcion) {
        this.pelDescripcion = pelDescripcion;
    }
    public boolean isPelEstado() {
        return this.pelEstado;
    }
    
    public void setPelEstado(boolean pelEstado) {
        this.pelEstado = pelEstado;
    }
    


}


