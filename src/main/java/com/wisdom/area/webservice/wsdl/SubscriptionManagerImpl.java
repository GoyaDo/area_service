package com.wisdom.area.webservice.wsdl;

/**
 * @author goya
 * @create 2022-05-08 01:23
 * @Description
 */
public class SubscriptionManagerImpl implements SubscriptionManager{
    @Override
    public UnsubscribeResponse unsubscribe(Unsubscribe unsubscribeRequest) throws UnableToDestroySubscriptionFault, ResourceUnknownFault {
        return null;
    }

    @Override
    public RenewResponse renew(Renew renewRequest) throws UnacceptableTerminationTimeFault, ResourceUnknownFault {
        return null;
    }
}
