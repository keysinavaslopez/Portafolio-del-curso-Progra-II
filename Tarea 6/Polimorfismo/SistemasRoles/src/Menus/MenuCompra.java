package Menus;

public class MenuCompra extends MenuGeneral{
    @Override
    public void mostrarMenu(){
        super.mostrarMenu();
        System.out.println( "1.Tecnologia");
        System.out.println( "2.Decoracion");
        System.out.println( "3.Muebles");
        System.out.println( "4.Volver");
        super.mostrarDespedida();
    }
}
