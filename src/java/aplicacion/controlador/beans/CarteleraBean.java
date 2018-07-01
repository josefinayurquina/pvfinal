/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.controlador.beans;

import aplicacion.modelo.dominio.Cartelera;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author Alumno
 */
@ManagedBean
@ViewScoped
public class CarteleraBean {

    /**
     * Creates a new instance of CarteleraBean
     */
    public CarteleraBean() {
    }
    public void agregarCartelera(Cartelera unCartelera){
        CarteleraDAO carteleraDAO=new CarteleraDAOImp();
        carteleraDAO.agregar(unCartelera);
    }
    public List<Cartelera> listarCartelera(){
        CarteleraDAO carteleraDAO=new CarteleraDAOImp();
        return carteleraDAO.obtenerTodos();
    }
    public void modificarCartelera(Cartelera unCartelera){
        CarteleraDAO carteleraDAO=new CarteleraDAOImp();
        carteleraDAO.modificar(unCartelera);
    }
     
}
