package CRUD;


import interfaces.in_genericaCuenta;
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
public class CRUDCuenta implements in_genericaCuenta {
        @Override
    public ArrayList<cuenta> Leer(ArrayList<cuenta> listaccuenta){
        Scanner scanner= new Scanner(System.in);
        cuenta ocuenta = new cuenta ("","",0.0,0);
        String aux;
        int op;
        System.out.println("Tipo de Cuenta ");
        System.out.println("1.-Ahorro ");
        System.out.println("2.-Corriente ");
        op=Integer.parseInt(scanner.nextLine());
        System.out.println("Numero de cuenta: ");
        aux=scanner.nextLine();
        if (op==1){ocuenta=new ahorro("","AHORRO",0.0,0);
        }else{ocuenta=new corriente("","CORRIENTE",0.0,0);
        }
        ocuenta.setNumero_cuenta(aux);
        System.out.println("Saldo de ingreso: ");
        aux=scanner.nextLine();
        ocuenta.setSaldo(Double.parseDouble(aux));
        return listaccuenta;
    }

    
        @Override
    public int Buscar (ArrayList<cuenta> oCuentas,String buscador){
        int indice=-1;
        for(int i=0;i<oCuentas.size();i++){
            if(oCuentas.get(i).getNumero_cuenta()==buscador)indice=i;
        }
        return indice;
    }     
    
    @Override
    public ArrayList<cuenta> Eliminar(ArrayList<cuenta> oCuentas,int indice){
        oCuentas.remove(indice);
        return oCuentas;
    }

    @Override
    public void Modificar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    public void Mostrar(ArrayList<cuenta> listaccuenta) {
        for (cuenta elemento : listaccuenta) {
            System.out.println("Numero de cuenta: "+elemento.getNumero_cuenta());
            System.out.println("Tipo de cuenta: "+elemento.getTipo_cuenta());
            System.out.println("Saldo: "+elemento.getSaldo());
            System.out.println("Cobro por mantenimiento: "+elemento.getInteres());
        }
    }
    public void Mostrar_unico() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
