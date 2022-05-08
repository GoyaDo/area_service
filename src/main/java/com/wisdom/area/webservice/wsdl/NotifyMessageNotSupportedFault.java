
package com.wisdom.area.webservice.wsdl;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.5.2
 * 2022-05-08T01:12:06.423+08:00
 * Generated source version: 3.5.2
 */

@WebFault(name = "NotifyMessageNotSupportedFault", targetNamespace = "http://docs.oasis-open.org/wsn/b-2")
public class NotifyMessageNotSupportedFault extends Exception {

    private NotifyMessageNotSupportedFaultType faultInfo;

    public NotifyMessageNotSupportedFault() {
        super();
    }

    public NotifyMessageNotSupportedFault(java.lang.String message) {
        super(message);
    }

    public NotifyMessageNotSupportedFault(java.lang.String message, Throwable cause) {
        super(message, cause);
    }

    public NotifyMessageNotSupportedFault(java.lang.String message, NotifyMessageNotSupportedFaultType notifyMessageNotSupportedFault) {
        super(message);
        this.faultInfo = notifyMessageNotSupportedFault;
    }

    public NotifyMessageNotSupportedFault(java.lang.String message, NotifyMessageNotSupportedFaultType notifyMessageNotSupportedFault, Throwable cause) {
        super(message, cause);
        this.faultInfo = notifyMessageNotSupportedFault;
    }

    public NotifyMessageNotSupportedFaultType getFaultInfo() {
        return this.faultInfo;
    }
}