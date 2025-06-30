
package sebasdev.u2lab1_ssrc;

/**
 *
 * @author sebas
 */
public class Usuario {
    private String usuario;
    private String clave;
    private String rol;
    
    public Usuario (String usuario,  String clave, String rol){
        this.usuario=usuario;
        this.clave=clave;
        this.rol=rol;
    }
    
    public String getUsername() {
        return usuario;
    }
    public String getClave() {
        return clave;
    }
    public String getRol() {
        return rol;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }
    
    public boolean esAlumno() {
        return "Alumno".equalsIgnoreCase(rol);
    }
    public boolean esProfesor() {
        return "Profesor".equalsIgnoreCase(rol);
    }
    public boolean validar(String u, String c) {
        return this.usuario.equals(u) && this.clave.equals(c);
    }
    @Override
    public String toString() {
        return usuario + " (" + rol + ")";
    }
}

