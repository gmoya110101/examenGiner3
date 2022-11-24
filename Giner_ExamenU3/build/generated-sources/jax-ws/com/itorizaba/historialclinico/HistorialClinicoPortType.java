
package com.itorizaba.historialclinico;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.3.0
 * Generated source version: 2.2
 * 
 */
@WebService(name = "historialClinicoPortType", targetNamespace = "http://www.itorizaba.com/historialClinico.wsdl")
@SOAPBinding(style = SOAPBinding.Style.RPC)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface HistorialClinicoPortType {


    /**
     * 
     * @param numExpediente
     * @return
     *     returns com.itorizaba.historialclinico.Paciente
     */
    @WebMethod(action = "capeconnect:historialClinico:historialClinicoPortType#historialClinicoOperation")
    @WebResult(name = "respuesta", partName = "respuesta")
    public Paciente historialClinicoOperation(
        @WebParam(name = "numExpediente", partName = "numExpediente")
        String numExpediente);

}