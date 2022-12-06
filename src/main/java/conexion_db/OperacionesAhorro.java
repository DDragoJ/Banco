/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexion_db;

import Datos_Clases.ahorro;
import Datos_Clases.cliente;
import Datos_Clases.cuenta;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author USUARIO
 */
public class OperacionesAhorro {
    public OperacionesAhorro() {
    }
    
    public Connection connectPgsql(String host, String port, String dbase, String usr, String pswd){      //metodo para conectarse a pgsql
       String url = "";
       Connection conn = null;
       
       try{
            try{
                Class.forName("org.postgresql.Driver");                
            }catch (ClassNotFoundException e){
                System.out.println("Error al registrar el driver de PostgreSql "+ e);
            }
            url = "jdbc:postgresql://" + host + "/" + dbase;                    
            
            conn = DriverManager.getConnection(url, usr, pswd);
            boolean valid = conn.isValid(50000);                  
            System.out.println(valid ? "Conexion Valida...." : "Conexion Fallida....");
            return conn;
        } catch (java.sql.SQLException sqle){
            System.out.println("Error al conectar con la base de datos ("+ url +"): " + sqle);
        }
       return conn;
    }

    public boolean insertar(ahorro cta) throws SQLException{        
        boolean save = false;

        try(Connection conn = connectPgsql("127.0.0.1", "5432", "Banco", "postgres", "123456")) {
            String consulta = "INSERT INTO ahorros (numero, saldo, NUI, nombre, interes) VALUES (?, ?, ?, ?, ?)";
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

    public ahorro consultar(String id) throws SQLException{         
        ahorro ctaAho = new ahorro("","",0.0,0,null);
        
        try(Connection conn = connectPgsql("127.0.0.1", "5432", "Banco", "postgres", "123456")) {
            String consulta = "SELECT * FROM ahorros WHERE numero = ?";
            PreparedStatement sentencia = conn.prepareStatement(consulta);
            sentencia.setString(1,  id);
            try{
                ResultSet rs = sentencia.executeQuery();
                while (rs.next()){
                    ctaAho.setNumero_cuenta(rs.getString("numero"));
                    ctaAho.setSaldo(rs.getDouble("saldo"));
                    cliente vtit = new cliente();
                    vtit.setNUI(rs.getString("NUI"));  
                    vtit.setNombre(rs.getString("nombre"));  
                    ctaAho.setPropietario(vtit);
                    ctaAho.setInteres(rs.getInt("interes"));
                }
           } catch (SQLException e){
                System.out.println("Error generado al recupera datos " + e);
            }
        }
        return ctaAho;
    }

    public boolean modificar(ahorro cta) throws SQLException{       
        boolean save = false;

        try(Connection conn = connectPgsql("127.0.0.1", "5432", "Banco", "postgres", "123456")) {
            String consulta = "UPDATE ahorros SET saldoinicial = ?, interes = ?, cedula = ? WHERE numero = ?";
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

    public boolean eliminar(String id) throws SQLException{         
        boolean delete = false;
        try(Connection conn = connectPgsql("127.0.0.1", "5432", "Banco", "postgres", "123456")) {
            String consulta = "DELETE FROM ahorros WHERE numero = ?";
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
    
    public ArrayList<ahorro> listar() throws SQLException{          
        Connection conn = connectPgsql("127.0.0.1", "5432", "Banco", "postgres", "123456");
        String consulta = "SELECT * FROM ahorros";
        PreparedStatement sentencia = conn.prepareStatement(consulta);
        
        ArrayList<ahorro> lista = new ArrayList<>();   
        
        try{
          ResultSet rs = sentencia.executeQuery();      
            while (rs.next()){                          
                ahorro ctaAho = new ahorro("","",0.0,0,null);
                ctaAho.setNumero_cuenta(rs.getString("numero"));
                ctaAho.setSaldo(rs.getDouble("saldoinicial"));
                cliente vtit = new cliente();
                vtit.setNUI(rs.getString("cedula"));  
                vtit.setNombre(rs.getString("nombre"));  
                ctaAho.setPropietario(vtit);
                ctaAho.setInteres(rs.getInt("interes"));
                lista.add(ctaAho);                      //el objeto recuperado de la bd se añade al arraylist
            }
        }catch(SQLException e){
            System.out.println("Error generado al recupera datos " + e);
        }
        return lista;
    }
}
