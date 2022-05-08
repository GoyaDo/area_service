
package com.wisdom.area.webservice.wsdl;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Patient complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="Patient"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.chiss.org.cn/rhin/2015}RegObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="identifier" type="{http://www.chiss.org.cn/rhin/2015}Identifier" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="address" type="{http://www.chiss.org.cn/rhin/2015}Address" minOccurs="0"/&gt;
 *         &lt;element name="telecom" type="{http://www.chiss.org.cn/rhin/2015}Telecom" minOccurs="0"/&gt;
 *         &lt;element name="effectiveTime" type="{http://www.chiss.org.cn/rhin/2015}DateTime" minOccurs="0"/&gt;
 *         &lt;element name="assignedPerson" type="{http://www.chiss.org.cn/rhin/2015}Person" minOccurs="0"/&gt;
 *         &lt;element name="assignedOrganization" type="{http://www.chiss.org.cn/rhin/2015}Organization" minOccurs="0"/&gt;
 *         &lt;element name="contact" type="{http://www.chiss.org.cn/rhin/2015}Contact" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="guardian" type="{http://www.chiss.org.cn/rhin/2015}Guardian" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Patient", propOrder = {
    "identifier",
    "address",
    "telecom",
    "effectiveTime",
    "assignedPerson",
    "assignedOrganization",
    "contact",
    "guardian"
})
public class Patient
    extends RegObject
{

    protected List<Identifier> identifier;
    protected Address address;
    protected Telecom telecom;
    protected DateTime effectiveTime;
    protected Person assignedPerson;
    protected Organization assignedOrganization;
    protected List<Contact> contact;
    protected List<Guardian> guardian;

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
     * 获取address属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getAddress() {
        return address;
    }

    /**
     * 设置address属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setAddress(Address value) {
        this.address = value;
    }

    /**
     * 获取telecom属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Telecom }
     *     
     */
    public Telecom getTelecom() {
        return telecom;
    }

    /**
     * 设置telecom属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Telecom }
     *     
     */
    public void setTelecom(Telecom value) {
        this.telecom = value;
    }

    /**
     * 获取effectiveTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link DateTime }
     *     
     */
    public DateTime getEffectiveTime() {
        return effectiveTime;
    }

    /**
     * 设置effectiveTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link DateTime }
     *     
     */
    public void setEffectiveTime(DateTime value) {
        this.effectiveTime = value;
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
     * 获取assignedOrganization属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Organization }
     *     
     */
    public Organization getAssignedOrganization() {
        return assignedOrganization;
    }

    /**
     * 设置assignedOrganization属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Organization }
     *     
     */
    public void setAssignedOrganization(Organization value) {
        this.assignedOrganization = value;
    }

    /**
     * Gets the value of the contact property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contact property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContact().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Contact }
     * 
     * 
     */
    public List<Contact> getContact() {
        if (contact == null) {
            contact = new ArrayList<Contact>();
        }
        return this.contact;
    }

    /**
     * Gets the value of the guardian property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the guardian property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGuardian().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Guardian }
     * 
     * 
     */
    public List<Guardian> getGuardian() {
        if (guardian == null) {
            guardian = new ArrayList<Guardian>();
        }
        return this.guardian;
    }

}
