/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CRUD;

import CRUD.CRUDcliente;
import CRUD.CRUDCuenta;
import Datos_Clases.cliente;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author cosmo
 */
public class int_menu {
    CRUDcliente Cliente =new CRUDcliente();
    CRUDCuenta cuenta =new CRUDCuenta();
    Scanner lector =new Scanner(System.in);
        int op;
        String aux;
    
    //menu
    public void menu_inicio(ArrayList<cliente> lista){
        System.out.println("Menu Inicial");
        System.out.println("1.-Ingresar ");
        System.out.println("2.-Mostrar");
        System.out.println("3.-Eliminar");
        System.out.println("4.-Editar");
        System.out.println("5.-Buscar");
        System.out.println("6.-Salir");
        op=Integer.parseInt(lector.nextLine());
        switch (op) {
            case 1:
                menu_ingreso(lista);
                break;
            case 2:
                //mostrar
                break;
            case 3:
                //eliminar
                break;
            case 4:
                //editar
                break;
            case 5:
                menu_buscar(lista);
                break;
            case 6:
                break;
            default:
                System.out.println("Valor incorrecto");
                menu_inicio(lista);
                break;
        }
    }
    public void menu_ingreso(ArrayList<cliente> lista){
        System.out.println("Menu Ingreso");
        System.out.println("1.-Ingresar Cliente");
        System.out.println("2.-Ingresar Cuenta");
        System.out.println("3.-Salir");
        op=Integer.parseInt(lector.nextLine());
        switch (op) {
            case 1:
                lista=Cliente.Leer(lista);
                break;
            case 2:
                //buscar;
                break;
            case 3:
                menu_inicio(lista);
                break;
            default:
                System.out.println("Valor incorrecto");
                menu_ingreso(lista);
                break; 
        }menu_inicio(lista); 
    }
    public void menu_buscar(ArrayList<cliente> lista){
        System.out.println("Menu buscar cliente");
        System.out.println("1.-Cliente ");
        System.out.println("1.-Cuenta ");
        System.out.println("2.-Salir");
        op=Integer.parseInt(lector.nextLine());
        switch (op) {
            case 1:
                System.out.println("Escribir nombre");
                aux=lector.nextLine();
                Cliente.Mostrar_unico(lista, Cliente.Buscar(lista, aux));
                break;
            case 2:
                /*
                escribir cuentas
                */
                break;
            default:
                System.out.println("Valor incorrecto");
                break;
        }
        menu_inicio(lista);
    }

    
}
