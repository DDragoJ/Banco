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
        JAXBContext contexto=JAXBContext.newInstance(cliente_xml.class);
        Unmarshaller unmarsha  = contexto.createUnmarshaller();
        cliente_xml listado = (cliente_xml) unmarsha.unmarshal(new File("Banco.xml"));
        ArrayList<cliente> personas=listado.gettitulares();
        return listado.gettitulares();
    }
    public void pr() throws JAXBException {
        JAXBContext contexto=JAXBContext.newInstance(cliente_xml.class);
        Unmarshaller unmarsha  = contexto.createUnmarshaller();
        cliente_xml listado = (cliente_xml) unmarsha.unmarshal(new File("Banco.xml"));
        ArrayList<cliente> personas=listado.gettitulares();
        for(cliente a:personas)
            System.out.println(a.getNUI());

    }
    
    public void xml_generador(ArrayList<cliente> listado) throws JAXBException, IOException{
        JAXBContext contexto=JAXBContext.newInstance(cliente_xml.class);
        Marshaller marshal =contexto.createMarshaller();
        cliente_xml lista=new cliente_xml();
        lista.setTitulares(listado);
        marshal.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
        marshal.marshal(lista, new FileWriter("Banco.xml"));
    }
}
