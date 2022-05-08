
package com.wisdom.area.webservice.wsdl;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>FamilyHistoryType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="FamilyHistoryType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="relatives" maxOccurs="unbounded"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="relativeType" type="{http://www.chiss.org.cn/rhin/2015}Coding"/&gt;
 *                   &lt;element name="diseaseHistory" type="{http://www.chiss.org.cn/rhin/2015}HealthHistoryType"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FamilyHistoryType", propOrder = {
    "relatives"
})
public class FamilyHistoryType {

    @XmlElement(required = true)
    protected List<Relatives> relatives;

    /**
     * Gets the value of the relatives property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the relatives property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRelatives().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Relatives }
     * 
     * 
     */
    public List<Relatives> getRelatives() {
        if (relatives == null) {
            relatives = new ArrayList<Relatives>();
        }
        return this.relatives;
    }


    /**
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="relativeType" type="{http://www.chiss.org.cn/rhin/2015}Coding"/&gt;
     *         &lt;element name="diseaseHistory" type="{http://www.chiss.org.cn/rhin/2015}HealthHistoryType"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "relativeType",
        "diseaseHistory"
    })
    public static class Relatives {

        @XmlElement(required = true)
        protected Coding relativeType;
        @XmlElement(required = true)
        protected HealthHistoryType diseaseHistory;

        /**
         * 获取relativeType属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Coding }
         *     
         */
        public Coding getRelativeType() {
            return relativeType;
        }

        /**
         * 设置relativeType属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Coding }
         *     
         */
        public void setRelativeType(Coding value) {
            this.relativeType = value;
        }

        /**
         * 获取diseaseHistory属性的值。
         * 
         * @return
         *     possible object is
         *     {@link HealthHistoryType }
         *     
         */
        public HealthHistoryType getDiseaseHistory() {
            return diseaseHistory;
        }

        /**
         * 设置diseaseHistory属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link HealthHistoryType }
         *     
         */
        public void setDiseaseHistory(HealthHistoryType value) {
            this.diseaseHistory = value;
        }

    }

}
