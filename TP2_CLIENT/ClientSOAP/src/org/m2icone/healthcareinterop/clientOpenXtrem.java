/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.m2icone.healthcareinterop;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.namespace.QName;
import org.m2icone.healthcareinterop.*;

/**
 *
 * @author alex
 */
public class clientOpenXtrem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws MalformedURLException {
       
        System.out.println("Result : "+calculator("add",1,1));  // appel de la fonction et affichage resultat
    }
    // fonction addition pour l'appler sur le webservice

    private static String calculator(java.lang.String operation, int integer1, int integer2) throws MalformedURLException {
      URL wsdlLocation = new URL("http://192.168.43.65/dev/server.php?wsdl");
        HealthCareInteropService_Service service = new HealthCareInteropService_Service(wsdlLocation);
        HealthCareInteropService port = service.getHealthCareInteropServicePort();
        return port.calculator(operation, integer1, integer2);
    }

  

  

   

    
}
