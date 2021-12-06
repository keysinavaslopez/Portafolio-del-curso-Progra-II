package Servicios;

import Entidades.Persona;
import Interfaces.Desplegable;
import Menus.MenuGeneral;
public abstract class Transacciones implements Desplegable{
    protected void movimientos(Persona cliente, MenuGeneral menu ){
      menu.mostrarMenu();
      int opcionSeleccionada = this.elegirOpcion();
      while(opcionSeleccionada > 0){
          menu.mostrarMenu();
          opcionSeleccionada = this.elegirOpcion();
      }
    }
    
    @Override
    public int elegirOpcion(){
        return 0;
    }
}
