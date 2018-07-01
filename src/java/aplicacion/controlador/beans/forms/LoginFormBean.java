/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.controlador.beans.forms;


//import aplicacion.datos.TablaUsuarios;
import aplicacion.controlador.beans.UsuarioBean;
import aplicacion.modelo.dominio.Usuario;
import java.io.Serializable;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

/**
 *
 * @author Florencia
 */
@ManagedBean
@ViewScoped
public class LoginFormBean implements Serializable{
    @ManagedProperty(value="#{usuarioBean}")
    UsuarioBean usuarioBean;
    private String nombreUs;
    private String paswUs;

    /**
     * Creates a new instance of LoginFormBean
     */
    public LoginFormBean() {
        usuarioBean=new UsuarioBean();
    }
    public String validarUsuario(){
        String resultado=null;
        Usuario usuario=null;
        usuario=usuarioBean.validarUsuario(nombreUs, paswUs);
        if(usuario==null){
            FacesMessage facesMessage=new FacesMessage(FacesMessage.SEVERITY_ERROR,"Credenciales Invalidas","No existe el usuario");
          FacesContext.getCurrentInstance().addMessage(null,facesMessage);
        }
        else{
             FacesMessage facesMessage=new FacesMessage(FacesMessage.SEVERITY_INFO,"Credenciales validas"," usuario valido");
          FacesContext.getCurrentInstance().addMessage(null,facesMessage);
          FacesContext.getCurrentInstance().getExternalContext().getSessionMap().put("UsuarioValidado",usuario);
          resultado="/indexElect";
        }
        return resultado;
    }
    public String getNombreUsuarioValidado(){
        Usuario usuario=(Usuario)FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("usuarioValidado");
        return usuario.getUsuNombreUsuario();
    }
  public String cerrarSesion(){
      FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
      FacesMessage facesMessage=new FacesMessage(FacesMessage.SEVERITY_INFO,"Sesion Cerrada","Sesion Cerrada");
      FacesContext.getCurrentInstance().addMessage(null, facesMessage);
      String resultado="/login";
      return resultado;
  }
  public int verificarSesion(){
      boolean sesionValida=false;
      int tipo=0;
      Usuario usuario=(Usuario)FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("usuarioValidado");
      if(usuario!=null){
          sesionValida=true;
          if(usuario.getUsuTipoUsuario().equals("final")){
              tipo=2;
          }
      }
      
    return tipo;
  }
    /**
     * @return the nombreUs
     */
    public String getNombreUs() {
        return nombreUs;
    }

    /**
     * @param nombreUs the nombreUs to set
     */
    public void setNombreUs(String nombreUs) {
        this.nombreUs = nombreUs;
    }

    /**
     * @return the paswUs
     */
    public String getPaswUs() {
        return paswUs;
    }

    /**
     * @param paswUs the paswUs to set
     */
    public void setPaswUs(String paswUs) {
        this.paswUs = paswUs;
    }
    
}
