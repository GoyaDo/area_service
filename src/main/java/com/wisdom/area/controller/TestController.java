package com.wisdom.area.controller;

import com.wisdom.area.webservice.wsdl.NotificationConsumerImpl;

import javax.xml.ws.Endpoint;

/**
 * @author goya
 * @create 2022-05-08 01:25
 * @Description
 */
public class TestController {

    public static void main(String[] args) {
        System.out.println("Starting Server");
        Object implementor = new NotificationConsumerImpl();
//        java.lang.String address = "{OrganizationMessgeApp}/NotificationConsumer";
        java.lang.String address = "http://localhost:8088/ws/NotificationConsumer";
        Endpoint.publish(address, implementor);
    }
}
