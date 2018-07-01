/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.controlador.beans;

import aplicacion.modelo.dominio.VentaEntrada;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author Alumno
 */
@ManagedBean
@ViewScoped
public class VentaEntradaBean {

    /**
     * Creates a new instance of VentaEntradaBean
     */
    public VentaEntradaBean() {
    }
    public void agregarVentaEntrada(VentaEntrada unVentaEntrada){
        VentaEntradaDAO ventaEntradaDAO=new VentaEntradaDAOImp();
        ventaEntradaDAO.agregar(unVentaEntrada);
    }
    public List<VentaEntrada> listarVentaEntrada(){
        VentaEntradaDAO ventaEntradaDAO=new ventaEntradaDAOImp();
        return ventaEntradaDAO.obtenerTodos();
    }
    public void modificarVentaEntrada(VentaEntrada unVentaEntrada){
        VentaEntradaDAO ventaEntradaDAO=new VentaEntradaDAOImp();
        VentaEntradaDAO.modificar(unVentaEntrada);
    }
     public VentaEntrada consulta(String nombreUs,String passwdUs){
        VentaEntrada ventaEntrada=null;
        VentaEntradaDAO ventaEntradaDAO=new VentaEntradaDAOImp();
        ventaEntrada= ventaEntradaDAO.consulta(ButacaCartelera butacaCar,Perfil perf, String venPre, String venDescrip);
        return ventaEntrada;
        
    }
}
