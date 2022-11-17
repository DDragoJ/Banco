/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package XML;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

/**
 *
 * @author cosmo
 */
public class xml {
    Document document;
    public xml() throws ParserConfigurationException{
    DocumentBuilderFactory factor = DocumentBuilderFactory.newInstance();
    DocumentBuilder builder = factor.newDocumentBuilder();
    document = builder.newDocument();}
    
    public void pripietarios(){
        Element Titulares=document.createElement("Titulares");
        Element Titular=document.createElement("NUI");
        Titulares.appendChild(Titular);
        
    }    
}
