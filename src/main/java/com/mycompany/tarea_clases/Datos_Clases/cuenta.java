/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tarea_clases.Datos_Clases;

import java.util.Scanner;

/**
 *
 * @author cosmo
 */
class cuenta {
   private String Numero_cuenta;
   private String Tipo_cuenta;
   private Double saldo;
   private Integer interes;

    public cuenta(String Numero_cuenta, String Tipo_cuenta, Double saldo, Integer interes) {
        this.Numero_cuenta = Numero_cuenta;
        this.Tipo_cuenta = Tipo_cuenta;
        this.saldo = saldo;
        this.interes = interes;
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
   
       public void Leer(){
        Scanner scanner= new Scanner(System.in);
        String aux;
        System.out.println("Numero de cuenta: ");
        aux=scanner.nextLine();
        setNumero_cuenta(aux);
        System.out.println("Saldo de ingreso: ");
        aux=scanner.nextLine();
        setSaldo(Double.parseDouble(aux));
    }
    
    public void Mostrar (){
        System.out.println("N° CUENTA: "+getNumero_cuenta());
        System.out.println("Tipo de Cuenta: "+getTipo_cuenta());
        System.out.println("Interes: "+getInteres());
        System.out.println("Saldo : $"+getSaldo());
    }
    
}
