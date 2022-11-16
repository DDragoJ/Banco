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
    
    //menu
    public void menu_inicio(ArrayList<cliente> lista){
        System.out.println("Menu Inicial");
        System.out.println("1.-Ingresar ");
        System.out.println("2.-Mostrar");
        System.out.println("3.-Eliminar");
        System.out.println("4.-Editar");
        System.out.println("5.-Salir");
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
        }
    }

    
}
