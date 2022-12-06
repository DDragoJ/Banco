/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexion_db;

import CRUD.CRUDCuenta_datos;
import Datos_Clases.cliente;
import Datos_Clases.corriente;
import Datos_Clases.cuenta;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author USUARIO
 */
public class sql {
    CRUDCuenta_datos operaciones_cuenta;
        private final sql oper;

    public sql() {
        this.oper = new sql();
    }
      
    public void probarConexion(){
        oper.connectMysql("127.0.0.1", "3306", "cuentas", "root", "123456");    //llamado con parametros correctos
//       oper.connectMysql("127.0.0.1", "3306", "cuentas2", "root", "123456");    //llamado con parametros correctos
    }

    public void insertar() throws SQLException{      //funcion que realiza la insercion de una nueva cuenta de ahorros
        cuenta cta = operaciones_cuenta.Leer();

        System.out.println("INSERCION DE NUEVA CUENTA CORRIENTE EN MYSQL");
        if (oper.insertar(cta)){
            System.out.println("Cuenta de ahorro insertada exitosamente.....");
        } else {
            System.out.println("Error al insertar cuenta de ahorro....");
        }        
    }

    public void consultar() throws SQLException{     //funcion que realiza la consulta de una cuenta de ahorros
        System.out.println("CONSULTA DE CUENTA CORRIENTE EN MYSQL");
        System.out.println("Cuenta Corriente: "+oper.consultar("111").toString());
    }
    
    public void modificar() throws SQLException{     //funcion que realiza la modificación de una cuenta de ahorros
        
        cliente vtit = new cliente();
        vtit.setNUI("1701701701"); 
        vtit.setNombre("Rosa Ontaneda");
        cuenta cta = new corriente("222","CORRIENTE",450f,0,vtit);
        cta.setCosto(15f);

        System.out.println("MODIFICACION DE CUENTA CORRIENTE EN MYSQL");
        if (oper.modificar(cta)){
            System.out.println("Cuenta de ahorro modificada exitosamente.....");
        } else {
            System.out.println("Error al modificar cuenta de ahorro....");
        }        
    }

    public void eliminar() throws SQLException{       //funcion que realiza la eliminación de una cuenta de ahorros
        System.out.println("ELIMINACION DE CUENTA CORRIENTE EN MYSQL");
        if (oper.eliminar("1")){
            System.out.println("Cuenta Corriente eliminada exitosamente.....");
        } else {
            System.out.println("Error al eliminar Cuenta Corriente....");
        }
    }

    public void listar() throws SQLException{   //implementa el listado de cuentas de ahorro
        ArrayList<corriente> lisCo;
        lisCo = oper.listar();
        System.out.println("LISTA DE CUENTAS CORRIENTES EN MYSQL");
        
        lisCo.forEach(cA -> {
            System.out.println("Corriente: "+cA.toString());
        });
    }
}
