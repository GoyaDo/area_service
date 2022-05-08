package com.wisdom.area.webservice.wsdl;

/**
 * @author goya
 * @create 2022-05-08 01:23
 * @Description
 */
public class NotificationProducerImpl implements NotificationProducer{
    @Override
    public GetCurrentMessageResponse getCurrentMessage(GetCurrentMessage getCurrentMessageRequest) throws InvalidTopicExpressionFault, NoCurrentMessageOnTopicFault, TopicExpressionDialectUnknownFault, TopicNotSupportedFault, MultipleTopicsSpecifiedFault, ResourceUnknownFault {
        return null;
    }

    @Override
    public SubscribeResponse subscribe(Subscribe subscribeRequest) throws InvalidTopicExpressionFault, InvalidMessageContentExpressionFault, TopicNotSupportedFault, TopicExpressionDialectUnknownFault, InvalidProducerPropertiesExpressionFault, NotifyMessageNotSupportedFault, UnacceptableInitialTerminationTimeFault, ResourceUnknownFault, InvalidFilterFault, UnsupportedPolicyRequestFault, SubscribeCreationFailedFault, UnrecognizedPolicyRequestFault {
        return null;
    }
}
