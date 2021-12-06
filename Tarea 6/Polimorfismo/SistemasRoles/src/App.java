import Servicios.Ventas;
import Entidades.Cajero;
import Entidades.Cliente;
import Menus.MenuCajero;
import Servicios.Compras;
import Entidades.Cajero;
import Entidades.Administrador;
import Entidades.Cliente;
import Menus.MenuCompra;
import Menus.MenuAdministrador;
import Menus.MenuCajero;

public class App {
    public static void main(String[] args) throws Exception {
        Ventas servicioVentas = new Ventas();
        servicioVentas.ventaCajero( new Cajero(),new MenuCajero());
  
    }
}
