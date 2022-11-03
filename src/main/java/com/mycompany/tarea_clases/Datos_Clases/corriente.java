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
public class corriente extends cuenta {
        public corriente(String Numero_cuenta, String Tipo_cuenta, Double saldo, Integer interes) {
        super(Numero_cuenta, Tipo_cuenta, saldo, interes);
        setTipo_cuenta("CORRIENTE");
        setSaldo(0.0);
        setInteres(5);}
        
        public void Leer(){
        Scanner scanner= new Scanner(System.in);
        String aux;
        System.out.println("Numero de cuenta: ");
        aux=scanner.nextLine();
        setNumero_cuenta(aux);
        {
        System.out.println("Saldo de ingreso: ");
        aux=scanner.nextLine();
        setSaldo(Double.parseDouble(aux));
        }while(getSaldo()<5);
        }
        
}
