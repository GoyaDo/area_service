
package com.wisdom.area.webservice.wsdl;

import javax.xml.ws.Endpoint;

/**
 * This class was generated by Apache CXF 3.5.2
 * 2022-05-08T01:12:06.465+08:00
 * Generated source version: 3.5.2
 *
 */

public class SubscriptionManager_SubscriptionManagerPort_Server{

    protected SubscriptionManager_SubscriptionManagerPort_Server() throws Exception {
        System.out.println("Starting Server");
        Object implementor = new SubscriptionManagerImpl();
        java.lang.String address = "{rhinHost}/OrganizationProvider/SubscriptionManager";
        Endpoint.publish(address, implementor);
    }

    public static void main(String args[]) throws Exception {
        new SubscriptionManager_SubscriptionManagerPort_Server();
        System.out.println("Server ready...");

        Thread.sleep(5 * 60 * 1000);
        System.out.println("Server exiting");
        System.exit(0);
    }
}
