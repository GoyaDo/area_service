
package com.wisdom.area.webservice.wsdl;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 预存查询类型
 * 
 * <p>AdhocQuery complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="AdhocQuery"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id" type="{http://www.chiss.org.cn/rhin/2015}URN"/&gt;
 *         &lt;element name="slot" type="{http://www.chiss.org.cn/rhin/2015}Slot" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdhocQuery", propOrder = {
    "id",
    "slot"
})
public class AdhocQuery {

    @XmlElement(required = true)
    protected URN id;
    @XmlElement(required = true)
    protected List<Slot> slot;

    /**
     * 获取id属性的值。
     * 
     * @return
     *     possible object is
     *     {@link URN }
     *     
     */
    public URN getId() {
        return id;
    }

    /**
     * 设置id属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link URN }
     *     
     */
    public void setId(URN value) {
        this.id = value;
    }

    /**
     * Gets the value of the slot property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the slot property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSlot().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Slot }
     * 
     * 
     */
    public List<Slot> getSlot() {
        if (slot == null) {
            slot = new ArrayList<Slot>();
        }
        return this.slot;
    }

}
