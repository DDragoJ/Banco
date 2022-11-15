/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Datos_Clases;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author cosmo
 */
public class cliente {
    /*ATRIBUTOS*/
    
    private String Nombre,NUI;
    private Integer Edad;
    private List<cuenta> oCuentas= new ArrayList<cuenta>();
    
    /*cONSTRUCTOR*/

    public cliente(String Nombre, String NUI, Integer Edad) {
        this.Nombre = Nombre;
        this.NUI = NUI;
        this.Edad = Edad;
    }
    
    
    
    /*FUNCIONES*/
    
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getNUI() {
        return NUI;
    }

    public void setNUI(String NUI) {
        this.NUI = NUI;
    }

    public Integer getEdad() {
        return Edad;
    }

    public void setEdad(Integer Edad) {
        this.Edad = Edad;
    }
    
    //METODOS
    
    public void Leer(){
        Scanner scanner= new Scanner(System.in);
        String aux;
        System.out.println("Ingresar NUI de la persona: ");
        aux=scanner.nextLine();
        setNUI(aux);
        System.out.println("Ingresar nombre de la persona: ");
        aux=scanner.nextLine();
        setNombre(aux);
        System.out.println("Ingresar edad de la persona: ");
        aux=scanner.nextLine();
        setEdad(Integer.parseInt(aux));
        generador();
    }
    
    public void generador (){
        Scanner lector=new Scanner(System.in);
            int op=0;
            cuenta aux;
            System.out.println("Ingrese tipo de Cuenta");
            op=lector.nextInt();
            if(op==1){aux=new ahorro("","",0.0,0);}
            else{aux =new ahorro("","",0.0,0);}
            aux.Leer();
            oCuentas.add(aux);
    }
    
    public void Mostrar (){
        System.out.println("Cedula: "+getNUI());
        System.out.println("Nombre: "+getNombre());
        System.out.println("Edad: "+getEdad());
        for (cuenta elemento : oCuentas) {
            elemento.Mostrar();
        }
    }
    
    //Validacion
}
