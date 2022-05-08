
package com.wisdom.area.webservice.wsdl;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.ws.wsaddressing.W3CEndpointReference;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.wisdom.area.webservice.wsdl package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static javax.xml.namespace.QName _TopicExpression_QNAME = new javax.xml.namespace.QName("http://docs.oasis-open.org/wsn/b-2", "TopicExpression");
    private final static javax.xml.namespace.QName _FixedTopicSet_QNAME = new javax.xml.namespace.QName("http://docs.oasis-open.org/wsn/b-2", "FixedTopicSet");
    private final static javax.xml.namespace.QName _TopicExpressionDialect_QNAME = new javax.xml.namespace.QName("http://docs.oasis-open.org/wsn/b-2", "TopicExpressionDialect");
    private final static javax.xml.namespace.QName _TopicSet_QNAME = new javax.xml.namespace.QName("http://docs.oasis-open.org/wsn/t-1", "TopicSet");
    private final static javax.xml.namespace.QName _ConsumerReference_QNAME = new javax.xml.namespace.QName("http://docs.oasis-open.org/wsn/b-2", "ConsumerReference");
    private final static javax.xml.namespace.QName _Filter_QNAME = new javax.xml.namespace.QName("http://docs.oasis-open.org/wsn/b-2", "Filter");
    private final static javax.xml.namespace.QName _SubscriptionPolicy_QNAME = new javax.xml.namespace.QName("http://docs.oasis-open.org/wsn/b-2", "SubscriptionPolicy");
    private final static javax.xml.namespace.QName _CreationTime_QNAME = new javax.xml.namespace.QName("http://docs.oasis-open.org/wsn/b-2", "CreationTime");
    private final static javax.xml.namespace.QName _SubscriptionReference_QNAME = new javax.xml.namespace.QName("http://docs.oasis-open.org/wsn/b-2", "SubscriptionReference");
    private final static javax.xml.namespace.QName _Topic_QNAME = new javax.xml.namespace.QName("http://docs.oasis-open.org/wsn/b-2", "Topic");
    private final static javax.xml.namespace.QName _ProducerReference_QNAME = new javax.xml.namespace.QName("http://docs.oasis-open.org/wsn/b-2", "ProducerReference");
    private final static javax.xml.namespace.QName _NotificationMessage_QNAME = new javax.xml.namespace.QName("http://docs.oasis-open.org/wsn/b-2", "NotificationMessage");
    private final static javax.xml.namespace.QName _CurrentTime_QNAME = new javax.xml.namespace.QName("http://docs.oasis-open.org/wsn/b-2", "CurrentTime");
    private final static javax.xml.namespace.QName _TerminationTime_QNAME = new javax.xml.namespace.QName("http://docs.oasis-open.org/wsn/b-2", "TerminationTime");
    private final static javax.xml.namespace.QName _ProducerProperties_QNAME = new javax.xml.namespace.QName("http://docs.oasis-open.org/wsn/b-2", "ProducerProperties");
    private final static javax.xml.namespace.QName _MessageContent_QNAME = new javax.xml.namespace.QName("http://docs.oasis-open.org/wsn/b-2", "MessageContent");
    private final static javax.xml.namespace.QName _SubscribeCreationFailedFault_QNAME = new javax.xml.namespace.QName("http://docs.oasis-open.org/wsn/b-2", "SubscribeCreationFailedFault");
    private final static javax.xml.namespace.QName _InvalidFilterFault_QNAME = new javax.xml.namespace.QName("http://docs.oasis-open.org/wsn/b-2", "InvalidFilterFault");
    private final static javax.xml.namespace.QName _TopicExpressionDialectUnknownFault_QNAME = new javax.xml.namespace.QName("http://docs.oasis-open.org/wsn/b-2", "TopicExpressionDialectUnknownFault");
    private final static javax.xml.namespace.QName _InvalidTopicExpressionFault_QNAME = new javax.xml.namespace.QName("http://docs.oasis-open.org/wsn/b-2", "InvalidTopicExpressionFault");
    private final static javax.xml.namespace.QName _TopicNotSupportedFault_QNAME = new javax.xml.namespace.QName("http://docs.oasis-open.org/wsn/b-2", "TopicNotSupportedFault");
    private final static javax.xml.namespace.QName _MultipleTopicsSpecifiedFault_QNAME = new javax.xml.namespace.QName("http://docs.oasis-open.org/wsn/b-2", "MultipleTopicsSpecifiedFault");
    private final static javax.xml.namespace.QName _InvalidProducerPropertiesExpressionFault_QNAME = new javax.xml.namespace.QName("http://docs.oasis-open.org/wsn/b-2", "InvalidProducerPropertiesExpressionFault");
    private final static javax.xml.namespace.QName _InvalidMessageContentExpressionFault_QNAME = new javax.xml.namespace.QName("http://docs.oasis-open.org/wsn/b-2", "InvalidMessageContentExpressionFault");
    private final static javax.xml.namespace.QName _UnrecognizedPolicyRequestFault_QNAME = new javax.xml.namespace.QName("http://docs.oasis-open.org/wsn/b-2", "UnrecognizedPolicyRequestFault");
    private final static javax.xml.namespace.QName _UnsupportedPolicyRequestFault_QNAME = new javax.xml.namespace.QName("http://docs.oasis-open.org/wsn/b-2", "UnsupportedPolicyRequestFault");
    private final static javax.xml.namespace.QName _NotifyMessageNotSupportedFault_QNAME = new javax.xml.namespace.QName("http://docs.oasis-open.org/wsn/b-2", "NotifyMessageNotSupportedFault");
    private final static javax.xml.namespace.QName _UnacceptableInitialTerminationTimeFault_QNAME = new javax.xml.namespace.QName("http://docs.oasis-open.org/wsn/b-2", "UnacceptableInitialTerminationTimeFault");
    private final static javax.xml.namespace.QName _NoCurrentMessageOnTopicFault_QNAME = new javax.xml.namespace.QName("http://docs.oasis-open.org/wsn/b-2", "NoCurrentMessageOnTopicFault");
    private final static javax.xml.namespace.QName _UnableToGetMessagesFault_QNAME = new javax.xml.namespace.QName("http://docs.oasis-open.org/wsn/b-2", "UnableToGetMessagesFault");
    private final static javax.xml.namespace.QName _UnableToDestroyPullPointFault_QNAME = new javax.xml.namespace.QName("http://docs.oasis-open.org/wsn/b-2", "UnableToDestroyPullPointFault");
    private final static javax.xml.namespace.QName _UnableToCreatePullPointFault_QNAME = new javax.xml.namespace.QName("http://docs.oasis-open.org/wsn/b-2", "UnableToCreatePullPointFault");
    private final static javax.xml.namespace.QName _UnacceptableTerminationTimeFault_QNAME = new javax.xml.namespace.QName("http://docs.oasis-open.org/wsn/b-2", "UnacceptableTerminationTimeFault");
    private final static javax.xml.namespace.QName _UnableToDestroySubscriptionFault_QNAME = new javax.xml.namespace.QName("http://docs.oasis-open.org/wsn/b-2", "UnableToDestroySubscriptionFault");
    private final static javax.xml.namespace.QName _PauseFailedFault_QNAME = new javax.xml.namespace.QName("http://docs.oasis-open.org/wsn/b-2", "PauseFailedFault");
    private final static javax.xml.namespace.QName _ResumeFailedFault_QNAME = new javax.xml.namespace.QName("http://docs.oasis-open.org/wsn/b-2", "ResumeFailedFault");
    private final static javax.xml.namespace.QName _ResourceUnknownFault_QNAME = new javax.xml.namespace.QName("http://docs.oasis-open.org/wsrf/r-2", "ResourceUnknownFault");
    private final static javax.xml.namespace.QName _ResourceUnavailableFault_QNAME = new javax.xml.namespace.QName("http://docs.oasis-open.org/wsrf/r-2", "ResourceUnavailableFault");
    private final static javax.xml.namespace.QName _AdhocQuery_QNAME = new javax.xml.namespace.QName("http://www.chiss.org.cn/rhin/2015", "adhocQuery");
    private final static javax.xml.namespace.QName _OrganizationFeed_QNAME = new javax.xml.namespace.QName("http://www.chiss.org.cn/rhin/2015", "OrganizationFeed");
    private final static javax.xml.namespace.QName _OrganizationFeedResponse_QNAME = new javax.xml.namespace.QName("http://www.chiss.org.cn/rhin/2015", "OrganizationFeedResponse");
    private final static javax.xml.namespace.QName _OrganizationQuery_QNAME = new javax.xml.namespace.QName("http://www.chiss.org.cn/rhin/2015", "OrganizationQuery");
    private final static javax.xml.namespace.QName _OrganizationQueryResponse_QNAME = new javax.xml.namespace.QName("http://www.chiss.org.cn/rhin/2015", "OrganizationQueryResponse");
    private final static javax.xml.namespace.QName _OrganizationRevise_QNAME = new javax.xml.namespace.QName("http://www.chiss.org.cn/rhin/2015", "organizationRevise");
    private final static javax.xml.namespace.QName _BaseFault_QNAME = new javax.xml.namespace.QName("http://docs.oasis-open.org/wsrf/bf-2", "BaseFault");
    private final static javax.xml.namespace.QName _TopicNamespace_QNAME = new javax.xml.namespace.QName("http://docs.oasis-open.org/wsn/t-1", "TopicNamespace");
    private final static javax.xml.namespace.QName _SubscribeInitialTerminationTime_QNAME = new javax.xml.namespace.QName("http://docs.oasis-open.org/wsn/b-2", "InitialTerminationTime");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.wisdom.area.webservice.wsdl
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Subscribe }
     * 
     */
    public Subscribe createSubscribe() {
        return new Subscribe();
    }

    /**
     * Create an instance of {@link TopicNamespaceType }
     * 
     */
    public TopicNamespaceType createTopicNamespaceType() {
        return new TopicNamespaceType();
    }

    /**
     * Create an instance of {@link BaseFaultType }
     * 
     */
    public BaseFaultType createBaseFaultType() {
        return new BaseFaultType();
    }

    /**
     * Create an instance of {@link FamilyHistoryType }
     * 
     */
    public FamilyHistoryType createFamilyHistoryType() {
        return new FamilyHistoryType();
    }

    /**
     * Create an instance of {@link NotificationMessageHolderType }
     * 
     */
    public NotificationMessageHolderType createNotificationMessageHolderType() {
        return new NotificationMessageHolderType();
    }

    /**
     * Create an instance of {@link TopicExpressionType }
     * 
     */
    public TopicExpressionType createTopicExpressionType() {
        return new TopicExpressionType();
    }

    /**
     * Create an instance of {@link NotificationProducerRP }
     * 
     */
    public NotificationProducerRP createNotificationProducerRP() {
        return new NotificationProducerRP();
    }

    /**
     * Create an instance of {@link TopicSetType }
     * 
     */
    public TopicSetType createTopicSetType() {
        return new TopicSetType();
    }

    /**
     * Create an instance of {@link FilterType }
     * 
     */
    public FilterType createFilterType() {
        return new FilterType();
    }

    /**
     * Create an instance of {@link SubscriptionPolicyType }
     * 
     */
    public SubscriptionPolicyType createSubscriptionPolicyType() {
        return new SubscriptionPolicyType();
    }

    /**
     * Create an instance of {@link SubscriptionManagerRP }
     * 
     */
    public SubscriptionManagerRP createSubscriptionManagerRP() {
        return new SubscriptionManagerRP();
    }

    /**
     * Create an instance of {@link Notify }
     * 
     */
    public Notify createNotify() {
        return new Notify();
    }

    /**
     * Create an instance of {@link QueryExpressionType }
     * 
     */
    public QueryExpressionType createQueryExpressionType() {
        return new QueryExpressionType();
    }

    /**
     * Create an instance of {@link UseRaw }
     * 
     */
    public UseRaw createUseRaw() {
        return new UseRaw();
    }

    /**
     * Create an instance of {@link Subscribe.SubscriptionPolicy }
     * 
     */
    public Subscribe.SubscriptionPolicy createSubscribeSubscriptionPolicy() {
        return new Subscribe.SubscriptionPolicy();
    }

    /**
     * Create an instance of {@link SubscribeResponse }
     * 
     */
    public SubscribeResponse createSubscribeResponse() {
        return new SubscribeResponse();
    }

    /**
     * Create an instance of {@link GetCurrentMessage }
     * 
     */
    public GetCurrentMessage createGetCurrentMessage() {
        return new GetCurrentMessage();
    }

    /**
     * Create an instance of {@link GetCurrentMessageResponse }
     * 
     */
    public GetCurrentMessageResponse createGetCurrentMessageResponse() {
        return new GetCurrentMessageResponse();
    }

    /**
     * Create an instance of {@link SubscribeCreationFailedFaultType }
     * 
     */
    public SubscribeCreationFailedFaultType createSubscribeCreationFailedFaultType() {
        return new SubscribeCreationFailedFaultType();
    }

    /**
     * Create an instance of {@link InvalidFilterFaultType }
     * 
     */
    public InvalidFilterFaultType createInvalidFilterFaultType() {
        return new InvalidFilterFaultType();
    }

    /**
     * Create an instance of {@link TopicExpressionDialectUnknownFaultType }
     * 
     */
    public TopicExpressionDialectUnknownFaultType createTopicExpressionDialectUnknownFaultType() {
        return new TopicExpressionDialectUnknownFaultType();
    }

    /**
     * Create an instance of {@link InvalidTopicExpressionFaultType }
     * 
     */
    public InvalidTopicExpressionFaultType createInvalidTopicExpressionFaultType() {
        return new InvalidTopicExpressionFaultType();
    }

    /**
     * Create an instance of {@link TopicNotSupportedFaultType }
     * 
     */
    public TopicNotSupportedFaultType createTopicNotSupportedFaultType() {
        return new TopicNotSupportedFaultType();
    }

    /**
     * Create an instance of {@link MultipleTopicsSpecifiedFaultType }
     * 
     */
    public MultipleTopicsSpecifiedFaultType createMultipleTopicsSpecifiedFaultType() {
        return new MultipleTopicsSpecifiedFaultType();
    }

    /**
     * Create an instance of {@link InvalidProducerPropertiesExpressionFaultType }
     * 
     */
    public InvalidProducerPropertiesExpressionFaultType createInvalidProducerPropertiesExpressionFaultType() {
        return new InvalidProducerPropertiesExpressionFaultType();
    }

    /**
     * Create an instance of {@link InvalidMessageContentExpressionFaultType }
     * 
     */
    public InvalidMessageContentExpressionFaultType createInvalidMessageContentExpressionFaultType() {
        return new InvalidMessageContentExpressionFaultType();
    }

    /**
     * Create an instance of {@link UnrecognizedPolicyRequestFaultType }
     * 
     */
    public UnrecognizedPolicyRequestFaultType createUnrecognizedPolicyRequestFaultType() {
        return new UnrecognizedPolicyRequestFaultType();
    }

    /**
     * Create an instance of {@link UnsupportedPolicyRequestFaultType }
     * 
     */
    public UnsupportedPolicyRequestFaultType createUnsupportedPolicyRequestFaultType() {
        return new UnsupportedPolicyRequestFaultType();
    }

    /**
     * Create an instance of {@link NotifyMessageNotSupportedFaultType }
     * 
     */
    public NotifyMessageNotSupportedFaultType createNotifyMessageNotSupportedFaultType() {
        return new NotifyMessageNotSupportedFaultType();
    }

    /**
     * Create an instance of {@link UnacceptableInitialTerminationTimeFaultType }
     * 
     */
    public UnacceptableInitialTerminationTimeFaultType createUnacceptableInitialTerminationTimeFaultType() {
        return new UnacceptableInitialTerminationTimeFaultType();
    }

    /**
     * Create an instance of {@link NoCurrentMessageOnTopicFaultType }
     * 
     */
    public NoCurrentMessageOnTopicFaultType createNoCurrentMessageOnTopicFaultType() {
        return new NoCurrentMessageOnTopicFaultType();
    }

    /**
     * Create an instance of {@link GetMessages }
     * 
     */
    public GetMessages createGetMessages() {
        return new GetMessages();
    }

    /**
     * Create an instance of {@link GetMessagesResponse }
     * 
     */
    public GetMessagesResponse createGetMessagesResponse() {
        return new GetMessagesResponse();
    }

    /**
     * Create an instance of {@link DestroyPullPoint }
     * 
     */
    public DestroyPullPoint createDestroyPullPoint() {
        return new DestroyPullPoint();
    }

    /**
     * Create an instance of {@link DestroyPullPointResponse }
     * 
     */
    public DestroyPullPointResponse createDestroyPullPointResponse() {
        return new DestroyPullPointResponse();
    }

    /**
     * Create an instance of {@link UnableToGetMessagesFaultType }
     * 
     */
    public UnableToGetMessagesFaultType createUnableToGetMessagesFaultType() {
        return new UnableToGetMessagesFaultType();
    }

    /**
     * Create an instance of {@link UnableToDestroyPullPointFaultType }
     * 
     */
    public UnableToDestroyPullPointFaultType createUnableToDestroyPullPointFaultType() {
        return new UnableToDestroyPullPointFaultType();
    }

    /**
     * Create an instance of {@link CreatePullPoint }
     * 
     */
    public CreatePullPoint createCreatePullPoint() {
        return new CreatePullPoint();
    }

    /**
     * Create an instance of {@link CreatePullPointResponse }
     * 
     */
    public CreatePullPointResponse createCreatePullPointResponse() {
        return new CreatePullPointResponse();
    }

    /**
     * Create an instance of {@link UnableToCreatePullPointFaultType }
     * 
     */
    public UnableToCreatePullPointFaultType createUnableToCreatePullPointFaultType() {
        return new UnableToCreatePullPointFaultType();
    }

    /**
     * Create an instance of {@link Renew }
     * 
     */
    public Renew createRenew() {
        return new Renew();
    }

    /**
     * Create an instance of {@link RenewResponse }
     * 
     */
    public RenewResponse createRenewResponse() {
        return new RenewResponse();
    }

    /**
     * Create an instance of {@link UnacceptableTerminationTimeFaultType }
     * 
     */
    public UnacceptableTerminationTimeFaultType createUnacceptableTerminationTimeFaultType() {
        return new UnacceptableTerminationTimeFaultType();
    }

    /**
     * Create an instance of {@link Unsubscribe }
     * 
     */
    public Unsubscribe createUnsubscribe() {
        return new Unsubscribe();
    }

    /**
     * Create an instance of {@link UnsubscribeResponse }
     * 
     */
    public UnsubscribeResponse createUnsubscribeResponse() {
        return new UnsubscribeResponse();
    }

    /**
     * Create an instance of {@link UnableToDestroySubscriptionFaultType }
     * 
     */
    public UnableToDestroySubscriptionFaultType createUnableToDestroySubscriptionFaultType() {
        return new UnableToDestroySubscriptionFaultType();
    }

    /**
     * Create an instance of {@link PauseSubscription }
     * 
     */
    public PauseSubscription createPauseSubscription() {
        return new PauseSubscription();
    }

    /**
     * Create an instance of {@link PauseSubscriptionResponse }
     * 
     */
    public PauseSubscriptionResponse createPauseSubscriptionResponse() {
        return new PauseSubscriptionResponse();
    }

    /**
     * Create an instance of {@link ResumeSubscription }
     * 
     */
    public ResumeSubscription createResumeSubscription() {
        return new ResumeSubscription();
    }

    /**
     * Create an instance of {@link ResumeSubscriptionResponse }
     * 
     */
    public ResumeSubscriptionResponse createResumeSubscriptionResponse() {
        return new ResumeSubscriptionResponse();
    }

    /**
     * Create an instance of {@link PauseFailedFaultType }
     * 
     */
    public PauseFailedFaultType createPauseFailedFaultType() {
        return new PauseFailedFaultType();
    }

    /**
     * Create an instance of {@link ResumeFailedFaultType }
     * 
     */
    public ResumeFailedFaultType createResumeFailedFaultType() {
        return new ResumeFailedFaultType();
    }

    /**
     * Create an instance of {@link ResourceUnknownFaultType }
     * 
     */
    public ResourceUnknownFaultType createResourceUnknownFaultType() {
        return new ResourceUnknownFaultType();
    }

    /**
     * Create an instance of {@link ResourceUnavailableFaultType }
     * 
     */
    public ResourceUnavailableFaultType createResourceUnavailableFaultType() {
        return new ResourceUnavailableFaultType();
    }

    /**
     * Create an instance of {@link AdhocQuery }
     * 
     */
    public AdhocQuery createAdhocQuery() {
        return new AdhocQuery();
    }

    /**
     * Create an instance of {@link OrganizationFeed }
     * 
     */
    public OrganizationFeed createOrganizationFeed() {
        return new OrganizationFeed();
    }

    /**
     * Create an instance of {@link OrganizationFeedResponse }
     * 
     */
    public OrganizationFeedResponse createOrganizationFeedResponse() {
        return new OrganizationFeedResponse();
    }

    /**
     * Create an instance of {@link OrganizationQueryRequest }
     * 
     */
    public OrganizationQueryRequest createOrganizationQueryRequest() {
        return new OrganizationQueryRequest();
    }

    /**
     * Create an instance of {@link OrganizationQueryResponseMessage }
     * 
     */
    public OrganizationQueryResponseMessage createOrganizationQueryResponseMessage() {
        return new OrganizationQueryResponseMessage();
    }

    /**
     * Create an instance of {@link OrganizationReviseNotify }
     * 
     */
    public OrganizationReviseNotify createOrganizationReviseNotify() {
        return new OrganizationReviseNotify();
    }

    /**
     * Create an instance of {@link String }
     * 
     */
    public String createString() {
        return new String();
    }

    /**
     * Create an instance of {@link Boolean }
     * 
     */
    public Boolean createBoolean() {
        return new Boolean();
    }

    /**
     * Create an instance of {@link Date }
     * 
     */
    public Date createDate() {
        return new Date();
    }

    /**
     * Create an instance of {@link Time }
     * 
     */
    public Time createTime() {
        return new Time();
    }

    /**
     * Create an instance of {@link DateTime }
     * 
     */
    public DateTime createDateTime() {
        return new DateTime();
    }

    /**
     * Create an instance of {@link Duration }
     * 
     */
    public Duration createDuration() {
        return new Duration();
    }

    /**
     * Create an instance of {@link Language }
     * 
     */
    public Language createLanguage() {
        return new Language();
    }

    /**
     * Create an instance of {@link Code }
     * 
     */
    public Code createCode() {
        return new Code();
    }

    /**
     * Create an instance of {@link UnsignedInt }
     * 
     */
    public UnsignedInt createUnsignedInt() {
        return new UnsignedInt();
    }

    /**
     * Create an instance of {@link Integer }
     * 
     */
    public Integer createInteger() {
        return new Integer();
    }

    /**
     * Create an instance of {@link Decimal }
     * 
     */
    public Decimal createDecimal() {
        return new Decimal();
    }

    /**
     * Create an instance of {@link NCName }
     * 
     */
    public NCName createNCName() {
        return new NCName();
    }

    /**
     * Create an instance of {@link QName }
     * 
     */
    public QName createQName() {
        return new QName();
    }

    /**
     * Create an instance of {@link Base64Binary }
     * 
     */
    public Base64Binary createBase64Binary() {
        return new Base64Binary();
    }

    /**
     * Create an instance of {@link URI }
     * 
     */
    public URI createURI() {
        return new URI();
    }

    /**
     * Create an instance of {@link URN }
     * 
     */
    public URN createURN() {
        return new URN();
    }

    /**
     * Create an instance of {@link ID }
     * 
     */
    public ID createID() {
        return new ID();
    }

    /**
     * Create an instance of {@link OID }
     * 
     */
    public OID createOID() {
        return new OID();
    }

    /**
     * Create an instance of {@link UUID }
     * 
     */
    public UUID createUUID() {
        return new UUID();
    }

    /**
     * Create an instance of {@link Instant }
     * 
     */
    public Instant createInstant() {
        return new Instant();
    }

    /**
     * Create an instance of {@link Identifier }
     * 
     */
    public Identifier createIdentifier() {
        return new Identifier();
    }

    /**
     * Create an instance of {@link Period }
     * 
     */
    public Period createPeriod() {
        return new Period();
    }

    /**
     * Create an instance of {@link Reference }
     * 
     */
    public Reference createReference() {
        return new Reference();
    }

    /**
     * Create an instance of {@link Coding }
     * 
     */
    public Coding createCoding() {
        return new Coding();
    }

    /**
     * Create an instance of {@link CodeableConcept }
     * 
     */
    public CodeableConcept createCodeableConcept() {
        return new CodeableConcept();
    }

    /**
     * Create an instance of {@link Quantity }
     * 
     */
    public Quantity createQuantity() {
        return new Quantity();
    }

    /**
     * Create an instance of {@link NameUse }
     * 
     */
    public NameUse createNameUse() {
        return new NameUse();
    }

    /**
     * Create an instance of {@link HumanName }
     * 
     */
    public HumanName createHumanName() {
        return new HumanName();
    }

    /**
     * Create an instance of {@link AddressUse }
     * 
     */
    public AddressUse createAddressUse() {
        return new AddressUse();
    }

    /**
     * Create an instance of {@link AddressType }
     * 
     */
    public AddressType createAddressType() {
        return new AddressType();
    }

    /**
     * Create an instance of {@link Address }
     * 
     */
    public Address createAddress() {
        return new Address();
    }

    /**
     * Create an instance of {@link BackboneElement }
     * 
     */
    public BackboneElement createBackboneElement() {
        return new BackboneElement();
    }

    /**
     * Create an instance of {@link TelecomMode }
     * 
     */
    public TelecomMode createTelecomMode() {
        return new TelecomMode();
    }

    /**
     * Create an instance of {@link Telecom }
     * 
     */
    public Telecom createTelecom() {
        return new Telecom();
    }

    /**
     * Create an instance of {@link NameValuePairType }
     * 
     */
    public NameValuePairType createNameValuePairType() {
        return new NameValuePairType();
    }

    /**
     * Create an instance of {@link ValueList }
     * 
     */
    public ValueList createValueList() {
        return new ValueList();
    }

    /**
     * Create an instance of {@link Slot }
     * 
     */
    public Slot createSlot() {
        return new Slot();
    }

    /**
     * Create an instance of {@link SlotListType }
     * 
     */
    public SlotListType createSlotListType() {
        return new SlotListType();
    }

    /**
     * Create an instance of {@link NullResponse }
     * 
     */
    public NullResponse createNullResponse() {
        return new NullResponse();
    }

    /**
     * Create an instance of {@link BloodType }
     * 
     */
    public BloodType createBloodType() {
        return new BloodType();
    }

    /**
     * Create an instance of {@link HealthHistoryType }
     * 
     */
    public HealthHistoryType createHealthHistoryType() {
        return new HealthHistoryType();
    }

    /**
     * Create an instance of {@link PhysicalCondition }
     * 
     */
    public PhysicalCondition createPhysicalCondition() {
        return new PhysicalCondition();
    }

    /**
     * Create an instance of {@link Contact }
     * 
     */
    public Contact createContact() {
        return new Contact();
    }

    /**
     * Create an instance of {@link Guardian }
     * 
     */
    public Guardian createGuardian() {
        return new Guardian();
    }

    /**
     * Create an instance of {@link Person }
     * 
     */
    public Person createPerson() {
        return new Person();
    }

    /**
     * Create an instance of {@link Patient }
     * 
     */
    public Patient createPatient() {
        return new Patient();
    }

    /**
     * Create an instance of {@link Organization }
     * 
     */
    public Organization createOrganization() {
        return new Organization();
    }

    /**
     * Create an instance of {@link MainID }
     * 
     */
    public MainID createMainID() {
        return new MainID();
    }

    /**
     * Create an instance of {@link Practitioner }
     * 
     */
    public Practitioner createPractitioner() {
        return new Practitioner();
    }

    /**
     * Create an instance of {@link PersonBrief }
     * 
     */
    public PersonBrief createPersonBrief() {
        return new PersonBrief();
    }

    /**
     * Create an instance of {@link OrganizationBrief }
     * 
     */
    public OrganizationBrief createOrganizationBrief() {
        return new OrganizationBrief();
    }

    /**
     * Create an instance of {@link PractitionerBrief }
     * 
     */
    public PractitionerBrief createPractitionerBrief() {
        return new PractitionerBrief();
    }

    /**
     * Create an instance of {@link Extension }
     * 
     */
    public Extension createExtension() {
        return new Extension();
    }

    /**
     * Create an instance of {@link ObjectStatus }
     * 
     */
    public ObjectStatus createObjectStatus() {
        return new ObjectStatus();
    }

    /**
     * Create an instance of {@link ObjectRef }
     * 
     */
    public ObjectRef createObjectRef() {
        return new ObjectRef();
    }

    /**
     * Create an instance of {@link Documentation }
     * 
     */
    public Documentation createDocumentation() {
        return new Documentation();
    }

    /**
     * Create an instance of {@link TopicType }
     * 
     */
    public TopicType createTopicType() {
        return new TopicType();
    }

    /**
     * Create an instance of {@link TopicNamespaceType.Topic }
     * 
     */
    public TopicNamespaceType.Topic createTopicNamespaceTypeTopic() {
        return new TopicNamespaceType.Topic();
    }

    /**
     * Create an instance of {@link BaseFaultType.ErrorCode }
     * 
     */
    public BaseFaultType.ErrorCode createBaseFaultTypeErrorCode() {
        return new BaseFaultType.ErrorCode();
    }

    /**
     * Create an instance of {@link BaseFaultType.Description }
     * 
     */
    public BaseFaultType.Description createBaseFaultTypeDescription() {
        return new BaseFaultType.Description();
    }

    /**
     * Create an instance of {@link BaseFaultType.FaultCause }
     * 
     */
    public BaseFaultType.FaultCause createBaseFaultTypeFaultCause() {
        return new BaseFaultType.FaultCause();
    }

    /**
     * Create an instance of {@link FamilyHistoryType.Relatives }
     * 
     */
    public FamilyHistoryType.Relatives createFamilyHistoryTypeRelatives() {
        return new FamilyHistoryType.Relatives();
    }

    /**
     * Create an instance of {@link NotificationMessageHolderType.Message }
     * 
     */
    public NotificationMessageHolderType.Message createNotificationMessageHolderTypeMessage() {
        return new NotificationMessageHolderType.Message();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TopicExpressionType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TopicExpressionType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/wsn/b-2", name = "TopicExpression")
    public JAXBElement<TopicExpressionType> createTopicExpression(TopicExpressionType value) {
        return new JAXBElement<TopicExpressionType>(_TopicExpression_QNAME, TopicExpressionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link java.lang.Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/wsn/b-2", name = "FixedTopicSet", defaultValue = "true")
    public JAXBElement<java.lang.Boolean> createFixedTopicSet(java.lang.Boolean value) {
        return new JAXBElement<java.lang.Boolean>(_FixedTopicSet_QNAME, java.lang.Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/wsn/b-2", name = "TopicExpressionDialect")
    public JAXBElement<java.lang.String> createTopicExpressionDialect(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_TopicExpressionDialect_QNAME, java.lang.String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TopicSetType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TopicSetType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/wsn/t-1", name = "TopicSet")
    public JAXBElement<TopicSetType> createTopicSet(TopicSetType value) {
        return new JAXBElement<TopicSetType>(_TopicSet_QNAME, TopicSetType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link W3CEndpointReference }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link W3CEndpointReference }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/wsn/b-2", name = "ConsumerReference")
    public JAXBElement<W3CEndpointReference> createConsumerReference(W3CEndpointReference value) {
        return new JAXBElement<W3CEndpointReference>(_ConsumerReference_QNAME, W3CEndpointReference.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FilterType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FilterType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/wsn/b-2", name = "Filter")
    public JAXBElement<FilterType> createFilter(FilterType value) {
        return new JAXBElement<FilterType>(_Filter_QNAME, FilterType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SubscriptionPolicyType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SubscriptionPolicyType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/wsn/b-2", name = "SubscriptionPolicy")
    public JAXBElement<SubscriptionPolicyType> createSubscriptionPolicy(SubscriptionPolicyType value) {
        return new JAXBElement<SubscriptionPolicyType>(_SubscriptionPolicy_QNAME, SubscriptionPolicyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/wsn/b-2", name = "CreationTime")
    public JAXBElement<XMLGregorianCalendar> createCreationTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_CreationTime_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link W3CEndpointReference }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link W3CEndpointReference }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/wsn/b-2", name = "SubscriptionReference")
    public JAXBElement<W3CEndpointReference> createSubscriptionReference(W3CEndpointReference value) {
        return new JAXBElement<W3CEndpointReference>(_SubscriptionReference_QNAME, W3CEndpointReference.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TopicExpressionType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TopicExpressionType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/wsn/b-2", name = "Topic")
    public JAXBElement<TopicExpressionType> createTopic(TopicExpressionType value) {
        return new JAXBElement<TopicExpressionType>(_Topic_QNAME, TopicExpressionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link W3CEndpointReference }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link W3CEndpointReference }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/wsn/b-2", name = "ProducerReference")
    public JAXBElement<W3CEndpointReference> createProducerReference(W3CEndpointReference value) {
        return new JAXBElement<W3CEndpointReference>(_ProducerReference_QNAME, W3CEndpointReference.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NotificationMessageHolderType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link NotificationMessageHolderType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/wsn/b-2", name = "NotificationMessage")
    public JAXBElement<NotificationMessageHolderType> createNotificationMessage(NotificationMessageHolderType value) {
        return new JAXBElement<NotificationMessageHolderType>(_NotificationMessage_QNAME, NotificationMessageHolderType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/wsn/b-2", name = "CurrentTime")
    public JAXBElement<XMLGregorianCalendar> createCurrentTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_CurrentTime_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/wsn/b-2", name = "TerminationTime")
    public JAXBElement<XMLGregorianCalendar> createTerminationTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_TerminationTime_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryExpressionType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link QueryExpressionType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/wsn/b-2", name = "ProducerProperties")
    public JAXBElement<QueryExpressionType> createProducerProperties(QueryExpressionType value) {
        return new JAXBElement<QueryExpressionType>(_ProducerProperties_QNAME, QueryExpressionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryExpressionType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link QueryExpressionType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/wsn/b-2", name = "MessageContent")
    public JAXBElement<QueryExpressionType> createMessageContent(QueryExpressionType value) {
        return new JAXBElement<QueryExpressionType>(_MessageContent_QNAME, QueryExpressionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SubscribeCreationFailedFaultType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SubscribeCreationFailedFaultType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/wsn/b-2", name = "SubscribeCreationFailedFault")
    public JAXBElement<SubscribeCreationFailedFaultType> createSubscribeCreationFailedFault(SubscribeCreationFailedFaultType value) {
        return new JAXBElement<SubscribeCreationFailedFaultType>(_SubscribeCreationFailedFault_QNAME, SubscribeCreationFailedFaultType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InvalidFilterFaultType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link InvalidFilterFaultType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/wsn/b-2", name = "InvalidFilterFault")
    public JAXBElement<InvalidFilterFaultType> createInvalidFilterFault(InvalidFilterFaultType value) {
        return new JAXBElement<InvalidFilterFaultType>(_InvalidFilterFault_QNAME, InvalidFilterFaultType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TopicExpressionDialectUnknownFaultType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TopicExpressionDialectUnknownFaultType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/wsn/b-2", name = "TopicExpressionDialectUnknownFault")
    public JAXBElement<TopicExpressionDialectUnknownFaultType> createTopicExpressionDialectUnknownFault(TopicExpressionDialectUnknownFaultType value) {
        return new JAXBElement<TopicExpressionDialectUnknownFaultType>(_TopicExpressionDialectUnknownFault_QNAME, TopicExpressionDialectUnknownFaultType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InvalidTopicExpressionFaultType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link InvalidTopicExpressionFaultType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/wsn/b-2", name = "InvalidTopicExpressionFault")
    public JAXBElement<InvalidTopicExpressionFaultType> createInvalidTopicExpressionFault(InvalidTopicExpressionFaultType value) {
        return new JAXBElement<InvalidTopicExpressionFaultType>(_InvalidTopicExpressionFault_QNAME, InvalidTopicExpressionFaultType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TopicNotSupportedFaultType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TopicNotSupportedFaultType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/wsn/b-2", name = "TopicNotSupportedFault")
    public JAXBElement<TopicNotSupportedFaultType> createTopicNotSupportedFault(TopicNotSupportedFaultType value) {
        return new JAXBElement<TopicNotSupportedFaultType>(_TopicNotSupportedFault_QNAME, TopicNotSupportedFaultType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MultipleTopicsSpecifiedFaultType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MultipleTopicsSpecifiedFaultType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/wsn/b-2", name = "MultipleTopicsSpecifiedFault")
    public JAXBElement<MultipleTopicsSpecifiedFaultType> createMultipleTopicsSpecifiedFault(MultipleTopicsSpecifiedFaultType value) {
        return new JAXBElement<MultipleTopicsSpecifiedFaultType>(_MultipleTopicsSpecifiedFault_QNAME, MultipleTopicsSpecifiedFaultType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InvalidProducerPropertiesExpressionFaultType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link InvalidProducerPropertiesExpressionFaultType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/wsn/b-2", name = "InvalidProducerPropertiesExpressionFault")
    public JAXBElement<InvalidProducerPropertiesExpressionFaultType> createInvalidProducerPropertiesExpressionFault(InvalidProducerPropertiesExpressionFaultType value) {
        return new JAXBElement<InvalidProducerPropertiesExpressionFaultType>(_InvalidProducerPropertiesExpressionFault_QNAME, InvalidProducerPropertiesExpressionFaultType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InvalidMessageContentExpressionFaultType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link InvalidMessageContentExpressionFaultType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/wsn/b-2", name = "InvalidMessageContentExpressionFault")
    public JAXBElement<InvalidMessageContentExpressionFaultType> createInvalidMessageContentExpressionFault(InvalidMessageContentExpressionFaultType value) {
        return new JAXBElement<InvalidMessageContentExpressionFaultType>(_InvalidMessageContentExpressionFault_QNAME, InvalidMessageContentExpressionFaultType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnrecognizedPolicyRequestFaultType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UnrecognizedPolicyRequestFaultType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/wsn/b-2", name = "UnrecognizedPolicyRequestFault")
    public JAXBElement<UnrecognizedPolicyRequestFaultType> createUnrecognizedPolicyRequestFault(UnrecognizedPolicyRequestFaultType value) {
        return new JAXBElement<UnrecognizedPolicyRequestFaultType>(_UnrecognizedPolicyRequestFault_QNAME, UnrecognizedPolicyRequestFaultType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnsupportedPolicyRequestFaultType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UnsupportedPolicyRequestFaultType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/wsn/b-2", name = "UnsupportedPolicyRequestFault")
    public JAXBElement<UnsupportedPolicyRequestFaultType> createUnsupportedPolicyRequestFault(UnsupportedPolicyRequestFaultType value) {
        return new JAXBElement<UnsupportedPolicyRequestFaultType>(_UnsupportedPolicyRequestFault_QNAME, UnsupportedPolicyRequestFaultType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NotifyMessageNotSupportedFaultType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link NotifyMessageNotSupportedFaultType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/wsn/b-2", name = "NotifyMessageNotSupportedFault")
    public JAXBElement<NotifyMessageNotSupportedFaultType> createNotifyMessageNotSupportedFault(NotifyMessageNotSupportedFaultType value) {
        return new JAXBElement<NotifyMessageNotSupportedFaultType>(_NotifyMessageNotSupportedFault_QNAME, NotifyMessageNotSupportedFaultType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnacceptableInitialTerminationTimeFaultType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UnacceptableInitialTerminationTimeFaultType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/wsn/b-2", name = "UnacceptableInitialTerminationTimeFault")
    public JAXBElement<UnacceptableInitialTerminationTimeFaultType> createUnacceptableInitialTerminationTimeFault(UnacceptableInitialTerminationTimeFaultType value) {
        return new JAXBElement<UnacceptableInitialTerminationTimeFaultType>(_UnacceptableInitialTerminationTimeFault_QNAME, UnacceptableInitialTerminationTimeFaultType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NoCurrentMessageOnTopicFaultType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link NoCurrentMessageOnTopicFaultType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/wsn/b-2", name = "NoCurrentMessageOnTopicFault")
    public JAXBElement<NoCurrentMessageOnTopicFaultType> createNoCurrentMessageOnTopicFault(NoCurrentMessageOnTopicFaultType value) {
        return new JAXBElement<NoCurrentMessageOnTopicFaultType>(_NoCurrentMessageOnTopicFault_QNAME, NoCurrentMessageOnTopicFaultType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnableToGetMessagesFaultType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UnableToGetMessagesFaultType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/wsn/b-2", name = "UnableToGetMessagesFault")
    public JAXBElement<UnableToGetMessagesFaultType> createUnableToGetMessagesFault(UnableToGetMessagesFaultType value) {
        return new JAXBElement<UnableToGetMessagesFaultType>(_UnableToGetMessagesFault_QNAME, UnableToGetMessagesFaultType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnableToDestroyPullPointFaultType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UnableToDestroyPullPointFaultType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/wsn/b-2", name = "UnableToDestroyPullPointFault")
    public JAXBElement<UnableToDestroyPullPointFaultType> createUnableToDestroyPullPointFault(UnableToDestroyPullPointFaultType value) {
        return new JAXBElement<UnableToDestroyPullPointFaultType>(_UnableToDestroyPullPointFault_QNAME, UnableToDestroyPullPointFaultType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnableToCreatePullPointFaultType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UnableToCreatePullPointFaultType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/wsn/b-2", name = "UnableToCreatePullPointFault")
    public JAXBElement<UnableToCreatePullPointFaultType> createUnableToCreatePullPointFault(UnableToCreatePullPointFaultType value) {
        return new JAXBElement<UnableToCreatePullPointFaultType>(_UnableToCreatePullPointFault_QNAME, UnableToCreatePullPointFaultType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnacceptableTerminationTimeFaultType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UnacceptableTerminationTimeFaultType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/wsn/b-2", name = "UnacceptableTerminationTimeFault")
    public JAXBElement<UnacceptableTerminationTimeFaultType> createUnacceptableTerminationTimeFault(UnacceptableTerminationTimeFaultType value) {
        return new JAXBElement<UnacceptableTerminationTimeFaultType>(_UnacceptableTerminationTimeFault_QNAME, UnacceptableTerminationTimeFaultType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnableToDestroySubscriptionFaultType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UnableToDestroySubscriptionFaultType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/wsn/b-2", name = "UnableToDestroySubscriptionFault")
    public JAXBElement<UnableToDestroySubscriptionFaultType> createUnableToDestroySubscriptionFault(UnableToDestroySubscriptionFaultType value) {
        return new JAXBElement<UnableToDestroySubscriptionFaultType>(_UnableToDestroySubscriptionFault_QNAME, UnableToDestroySubscriptionFaultType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PauseFailedFaultType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PauseFailedFaultType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/wsn/b-2", name = "PauseFailedFault")
    public JAXBElement<PauseFailedFaultType> createPauseFailedFault(PauseFailedFaultType value) {
        return new JAXBElement<PauseFailedFaultType>(_PauseFailedFault_QNAME, PauseFailedFaultType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResumeFailedFaultType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ResumeFailedFaultType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/wsn/b-2", name = "ResumeFailedFault")
    public JAXBElement<ResumeFailedFaultType> createResumeFailedFault(ResumeFailedFaultType value) {
        return new JAXBElement<ResumeFailedFaultType>(_ResumeFailedFault_QNAME, ResumeFailedFaultType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResourceUnknownFaultType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ResourceUnknownFaultType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/wsrf/r-2", name = "ResourceUnknownFault")
    public JAXBElement<ResourceUnknownFaultType> createResourceUnknownFault(ResourceUnknownFaultType value) {
        return new JAXBElement<ResourceUnknownFaultType>(_ResourceUnknownFault_QNAME, ResourceUnknownFaultType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResourceUnavailableFaultType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ResourceUnavailableFaultType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/wsrf/r-2", name = "ResourceUnavailableFault")
    public JAXBElement<ResourceUnavailableFaultType> createResourceUnavailableFault(ResourceUnavailableFaultType value) {
        return new JAXBElement<ResourceUnavailableFaultType>(_ResourceUnavailableFault_QNAME, ResourceUnavailableFaultType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdhocQuery }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AdhocQuery }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.chiss.org.cn/rhin/2015", name = "adhocQuery")
    public JAXBElement<AdhocQuery> createAdhocQuery(AdhocQuery value) {
        return new JAXBElement<AdhocQuery>(_AdhocQuery_QNAME, AdhocQuery.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrganizationFeed }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link OrganizationFeed }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.chiss.org.cn/rhin/2015", name = "OrganizationFeed")
    public JAXBElement<OrganizationFeed> createOrganizationFeed(OrganizationFeed value) {
        return new JAXBElement<OrganizationFeed>(_OrganizationFeed_QNAME, OrganizationFeed.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrganizationFeedResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link OrganizationFeedResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.chiss.org.cn/rhin/2015", name = "OrganizationFeedResponse")
    public JAXBElement<OrganizationFeedResponse> createOrganizationFeedResponse(OrganizationFeedResponse value) {
        return new JAXBElement<OrganizationFeedResponse>(_OrganizationFeedResponse_QNAME, OrganizationFeedResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrganizationQueryRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link OrganizationQueryRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.chiss.org.cn/rhin/2015", name = "OrganizationQuery")
    public JAXBElement<OrganizationQueryRequest> createOrganizationQuery(OrganizationQueryRequest value) {
        return new JAXBElement<OrganizationQueryRequest>(_OrganizationQuery_QNAME, OrganizationQueryRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrganizationQueryResponseMessage }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link OrganizationQueryResponseMessage }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.chiss.org.cn/rhin/2015", name = "OrganizationQueryResponse")
    public JAXBElement<OrganizationQueryResponseMessage> createOrganizationQueryResponse(OrganizationQueryResponseMessage value) {
        return new JAXBElement<OrganizationQueryResponseMessage>(_OrganizationQueryResponse_QNAME, OrganizationQueryResponseMessage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrganizationReviseNotify }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link OrganizationReviseNotify }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.chiss.org.cn/rhin/2015", name = "organizationRevise")
    public JAXBElement<OrganizationReviseNotify> createOrganizationRevise(OrganizationReviseNotify value) {
        return new JAXBElement<OrganizationReviseNotify>(_OrganizationRevise_QNAME, OrganizationReviseNotify.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BaseFaultType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BaseFaultType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/wsrf/bf-2", name = "BaseFault")
    public JAXBElement<BaseFaultType> createBaseFault(BaseFaultType value) {
        return new JAXBElement<BaseFaultType>(_BaseFault_QNAME, BaseFaultType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TopicNamespaceType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TopicNamespaceType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/wsn/t-1", name = "TopicNamespace")
    public JAXBElement<TopicNamespaceType> createTopicNamespace(TopicNamespaceType value) {
        return new JAXBElement<TopicNamespaceType>(_TopicNamespace_QNAME, TopicNamespaceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/wsn/b-2", name = "InitialTerminationTime", scope = Subscribe.class)
    public JAXBElement<java.lang.String> createSubscribeInitialTerminationTime(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_SubscribeInitialTerminationTime_QNAME, java.lang.String.class, Subscribe.class, value);
    }

}
