package Menus;

public class MenuAdministrador extends MenuGeneral {
    @Override
    public void mostrarMenu(){
        super.mostrarMenu();
        System.out.println( "1.Devolucion");
        System.out.println ("2.Descuento");
        super.mostrarDespedida();
    }
}
