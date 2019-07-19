package entidades;
// Generated 19-jul-2019 0:34:11 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Usuario generated by hbm2java
 */
public class Usuario  implements java.io.Serializable {


     private int idUsuario;
     private Cliente cliente;
     private Personal personal;
     private String nombreUsuario;
     private String password;
     private Set reservacitas = new HashSet(0);

    public Usuario() {
    }

	
    public Usuario(int idUsuario, String nombreUsuario, String password) {
        this.idUsuario = idUsuario;
        this.nombreUsuario = nombreUsuario;
        this.password = password;
    }
    public Usuario(int idUsuario, Cliente cliente, Personal personal, String nombreUsuario, String password, Set reservacitas) {
       this.idUsuario = idUsuario;
       this.cliente = cliente;
       this.personal = personal;
       this.nombreUsuario = nombreUsuario;
       this.password = password;
       this.reservacitas = reservacitas;
    }
   
    public int getIdUsuario() {
        return this.idUsuario;
    }
    
    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }
    public Cliente getCliente() {
        return this.cliente;
    }
    
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public Personal getPersonal() {
        return this.personal;
    }
    
    public void setPersonal(Personal personal) {
        this.personal = personal;
    }
    public String getNombreUsuario() {
        return this.nombreUsuario;
    }
    
    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }
    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    public Set getReservacitas() {
        return this.reservacitas;
    }
    
    public void setReservacitas(Set reservacitas) {
        this.reservacitas = reservacitas;
    }




}


