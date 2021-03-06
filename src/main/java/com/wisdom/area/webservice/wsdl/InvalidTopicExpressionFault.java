
package com.wisdom.area.webservice.wsdl;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.5.2
 * 2022-05-08T01:12:06.389+08:00
 * Generated source version: 3.5.2
 */

@WebFault(name = "InvalidTopicExpressionFault", targetNamespace = "http://docs.oasis-open.org/wsn/b-2")
public class InvalidTopicExpressionFault extends Exception {

    private InvalidTopicExpressionFaultType faultInfo;

    public InvalidTopicExpressionFault() {
        super();
    }

    public InvalidTopicExpressionFault(java.lang.String message) {
        super(message);
    }

    public InvalidTopicExpressionFault(java.lang.String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidTopicExpressionFault(java.lang.String message, InvalidTopicExpressionFaultType invalidTopicExpressionFault) {
        super(message);
        this.faultInfo = invalidTopicExpressionFault;
    }

    public InvalidTopicExpressionFault(java.lang.String message, InvalidTopicExpressionFaultType invalidTopicExpressionFault, Throwable cause) {
        super(message, cause);
        this.faultInfo = invalidTopicExpressionFault;
    }

    public InvalidTopicExpressionFaultType getFaultInfo() {
        return this.faultInfo;
    }
}
