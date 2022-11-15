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
        public corriente(String Numero_cuenta, String Tipo_cuenta, Double saldo, Integer interes) {
        super(Numero_cuenta, Tipo_cuenta, saldo, interes);
        setTipo_cuenta("CORRIENTE");
        setSaldo(0.0);
        setInteres(5);}
        
        @Override
        public void Leer(){
        super.Leer();
        Scanner scanner= new Scanner(System.in);
        String aux;
        {
        System.out.println("Saldo de ingreso: ");
        aux=scanner.nextLine();
        setSaldo(Double.parseDouble(aux));
        }while(getSaldo()<5);
        }
        
}
