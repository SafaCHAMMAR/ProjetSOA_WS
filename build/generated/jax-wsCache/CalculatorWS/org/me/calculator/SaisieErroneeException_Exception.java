
package org.me.calculator;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.10-b140803.1500
 * Generated source version: 2.2
 * 
 */
@WebFault(name = "SaisieErroneeException", targetNamespace = "http://calculator.me.org/")
public class SaisieErroneeException_Exception
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private SaisieErroneeException faultInfo;

    /**
     * 
     * @param faultInfo
     * @param message
     */
    public SaisieErroneeException_Exception(String message, SaisieErroneeException faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param faultInfo
     * @param cause
     * @param message
     */
    public SaisieErroneeException_Exception(String message, SaisieErroneeException faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: org.me.calculator.SaisieErroneeException
     */
    public SaisieErroneeException getFaultInfo() {
        return faultInfo;
    }

}
