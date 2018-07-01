/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.controlador.beans;

import aplicacion.modelo.dominio.Pelicula;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author Alumno
 */
@ManagedBean
@ViewScoped
public class PeliculaBean {

    /**
     * Creates a new instance of PeliculaBean
     */
    public PeliculaBean() {
    }
    public void agregarPelicula(Pelicula unPelicula){
        PeliculaDAO peliculaDAO=new PeliculaDAOImp();
        peliculaDAO.agregar(unPelicula);
    }
    public List<Pelicula> listarPelicula(){
        PeliculaDAO peliculaDAO=new PeliculaDAOImp();
        return peliculaDAO.obtenerTodos();
    }
    public void modificarPelicula(Pelicula unPelicula){
        PeliculaDAO peliculaDAO=new PeliculaDAOImp();
        peliculaDAO.modificar(unPelicula);
    }
     public Pelicula consulta(String nombreUs,String passwdUs){
        Pelicula pelicula=null;
        PeliculaDAO peliculaDAO=new PeliculaDAOImp();
        pelicula= peliculaDAO.consulta(String peNombre, String peDescrip);
        return pelicula;       
    }
}
