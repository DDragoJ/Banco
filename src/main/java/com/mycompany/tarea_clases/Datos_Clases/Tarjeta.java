/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tarea_clases.Datos_Clases;

import java.util.Date;

/**
 *
 * @author USUARIO
 */
public class Tarjeta {
    private String Numero;
    private String Estado;
    private Date expira;  
    private String Tipo;

    public Tarjeta(String Numero, String Estado, Date expira, String Tipo) {
        this.Numero = Numero;
        this.Estado = Estado;
        this.expira = expira;
        this.Tipo = Tipo;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }
    
    
}
