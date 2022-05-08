package com.wisdom.area.webservice.config;

import com.wisdom.area.webservice.wsdl.NotificationConsumer;
import com.wisdom.area.webservice.wsdl.NotificationConsumerImpl;
import com.wisdom.area.webservice.wsdl.OrganizationProviderImpl;
import com.wisdom.area.webservice.wsdl.OrganizationRegistrationServer;
import org.apache.cxf.Bus;
import org.apache.cxf.binding.soap.Soap12;
import org.apache.cxf.binding.soap.SoapBindingConfiguration;
import org.apache.cxf.jaxws.EndpointImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.annotation.Resource;
import javax.xml.ws.Endpoint;

/**
 * @author goya
 * @create 2022-05-08 02:01
 * @Description
 */
@Configuration
public class CxfConfig {

    @Resource
    private Bus bus;

    @Resource
    private NotificationConsumerImpl notificationConsumerImpl;

    @Resource
    private OrganizationProviderImpl organizationProviderImpl;

    @Resource
    private OrganizationRegistrationServer organizationServer;


    @Bean
    public Endpoint notificationConsumer(){
        EndpointImpl endpoint = new EndpointImpl(bus,notificationConsumerImpl);
        endpoint.publish("/consumer");
        return endpoint;
    }

    @Bean
    public Endpoint organizationProvider(){
        EndpointImpl endpoint = new EndpointImpl(bus,organizationProviderImpl);
        endpoint.publish("/organization");
        SoapBindingConfiguration soapBindingConfiguration = new SoapBindingConfiguration();
        soapBindingConfiguration.setVersion(Soap12.getInstance());
        endpoint.setBindingConfig(soapBindingConfiguration);
        return endpoint;
    }

    @Bean
    public Endpoint organizationRegistrationServer(){
        EndpointImpl endpoint = new EndpointImpl(bus,organizationServer);
        endpoint.publish("/organization1");
        SoapBindingConfiguration soapBindingConfiguration = new SoapBindingConfiguration();
        soapBindingConfiguration.setVersion(Soap12.getInstance());
        endpoint.setBindingConfig(soapBindingConfiguration);
        return endpoint;
    }

}
