
package com.wisdom.area.webservice.wsdl;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 医护人员查询参数
 * 
 * <p>PractitionerBrief complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="PractitionerBrief"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="identifier" type="{http://www.chiss.org.cn/rhin/2015}Identifier" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="name" type="{http://www.chiss.org.cn/rhin/2015}HumanName" minOccurs="0"/&gt;
 *         &lt;element name="organization" type="{http://www.chiss.org.cn/rhin/2015}OrganizationBrief" minOccurs="0"/&gt;
 *         &lt;element name="duty" type="{http://www.chiss.org.cn/rhin/2015}Coding" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="professionalTitle" type="{http://www.chiss.org.cn/rhin/2015}Coding" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PractitionerBrief", propOrder = {
    "identifier",
    "name",
    "organization",
    "duty",
    "professionalTitle"
})
public class PractitionerBrief {

    protected List<Identifier> identifier;
    protected HumanName name;
    protected OrganizationBrief organization;
    protected List<Coding> duty;
    protected List<Coding> professionalTitle;

    /**
     * Gets the value of the identifier property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the identifier property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIdentifier().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Identifier }
     * 
     * 
     */
    public List<Identifier> getIdentifier() {
        if (identifier == null) {
            identifier = new ArrayList<Identifier>();
        }
        return this.identifier;
    }

    /**
     * 获取name属性的值。
     * 
     * @return
     *     possible object is
     *     {@link HumanName }
     *     
     */
    public HumanName getName() {
        return name;
    }

    /**
     * 设置name属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link HumanName }
     *     
     */
    public void setName(HumanName value) {
        this.name = value;
    }

    /**
     * 获取organization属性的值。
     * 
     * @return
     *     possible object is
     *     {@link OrganizationBrief }
     *     
     */
    public OrganizationBrief getOrganization() {
        return organization;
    }

    /**
     * 设置organization属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link OrganizationBrief }
     *     
     */
    public void setOrganization(OrganizationBrief value) {
        this.organization = value;
    }

    /**
     * Gets the value of the duty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the duty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDuty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Coding }
     * 
     * 
     */
    public List<Coding> getDuty() {
        if (duty == null) {
            duty = new ArrayList<Coding>();
        }
        return this.duty;
    }

    /**
     * Gets the value of the professionalTitle property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the professionalTitle property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProfessionalTitle().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Coding }
     * 
     * 
     */
    public List<Coding> getProfessionalTitle() {
        if (professionalTitle == null) {
            professionalTitle = new ArrayList<Coding>();
        }
        return this.professionalTitle;
    }

}
