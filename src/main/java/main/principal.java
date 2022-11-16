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


/**
 *
 * @author cosmo
 */
public class principal {
    public static ArrayList<cliente> personal =new ArrayList<cliente> ();
        public static void main(String[] args) {
            int_menu menu=new int_menu();
            menu.menu_inicio(personal);
    }
}
