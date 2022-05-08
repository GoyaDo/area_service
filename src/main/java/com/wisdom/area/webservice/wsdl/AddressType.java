
package com.wisdom.area.webservice.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * 地址类别.
 * 
 * <p>AddressType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="AddressType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.chiss.org.cn/rhin/2015}Any"&gt;
 *       &lt;attribute name="value" type="{http://www.chiss.org.cn/rhin/2015}addressTypePrimitive" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddressType")
public class AddressType
    extends Any
{

    @XmlAttribute(name = "value")
    protected AddressTypePrimitive value;

    /**
     * 获取value属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AddressTypePrimitive }
     *     
     */
    public AddressTypePrimitive getValue() {
        return value;
    }

    /**
     * 设置value属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AddressTypePrimitive }
     *     
     */
    public void setValue(AddressTypePrimitive value) {
        this.value = value;
    }

}
