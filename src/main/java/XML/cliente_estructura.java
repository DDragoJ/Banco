/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package XML;

import Datos_Clases.cuenta;
import java.util.ArrayList;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 *
 * @author USUARIO
 */
@XmlRootElement(name="Titular")
@XmlType(propOrder={"Nui","Nombre","Edad"})
public class cliente_estructura {
    
    private String Nombre,NUI;
    private Integer Edad;
    
    
    @XmlAttribute(name="NUI")
    public String getNUI() {
        return NUI;
    }
    @XmlElement(name="Nombre")
    public String getNombre() {
        return Nombre;
    }
    @XmlElement(name="Edad")
    public Integer getEdad() {
        return Edad;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setNUI(String NUI) {
        this.NUI = NUI;
    }

    public void setEdad(Integer Edad) {
        this.Edad = Edad;
    }

    
    
}
