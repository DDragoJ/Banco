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
import conexion_db.OperacionesCLiente;
import java.io.IOException;
import javax.xml.bind.JAXBException;



/**
 *
 * @author cosmo
 */
public class principal {
    public static ArrayList<cliente> personal =new ArrayList<cliente> ();
        public static void main(String[] args) throws JAXBException, IOException {
            int_menu menu=new int_menu();
            OperacionesCLiente archivo = new OperacionesCLiente();
            principal basado=new principal();
            personal=archivo.xml_lector();
            menu.menu_inicio(personal);

    }
        public ArrayList<cliente> carga(){
            cliente cliente1=new cliente ();
            cliente1.setEdad(1);
            cliente1.setNUI("1");
            cliente1.setNombre("numero1");
            cliente cliente2=new cliente ();
            cliente2.setEdad(2);
            cliente2.setNUI("2");
            cliente2.setNombre("numero2");
            ArrayList<cliente> lista=new ArrayList<cliente>();
            lista.add(cliente1);
            lista.add(cliente2);
            return lista;
        }
        public ArrayList<cuenta> Cuenta(){
            cuenta cuenta1=new cuenta ("1","AHORRO",2.0,0,personal.get(0));
            cuenta cuenta2=new cuenta ("2","CORRIENTE",10.0,0,personal.get(1));
            ArrayList<cuenta> lista=new ArrayList<cuenta>();
            lista.add(cuenta1);
            lista.add(cuenta2);
            return lista;
        }
}
