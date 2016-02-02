/*
   **********************************************************************
   **********************************************************************
   ** By Wuriyanto                                                     **
   ** EMAIL/FACEBOOK : wuriyanto48@yahoo.co.id  OR  Prince Wury        **
   ** WEBSITE : wuriyantoinformatika.blogspot.com                      **
   ** CITY : BANJARNEGARA CENTRAL JAVA INDONESIA                       **
   ** COMPUTER SCIENCE                                                 **
   ** MUHAMMADIYAH UNIVERSITY OF PURWOKERTO                            **
   ** NB:BEBAS DIDISTRIBUSIKAN UNTUK TUJUAN BELAJAR                    **      
   **                                                                  **
   **                                     JMAT.inc & Black Code Studio **
   **********************************************************************
   **********************************************************************

 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wury.soap.client.manually;

import com.wury.soap.endpoint.HelloJava;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;

/**
 *
 * @author WURI
 */
public class HelloJavaClientManual {

    public static void main(String[] args) {
        try {
            
            URL url = new URL("http://localhost:9999/ws/hello?wsdl");
            QName qName = new QName("http://endpointImpl.soap.wury.com/","HelloJavaImplService");
            
            Service service = Service.create(url, qName);
            HelloJava helloJava = service.getPort(HelloJava.class);
            
            System.out.println(helloJava.getHello("Wuriyanto"));
            
        } catch (MalformedURLException ex) {
            Logger.getLogger(HelloJavaClientManual.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
