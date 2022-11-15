/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Operaciones;

import Datos_Clases.cliente;
import java.util.ArrayList;

/**
 *
 * @author cosmo
 */
public class i_operable {
//Datos
    ArrayList <cliente> agenda=new ArrayList<cliente>();
//CREAR
    public void Crear_cliente(){
        cliente objeto =new cliente("","",0);
        objeto.Leer();
        agenda.add(objeto);
    }
//Buscar
    public Integer buscar(cliente buscado){
        return agenda.indexOf(buscado);
    }
//UPDATE
//MOSTRAR
    public void Imprimir(){
    }
//ELIMINAR
    
}
