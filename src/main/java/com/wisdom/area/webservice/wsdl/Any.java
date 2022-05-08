
package com.wisdom.area.webservice.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Any complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="Any"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="nullFlavor" type="{http://www.chiss.org.cn/rhin/2015}nullFlavorPrimitive" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Any")
@XmlSeeAlso({
    String.class,
    Boolean.class,
    Date.class,
    Time.class,
    DateTime.class,
    Duration.class,
    Language.class,
    Code.class,
    UnsignedInt.class,
    Integer.class,
    Decimal.class,
    NCName.class,
    QName.class,
    Base64Binary.class,
    URI.class,
    URN.class,
    OID.class,
    UUID.class,
    Instant.class,
    Identifier.class,
    Period.class,
    Reference.class,
    Coding.class,
    CodeableConcept.class,
    Quantity.class,
    NameUse.class,
    HumanName.class,
    AddressUse.class,
    AddressType.class,
    Address.class,
    BackboneElement.class,
    TelecomMode.class,
    ID.class,
    ObjectStatus.class
})
public abstract class Any {

    @XmlAttribute(name = "nullFlavor")
    protected NullFlavorPrimitive nullFlavor;

    /**
     * 获取nullFlavor属性的值。
     * 
     * @return
     *     possible object is
     *     {@link NullFlavorPrimitive }
     *     
     */
    public NullFlavorPrimitive getNullFlavor() {
        return nullFlavor;
    }

    /**
     * 设置nullFlavor属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link NullFlavorPrimitive }
     *     
     */
    public void setNullFlavor(NullFlavorPrimitive value) {
        this.nullFlavor = value;
    }

}
