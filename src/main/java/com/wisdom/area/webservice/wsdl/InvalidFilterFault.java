
package com.wisdom.area.webservice.wsdl;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.5.2
 * 2022-05-08T01:12:06.434+08:00
 * Generated source version: 3.5.2
 */

@WebFault(name = "InvalidFilterFault", targetNamespace = "http://docs.oasis-open.org/wsn/b-2")
public class InvalidFilterFault extends Exception {

    private InvalidFilterFaultType faultInfo;

    public InvalidFilterFault() {
        super();
    }

    public InvalidFilterFault(java.lang.String message) {
        super(message);
    }

    public InvalidFilterFault(java.lang.String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidFilterFault(java.lang.String message, InvalidFilterFaultType invalidFilterFault) {
        super(message);
        this.faultInfo = invalidFilterFault;
    }

    public InvalidFilterFault(java.lang.String message, InvalidFilterFaultType invalidFilterFault, Throwable cause) {
        super(message, cause);
        this.faultInfo = invalidFilterFault;
    }

    public InvalidFilterFaultType getFaultInfo() {
        return this.faultInfo;
    }
}
