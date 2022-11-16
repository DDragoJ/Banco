/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaces;

import Datos_Clases.cuenta;
import java.util.ArrayList;

/**
 *
 * @author cosmo
 */
public interface in_genericaCuenta {
    public ArrayList<cuenta> Leer(ArrayList<cuenta> listaccuenta);
    public int Buscar (ArrayList<cuenta> listaccuenta, String buscador);
    public ArrayList<cuenta> Eliminar(ArrayList<cuenta> listaccuenta, int indice);
    public void Modificar();
}
