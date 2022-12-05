/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Datos_Clases;

import interfaces.in_generica;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 *
 * @author cosmo
 */
public class cliente {
    /*ATRIBUTOS*/
    
    private String Nombre,NUI;
    private Integer Edad;
    private ArrayList<cuenta> oCuentas= new ArrayList<cuenta>();
    
    /*cONSTRUCTOR*/

    public cliente(String Nombre, String NUI, Integer Edad) {
        this.Nombre = Nombre;
        this.NUI = NUI;
        this.Edad = Edad;
    }

    /*FUNCIONES*/
    
    public ArrayList<cuenta> getCuenta(){
        return this.oCuentas;
    }
    public void setCuenta(ArrayList<cuenta> aux){
        this.oCuentas=aux;
    }
    
    public String getNombre() {
        return Nombre;
    }
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    public String getNUI() {
        return NUI;
    }
    public void setNUI(String NUI) {
        this.NUI = NUI;
    }
    public Integer getEdad() {
        return Edad;
    }
    public void setEdad(Integer Edad) {
        this.Edad = Edad;
    }
    
}
