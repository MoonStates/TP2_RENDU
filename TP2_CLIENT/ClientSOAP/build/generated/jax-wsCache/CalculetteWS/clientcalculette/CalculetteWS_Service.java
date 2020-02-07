
package clientcalculette;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "CalculetteWS", targetNamespace = "http://webservice/", wsdlLocation = "http://localhost:8080/Calculette/CalculetteWS?wsdl")
public class CalculetteWS_Service
    extends Service
{

    private final static URL CALCULETTEWS_WSDL_LOCATION;
    private final static WebServiceException CALCULETTEWS_EXCEPTION;
    private final static QName CALCULETTEWS_QNAME = new QName("http://webservice/", "CalculetteWS");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/Calculette/CalculetteWS?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        CALCULETTEWS_WSDL_LOCATION = url;
        CALCULETTEWS_EXCEPTION = e;
    }

    public CalculetteWS_Service() {
        super(__getWsdlLocation(), CALCULETTEWS_QNAME);
    }

    public CalculetteWS_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), CALCULETTEWS_QNAME, features);
    }

    public CalculetteWS_Service(URL wsdlLocation) {
        super(wsdlLocation, CALCULETTEWS_QNAME);
    }

    public CalculetteWS_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, CALCULETTEWS_QNAME, features);
    }

    public CalculetteWS_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public CalculetteWS_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns CalculetteWS
     */
    @WebEndpoint(name = "CalculetteWSPort")
    public CalculetteWS getCalculetteWSPort() {
        return super.getPort(new QName("http://webservice/", "CalculetteWSPort"), CalculetteWS.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns CalculetteWS
     */
    @WebEndpoint(name = "CalculetteWSPort")
    public CalculetteWS getCalculetteWSPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://webservice/", "CalculetteWSPort"), CalculetteWS.class, features);
    }

    private static URL __getWsdlLocation() {
        if (CALCULETTEWS_EXCEPTION!= null) {
            throw CALCULETTEWS_EXCEPTION;
        }
        return CALCULETTEWS_WSDL_LOCATION;
    }

}
