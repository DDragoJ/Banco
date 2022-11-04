/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.banco;

import com.mycompany.tarea_clases.Datos_Clases.cliente;
import front.Interfaz;

/**
 *
 * @author USUARIO
 */
public class Banco {

    public static void main(String[] args) {
        cliente Prueba = new cliente("","",0);
        Prueba.Leer();
        Prueba.Mostrar();
    }
}
