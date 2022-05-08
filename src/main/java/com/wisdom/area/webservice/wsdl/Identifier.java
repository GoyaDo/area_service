
package com.wisdom.area.webservice.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 标识域ID
 * 
 * <p>Identifier complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="Identifier"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.chiss.org.cn/rhin/2015}Any"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="system" type="{http://www.chiss.org.cn/rhin/2015}URI" minOccurs="0"/&gt;
 *         &lt;element name="value" type="{http://www.chiss.org.cn/rhin/2015}ID" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Identifier", propOrder = {
    "system",
    "value"
})
public class Identifier
    extends Any
{

    protected URI system;
    protected ID value;

    /**
     * 获取system属性的值。
     * 
     * @return
     *     possible object is
     *     {@link URI }
     *     
     */
    public URI getSystem() {
        return system;
    }

    /**
     * 设置system属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link URI }
     *     
     */
    public void setSystem(URI value) {
        this.system = value;
    }

    /**
     * 获取value属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ID }
     *     
     */
    public ID getValue() {
        return value;
    }

    /**
     * 设置value属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ID }
     *     
     */
    public void setValue(ID value) {
        this.value = value;
    }

}
