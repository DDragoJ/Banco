/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Datos_Clases;

import Datos_Clases.cuenta;
import java.util.Scanner;

/**
 *
 * @author cosmo
 */
public class corriente extends cuenta {
        public corriente(String Numero_cuenta, String Tipo_cuenta, Double saldo, Integer interes,cliente aux) {
        super(Numero_cuenta, Tipo_cuenta, saldo, interes,aux);
        setTipo_cuenta("CORRIENTE");
        setSaldo(0.0);
        setInteres(5);}
        
        
}
