package Menus;

public class MenuCajero extends MenuGeneral{
    @Override
    public void mostrarMenu(){
        super.mostrarMenu();
        System.out.println("1.Venta minorista");
        System.out.println("2.Venta mayorista");
        super.mostrarDespedida();
    }
}
