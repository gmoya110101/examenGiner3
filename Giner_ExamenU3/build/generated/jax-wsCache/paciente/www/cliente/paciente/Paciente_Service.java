
package www.cliente.paciente;

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
 * JAX-WS RI 2.3.0
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "paciente", targetNamespace = "http://itorizaba.com/paciente.wsdl", wsdlLocation = "http://localhost:8080/Giner_ExamenU3/paciente?WSDL")
public class Paciente_Service
    extends Service
{

    private final static URL PACIENTE_WSDL_LOCATION;
    private final static WebServiceException PACIENTE_EXCEPTION;
    private final static QName PACIENTE_QNAME = new QName("http://itorizaba.com/paciente.wsdl", "paciente");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/Giner_ExamenU3/paciente?WSDL");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        PACIENTE_WSDL_LOCATION = url;
        PACIENTE_EXCEPTION = e;
    }

    public Paciente_Service() {
        super(__getWsdlLocation(), PACIENTE_QNAME);
    }

    public Paciente_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), PACIENTE_QNAME, features);
    }

    public Paciente_Service(URL wsdlLocation) {
        super(wsdlLocation, PACIENTE_QNAME);
    }

    public Paciente_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, PACIENTE_QNAME, features);
    }

    public Paciente_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public Paciente_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns PacientePortType
     */
    @WebEndpoint(name = "pacientePort")
    public PacientePortType getPacientePort() {
        return super.getPort(new QName("http://itorizaba.com/paciente.wsdl", "pacientePort"), PacientePortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns PacientePortType
     */
    @WebEndpoint(name = "pacientePort")
    public PacientePortType getPacientePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://itorizaba.com/paciente.wsdl", "pacientePort"), PacientePortType.class, features);
    }

    private static URL __getWsdlLocation() {
        if (PACIENTE_EXCEPTION!= null) {
            throw PACIENTE_EXCEPTION;
        }
        return PACIENTE_WSDL_LOCATION;
    }

}