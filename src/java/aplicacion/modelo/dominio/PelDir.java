package aplicacion.modelo.dominio;
// Generated 21/06/2018 23:28:52 by Hibernate Tools 4.3.1

import aplicacion.modelo.dominio.Director;




/**
 * PelDir generated by hbm2java
 */
public class PelDir  implements java.io.Serializable {


     private Integer pdCodigo;
     private Director directores;
     private Pelicula peliculas;
     private boolean pdEstado;

    public PelDir() {
    }

    public PelDir(Director directores, Pelicula peliculas, boolean pdEstado) {
       this.directores = directores;
       this.peliculas = peliculas;
       this.pdEstado = pdEstado;
    }
   
    public Integer getPdCodigo() {
        return this.pdCodigo;
    }
    
    public void setPdCodigo(Integer pdCodigo) {
        this.pdCodigo = pdCodigo;
    }
    public Director getDirectores() {
        return this.directores;
    }
    
    public void setDirectores(Director directores) {
        this.directores = directores;
    }
    public Pelicula getPeliculas() {
        return this.peliculas;
    }
    
    public void setPeliculas(Pelicula peliculas) {
        this.peliculas = peliculas;
    }
    public boolean isPdEstado() {
        return this.pdEstado;
    }
    
    public void setPdEstado(boolean pdEstado) {
        this.pdEstado = pdEstado;
    }




}


