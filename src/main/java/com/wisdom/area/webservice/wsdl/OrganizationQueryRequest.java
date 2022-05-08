
package com.wisdom.area.webservice.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * IST-MIR2:医疗机构信息查询条件数据类型
 *             
 * 
 * <p>OrganizationQueryRequest complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="OrganizationQueryRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="from" type="{http://www.chiss.org.cn/rhin/2015}Integer" minOccurs="0"/&gt;
 *         &lt;element name="maxCount" type="{http://www.chiss.org.cn/rhin/2015}Integer" minOccurs="0"/&gt;
 *         &lt;element name="adhocQuery" type="{http://www.chiss.org.cn/rhin/2015}AdhocQuery"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrganizationQueryRequest", propOrder = {
    "from",
    "maxCount",
    "adhocQuery"
})
public class OrganizationQueryRequest {

    protected Integer from;
    protected Integer maxCount;
    @XmlElement(required = true)
    protected AdhocQuery adhocQuery;

    /**
     * 获取from属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFrom() {
        return from;
    }

    /**
     * 设置from属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFrom(Integer value) {
        this.from = value;
    }

    /**
     * 获取maxCount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxCount() {
        return maxCount;
    }

    /**
     * 设置maxCount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxCount(Integer value) {
        this.maxCount = value;
    }

    /**
     * 获取adhocQuery属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AdhocQuery }
     *     
     */
    public AdhocQuery getAdhocQuery() {
        return adhocQuery;
    }

    /**
     * 设置adhocQuery属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AdhocQuery }
     *     
     */
    public void setAdhocQuery(AdhocQuery value) {
        this.adhocQuery = value;
    }

}
