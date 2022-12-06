/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexion_db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import Datos_Clases.cliente;
import Datos_Clases.corriente;


/**
 *
 * @author USUARIO
 */
public class OperacionesCorrientes {
     String consulta = "";

    public OperacionesCorrientes() {
    }
    
    public Connection connectMysql(String host, String port, String dbase, String usr, String pswd){      //metodo para conectarse a pgsql
       String url = "";
       Connection conn = null;
       
       try{
            try{
                Class.forName("com.mysql.cj.jdbc.Driver");                //1. registrar el driver
            }catch (ClassNotFoundException e){
                System.out.println("Error al registrar el driver de MySql "+ e);
            }
            url = "jdbc:mysql://" + host + "/" + dbase;                    //2. crear cadena de conexion
            
            conn = DriverManager.getConnection(url, usr, pswd);    //3. establecer la conexion
            boolean valid = conn.isValid(50000);                              //4. var para comprobar conexion
            System.out.println(valid ? "Conexion Valida...." : "Conexion Fallida....");
            return conn;
        } catch (java.sql.SQLException sqle){
            System.out.println("Error al conectar con la base de datos ("+ url +"): " + sqle);
        }
       return conn;
    }

    public boolean insertar(corriente cta) throws SQLException{          //metodo para listar cuentas de ahorros
        boolean save = false;

        try(Connection conn = connectMysql("127.0.0.1", "3306", "Bancp", "root", "root")) {
            String consulta = "INSERT INTO corrientes (numero, saldo, NUI, nombre, Interes) VALUES (?, ?, ?, ?, ?)";
              PreparedStatement sentencia = conn.prepareStatement(consulta);
            sentencia.setString(1, cta.getNumero_cuenta());
            sentencia.setDouble(2, cta.getSaldo());
            cliente vtit = cta.getPropietario();
            sentencia.setString(3, vtit.getNUI());
            sentencia.setString(4, vtit.getNombre());
            sentencia.setFloat(5, cta.getInteres());
            try{
                sentencia.execute();
                save = true;
            } catch (SQLException e){
                System.out.println("Error generado al insertar datos " + e);
            }
        }
        return save;
    }

    public corriente consultar(String id) throws SQLException{          //metodo para listar cuentas de ahorros
        corriente cta = new corriente("","",0.0,0,null);
        
        try(Connection conn = connectMysql("127.0.0.1", "3306", "Bancp", "root", "root")) {
             consulta = "SELECT * FROM corrientes WHERE numero = ?";
            PreparedStatement sentencia = conn.prepareStatement(consulta);
            sentencia.setString(1,  id);
            try{
                ResultSet rs = sentencia.executeQuery();
                while (rs.next()){
                    cta.setNumero_cuenta(rs.getString("numero"));
                    cta.setSaldo(rs.getDouble("saldo"));
                    cliente vtit = new cliente();
                    vtit.setNUI(rs.getString("NUI"));  
                    vtit.setNombre(rs.getString("nombre"));  
                    cta.setPropietario(vtit);
                    cta.setInteres(rs.getInt("Interes"));
                    }
           } catch (SQLException e){
                System.out.println("Error generado al recupera datos " + e);
            }
        }
        return cta;
    }

    public boolean modificar(corriente cta) throws SQLException{          //metodo para listar cuentas de ahorros
        boolean save = false;

        try(Connection conn = connectMysql("127.0.0.1", "3306", "Bancp", "root", "rot")) {
            String consulta = "UPDATE corrientes SET saldo = ?, costo = ?, NUI = ? WHERE N_CUENTA = ?";
            PreparedStatement sentencia = conn.prepareStatement(consulta);
            sentencia.setDouble(1, cta.getSaldo());
            sentencia.setFloat(2, cta.getInteres());
            cliente vtit = cta.getPropietario();
            sentencia.setString(3, vtit.getNUI());
            sentencia.setString(4, cta.getNumero_cuenta());
            try{
                sentencia.execute();
                save = true;
            } catch (SQLException e){
                System.out.println("Error generado al actualizar datos " + e);
            }
        }
        return save;
    }

    public boolean eliminar(String id) throws SQLException{          //metodo para listar cuentas de ahorros
        boolean delete = false;
        try(Connection conn = connectMysql("127.0.0.1", "3306", "Bancp", "root", "root")) {
             consulta = "DELETE FROM corrientes WHERE numero = ?";
            PreparedStatement sentencia = conn.prepareStatement(consulta);
            sentencia.setString(1, id);
            try{
                sentencia.execute();
                delete = true;
            } catch (SQLException e) {
             System.out.println("Error generado al eliminar datos " + e);
            }
        }
        return delete;
    }
    
    public ArrayList<corriente> listar() throws SQLException{          //metodo para listar cuentas de ahorros
        Connection conn = connectMysql("127.0.0.1", "3306", "Bancp", "root", "root");
         consulta = "SELECT * FROM corrientes";
        PreparedStatement sentencia = conn.prepareStatement(consulta);
        
        ArrayList<corriente> lista = new ArrayList<>();   //declara arraylist de respuesta
        
        try{
          ResultSet rs = sentencia.executeQuery();      //ejecuta la consulta
            while (rs.next()){                          //mientras hay elementos en respuesta
                corriente cta = new corriente("","",0.0,0,null);         //instancia un objeto cta ahorros
                cta.setNumero_cuenta(rs.getString("N_CUENTA"));
                cta.setSaldo(rs.getDouble("saldo"));
                cliente vtit = new cliente();
                vtit.setNUI(rs.getString("NUI"));  
                vtit.setNombre(rs.getString("nombre"));  
                cta.setPropietario(vtit);
                cta.setInteres(rs.getInt("costo"));
                lista.add(cta);                      //el objeto recuperado de la bd se añade al arraylist
            }
        }catch(SQLException e){
            System.out.println("Error generado al recupera datos " + e);
        }
        return lista;                                   //devuelve el arraylist generado
    }   
    public Integer cantidadCuentas(){
        Integer cant = 0;
        try {
             Connection connect = connectMysql("127.0.0.1", "3306", "Bancp", "root", "root");
            consulta = "SELECT COUNT(*) AS total FROM corriente";
            PreparedStatement sentencia = connect.prepareStatement(consulta);
            ResultSet rs = sentencia.executeQuery();
           if(rs.next()) {
       //Si hay resultados obtengo el valor. 
                cant= rs.getInt("total");
             }
        }catch (SQLException e){
            System.out.println("Error generado al realizar la conulta " + e);
        }

        return cant;
    }

    public float sumarSaldo(){
        float saldoTotal = 0;
        try {
             Connection connect = connectMysql("127.0.0.1", "3306", "Bancp", "root", "root");
//            consulta = "SELECT SUM (saldo) FROM corriente";
             consulta = "SELECT SUM(saldo) AS total FROM corriente";
            PreparedStatement sentencia = connect.prepareStatement(consulta);
            ResultSet rs = sentencia.executeQuery();
            if(rs.next()) {
       //Si hay resultados obtengo el valor. 
                saldoTotal= rs.getFloat("total");
             }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return saldoTotal;
    }
}