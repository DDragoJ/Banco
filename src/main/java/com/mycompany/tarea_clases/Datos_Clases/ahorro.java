/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tarea_clases.Datos_Clases;

import java.util.Date;



/**
 *
 * @author cosmo
 */
class ahorro extends cuenta {
    
    public ahorro(String Numero_cuenta, String Tipo_cuenta, Double saldo, Integer interes) {
        super(Numero_cuenta, Tipo_cuenta, saldo, interes);
        setTipo_cuenta("AHORRO");
        setSaldo(0.0);
        setInteres(0);
    }
    
    
    
}
