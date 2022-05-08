
package com.wisdom.area.webservice.wsdl;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 医护人员类型
 * 
 * <p>Practitioner complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="Practitioner"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.chiss.org.cn/rhin/2015}RegObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="identifier" type="{http://www.chiss.org.cn/rhin/2015}Identifier" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="duty" type="{http://www.chiss.org.cn/rhin/2015}Coding" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="professionalTitle" type="{http://www.chiss.org.cn/rhin/2015}Coding" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="address" type="{http://www.chiss.org.cn/rhin/2015}AddressType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="telecom" type="{http://www.chiss.org.cn/rhin/2015}Telecom" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="assignedPerson" type="{http://www.chiss.org.cn/rhin/2015}Person"/&gt;
 *         &lt;element name="practiceOrganization" type="{http://www.chiss.org.cn/rhin/2015}Organization" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Practitioner", propOrder = {
    "identifier",
    "duty",
    "professionalTitle",
    "address",
    "telecom",
    "assignedPerson",
    "practiceOrganization"
})
public class Practitioner
    extends RegObject
{

    protected List<Identifier> identifier;
    protected List<Coding> duty;
    protected List<Coding> professionalTitle;
    protected List<AddressType> address;
    protected List<Telecom> telecom;
    @XmlElement(required = true)
    protected Person assignedPerson;
    protected Organization practiceOrganization;

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

    /**
     * Gets the value of the address property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the address property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddress().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AddressType }
     * 
     * 
     */
    public List<AddressType> getAddress() {
        if (address == null) {
            address = new ArrayList<AddressType>();
        }
        return this.address;
    }

    /**
     * Gets the value of the telecom property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the telecom property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTelecom().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Telecom }
     * 
     * 
     */
    public List<Telecom> getTelecom() {
        if (telecom == null) {
            telecom = new ArrayList<Telecom>();
        }
        return this.telecom;
    }

    /**
     * 获取assignedPerson属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Person }
     *     
     */
    public Person getAssignedPerson() {
        return assignedPerson;
    }

    /**
     * 设置assignedPerson属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Person }
     *     
     */
    public void setAssignedPerson(Person value) {
        this.assignedPerson = value;
    }

    /**
     * 获取practiceOrganization属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Organization }
     *     
     */
    public Organization getPracticeOrganization() {
        return practiceOrganization;
    }

    /**
     * 设置practiceOrganization属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Organization }
     *     
     */
    public void setPracticeOrganization(Organization value) {
        this.practiceOrganization = value;
    }

}
