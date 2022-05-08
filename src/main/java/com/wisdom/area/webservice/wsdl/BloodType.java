
package com.wisdom.area.webservice.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>BloodType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="BloodType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RH" type="{http://www.chiss.org.cn/rhin/2015}Boolean"/&gt;
 *         &lt;element name="ABO" type="{http://www.chiss.org.cn/rhin/2015}CodeableConcept"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BloodType", propOrder = {
    "rh",
    "abo"
})
public class BloodType {

    @XmlElement(name = "RH", required = true)
    protected Boolean rh;
    @XmlElement(name = "ABO", required = true)
    protected CodeableConcept abo;

    /**
     * 获取rh属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getRH() {
        return rh;
    }

    /**
     * 设置rh属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRH(Boolean value) {
        this.rh = value;
    }

    /**
     * 获取abo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CodeableConcept }
     *     
     */
    public CodeableConcept getABO() {
        return abo;
    }

    /**
     * 设置abo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CodeableConcept }
     *     
     */
    public void setABO(CodeableConcept value) {
        this.abo = value;
    }

}
