/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Datos_Clases;

import java.util.Scanner;

/**
 *
 * @author cosmo
 */
public class cuenta {
   private String Numero_cuenta;
   private cliente Propietario;
   private String Tipo_cuenta;
   private Double saldo;
   private Integer interes;

    public cuenta(String Numero_cuenta, String Tipo_cuenta, Double saldo, Integer interes,cliente aux) {
        this.Numero_cuenta = Numero_cuenta;
        this.Propietario=aux;
        this.Tipo_cuenta = Tipo_cuenta;
        this.saldo = saldo;
        this.interes = interes;
    }

    public cliente getPropietario() {
        return Propietario;
    }

    public void setPropietario(cliente Propietario) {
        this.Propietario = Propietario;
    }


    public String getNumero_cuenta() {
        return Numero_cuenta;
    }

    public void setNumero_cuenta(String Numero_cuenta) {
        this.Numero_cuenta = Numero_cuenta;
    }

    public Double getSaldo() {
        return saldo;
    }

    public String getTipo_cuenta() {
        return Tipo_cuenta;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public Integer getInteres() {
        return interes;
    }

    public void setInteres(Integer interes) {
        this.interes = interes;
    }

    public void setTipo_cuenta(String Tipo_cuenta) {
        this.Tipo_cuenta = Tipo_cuenta;
    }
    
}
