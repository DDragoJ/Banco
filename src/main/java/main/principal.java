/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author cosmo
 * elaborar un programa en java que permita llevar el detalle de las cuentas
 * bancarias de una organizacion. se requiere conocer los detalles generales de
 * cada una de las cuentas, asi como transacciones efectuadas en cada una de 
 * ellas. tomese en consideracion que existen cuentas que deben acreditar
 * intereses y otras que generan costos de mantenimiento

 */

package main;
import Datos_Clases.cliente;
import java.util.ArrayList;
import CRUD.int_menu;
import Datos_Clases.cuenta;
import com.sun.org.apache.bcel.internal.generic.AALOAD;


/**
 *
 * @author cosmo
 */
public class principal {
    public static ArrayList<cliente> personal =new ArrayList<cliente> ();
        public static void main(String[] args) {
            int_menu menu=new int_menu();
            principal basado=new principal();
            personal=basado.carga();
            menu.menu_inicio(personal);
    }
        public ArrayList<cliente> carga(){
            cuenta cuenta1=new cuenta ("1","AHORRO",2.0,0);
            cuenta cuenta2=new cuenta ("2","CORRIENTE",10.0,0);
            cliente cliente1=new cliente ("as","1",0);
            cliente cliente2=new cliente ("ad","2",2);
            ArrayList<cuenta> defecto= new ArrayList<cuenta>();
            defecto.add(cuenta1);
            cliente1.setCuenta(defecto);
            defecto=new ArrayList<cuenta>();
            defecto.add(cuenta2);
            cliente2.setCuenta(defecto);
            ArrayList<cliente> lista=new ArrayList<cliente>();
            lista.add(cliente1);
            lista.add(cliente2);
            return lista;
        }
}
