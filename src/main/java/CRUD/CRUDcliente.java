package CRUD;


import Datos_Clases.cliente;
import Datos_Clases.corriente;
import Datos_Clases.ahorro;
import Datos_Clases.cuenta;
import interfaces.in_generica;
import java.util.ArrayList;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author cosmo
 */
public class CRUDcliente implements in_generica {
    CRUDCuenta cuenta=new CRUDCuenta();
        @Override
    public ArrayList<cliente> Leer(ArrayList<cliente> listacliente){
        cliente ocliente=new cliente("","",0);
        ArrayList<cuenta> listado =new ArrayList<cuenta>();
        Scanner scanner= new Scanner(System.in);
        String aux;
        System.out.println("Ingresar NUI de la persona: ");
        aux=scanner.nextLine();
        ocliente.setNUI(aux);
        System.out.println("Ingresar nombre de la persona: ");
        aux=scanner.nextLine();
        ocliente.setNombre(aux);
        System.out.println("Ingresar edad de la persona: ");
        aux=scanner.nextLine();
        ocliente.setCuenta(cuenta.Leer(listado));
        ocliente.setEdad(Integer.parseInt(aux));
        listacliente.add(ocliente);
        
        return listacliente;
    }
    
    public ArrayList<cuenta> generador (ArrayList<cuenta> oCuenta){
        CRUDCuenta Inter_cuenta=new CRUDCuenta();
        return Inter_cuenta.Leer(oCuenta);
    }
    
        @Override
    public void Mostrar (ArrayList<cliente> ocliente){
        for (cliente ecliente : ocliente) {
        System.out.println("Cedula: "+ecliente.getNUI());
        System.out.println("Nombre: "+ecliente.getNombre());
        System.out.println("Edad: "+ecliente.getEdad());
        for (cuenta elemento : ecliente.setCuenta()) {
            elemento.Mostrar();
        }}
    }
    
        @Override
    public int Buscar (ArrayList<cliente> ocliente,String buscador){
        int indice=-1;
        for (cliente elemento : ocliente) {
            if(elemento.getNUI().equals(buscador))indice=ocliente.indexOf(elemento);
        }
        return indice;
    }     
    
    public void Mostrar_unico (ArrayList<cliente> ocliente,int indice){
        cliente elemento=ocliente.get(indice);
        System.out.println("Cedula: "+elemento.getNUI());
        System.out.println("Nombre: "+elemento.getNombre());
        System.out.println("Edad: "+elemento.getEdad());
    }     
    
    @Override
    public ArrayList<cliente> Eliminar(ArrayList<cliente> ocliente,int indice){
        ocliente.remove(indice);
        return ocliente;
    }

    @Override
    public void Modificar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
