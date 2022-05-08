package com.wisdom.area.webservice.wsdl;

import org.springframework.stereotype.Service;

import javax.xml.ws.BindingType;
import javax.xml.ws.Holder;
import java.util.List;

/**
 * @author goya
 * @create 2022-05-08 01:22
 * @Description
 */
@Service
@BindingType(javax.xml.ws.soap.SOAPBinding.SOAP12HTTP_BINDING)
public class OrganizationProviderImpl implements OrganizationProvider{
    @Override
    public OrganizationFeedResponse organizationFeed(OrganizationFeed message) {
        return null;
    }

    @Override
    public void organizationQuery(Holder<Integer> from, Integer maxCount, AdhocQuery adhocQuery, Holder<Integer> totalCount, Holder<Integer> count, Holder<List<Organization>> organization) {

    }
}
