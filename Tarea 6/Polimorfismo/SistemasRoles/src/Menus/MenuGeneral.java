package Menus;


public abstract class MenuGeneral {

    public void mostrarMenu(){ //Metodo para mostrar menu
        System.out.println("Bienvendio al menu de opciones");
        System.out.println( "Seleccione una opcion para iniciar");
    }
    public void mostrarDespedida(){
        System.out.println( "0. Volver");
    }
}
