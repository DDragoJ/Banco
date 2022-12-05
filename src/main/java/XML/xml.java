/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package XML;
import CRUD.int_menu;
import Datos_Clases.cliente;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;



/**
 *
 * @author cosmo
 */
public class xml {
    

    public ArrayList<cliente>  xml_lector() throws JAXBException {
        int_menu inicio=new int_menu();
        JAXBContext contexto=JAXBContext.newInstance(cliente_xml.class);
        Unmarshaller unmarshaller  = contexto.createUnmarshaller();
        cliente_xml listado = (cliente_xml) unmarshaller.unmarshal(new File("Banco.xml"));
        return listado.gettitulares();
    }
    
    public void xml_generador(ArrayList<cliente> listado) throws JAXBException, IOException{
        JAXBContext contexto=JAXBContext.newInstance(cliente_xml.class);
        Marshaller marshal =contexto.createMarshaller();
        cliente_xml lista=new cliente_xml();
        lista.setTitulares(listado);
        marshal.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
        //marshal.marshal(lista, System.out);
        marshal.marshal(lista, new FileWriter("Banco.xml"));
    }
}
