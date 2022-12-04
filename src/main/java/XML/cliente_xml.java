/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package XML;

import Datos_Clases.cliente;
import Datos_Clases.cuenta;
import interfaces.in_generica;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
/**
 *
 * @author cosmo
 */

@XmlRootElement(name="Titulares")
public class cliente_xml {
    /*ATRIBUTOS*/

        private ArrayList<cliente> titulares= new ArrayList<cliente>();
    
    public ArrayList<cuenta> oCuentas = new ArrayList<cuenta>();
    
    /*FUNCIONES*/
   @XmlElementWrapper(name="Titular")
   @XmlElement(name="Cuenta")
    public ArrayList<cuenta> setCuenta(){
        return oCuentas;
    }
    
    @XmlElement(name="Titular")
    public ArrayList<cliente> gettitulares(){
        return titulares;
    }
}
