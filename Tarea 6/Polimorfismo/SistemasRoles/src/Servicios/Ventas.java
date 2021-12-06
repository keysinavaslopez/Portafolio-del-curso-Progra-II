package Servicios;
import Entidades.Cajero;
import Entidades.Persona;
import Entidades.Administrador;
import Menus.MenuCajero;
import Menus.MenuAdministrador;
import Menus.MenuGeneral;

public class Ventas extends Transacciones {
     public void ventaCajero(Persona cliente, MenuGeneral menu){
        this.movimientos((Cajero)cliente, (MenuCajero)menu);
     }
     public void ventaAdministrador(Persona cliente, MenuGeneral menu){
        this.movimientos((Administrador)cliente, (MenuAdministrador) menu);
     }
}
