/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package XML;

import java.util.Scanner;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 *
 * @author cosmo
 */
@XmlRootElement(name="Cuenta")

@XmlType(propOrder={"N_cuenta","Tipo","Saldo","Interes"})
public class cuenta_xml {
   private String Numero_cuenta;
   private String Tipo_cuenta;
   private Double saldo;
   private Integer interes;

   @XmlAttribute(name="N_cuenta")
    public String getNumero_cuenta() {
        return Numero_cuenta;
    }

    public void setNumero_cuenta(String Numero_cuenta) {
        this.Numero_cuenta = Numero_cuenta;
    }
    @XmlElement(name="Saldo")
    public Double getSaldo() {
        return saldo;
    }
    @XmlElement(name="Tipo")
    public String getTipo_cuenta() {
        return Tipo_cuenta;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }
    @XmlElement(name="Interes")
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
