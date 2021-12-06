package Entidades;
import Enums.Roles;
public abstract class Persona {
    private Roles role;
    private String nombre;
    private String apellido;
    private int cedula;
    public Persona(Roles rolesSeleccionado){
        role= rolesSeleccionado;
    }
    public Roles getRole(){return this.role;}    
}
