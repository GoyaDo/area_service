
package com.wisdom.area.webservice.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 插槽类型，用于查询、过滤器、主题等插入条件。
 * 
 * <p>Slot complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="Slot"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="name" type="{http://www.chiss.org.cn/rhin/2015}String"/&gt;
 *         &lt;element name="valueList" type="{http://www.chiss.org.cn/rhin/2015}ValueList"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Slot", propOrder = {
    "name",
    "valueList"
})
public class Slot {

    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    protected ValueList valueList;

    /**
     * 获取name属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * 设置name属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * 获取valueList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ValueList }
     *     
     */
    public ValueList getValueList() {
        return valueList;
    }

    /**
     * 设置valueList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ValueList }
     *     
     */
    public void setValueList(ValueList value) {
        this.valueList = value;
    }

}
