
package com.wisdom.area.webservice.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * 地址的用途
 * 
 * <p>AddressUse complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="AddressUse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.chiss.org.cn/rhin/2015}Any"&gt;
 *       &lt;attribute name="value" type="{http://www.chiss.org.cn/rhin/2015}addressUsePrimitive" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddressUse")
public class AddressUse
    extends Any
{

    @XmlAttribute(name = "value")
    protected AddressUsePrimitive value;

    /**
     * 获取value属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AddressUsePrimitive }
     *     
     */
    public AddressUsePrimitive getValue() {
        return value;
    }

    /**
     * 设置value属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AddressUsePrimitive }
     *     
     */
    public void setValue(AddressUsePrimitive value) {
        this.value = value;
    }

}
