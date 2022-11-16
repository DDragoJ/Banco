/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaces;

import Datos_Clases.cliente;
import Datos_Clases.cuenta;
import java.util.ArrayList;

/**
 *
 * @author cosmo
 */
public interface in_generica {
    public ArrayList<cliente> Leer(ArrayList<cliente> listacliente);
    public void Mostrar (ArrayList<cliente> ocliente);
    public int Buscar (ArrayList<cliente> oCuentas,String buscador);
    public ArrayList<cliente> Eliminar(ArrayList<cliente> oCuentas,int indice);
    public void Modificar();
}
