
package com.wisdom.area.webservice.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 引用
 * 
 * <p>Reference complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="Reference"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.chiss.org.cn/rhin/2015}Any"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="reference" type="{http://www.chiss.org.cn/rhin/2015}Identifier" minOccurs="0"/&gt;
 *         &lt;element name="display" type="{http://www.chiss.org.cn/rhin/2015}String" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Reference", propOrder = {
    "reference",
    "display"
})
public class Reference
    extends Any
{

    protected Identifier reference;
    protected String display;

    /**
     * 获取reference属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Identifier }
     *     
     */
    public Identifier getReference() {
        return reference;
    }

    /**
     * 设置reference属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Identifier }
     *     
     */
    public void setReference(Identifier value) {
        this.reference = value;
    }

    /**
     * 获取display属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplay() {
        return display;
    }

    /**
     * 设置display属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplay(String value) {
        this.display = value;
    }

}
