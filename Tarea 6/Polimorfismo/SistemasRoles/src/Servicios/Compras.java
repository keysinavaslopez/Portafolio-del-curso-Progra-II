package Servicios;
import Entidades.Persona;
import Entidades.Cliente;
import Menus.MenuCompra;
import Menus.MenuGeneral;

public class Compras extends Transacciones{
    public void compras(Persona cliente, MenuGeneral menu){
            this.movimientos((Cliente)cliente, (MenuCompra)menu);

    }
}
