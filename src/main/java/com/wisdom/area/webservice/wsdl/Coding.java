
package com.wisdom.area.webservice.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 编码概念
 * 
 * <p>Coding complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="Coding"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.chiss.org.cn/rhin/2015}Any"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="code" type="{http://www.chiss.org.cn/rhin/2015}Code" minOccurs="0"/&gt;
 *         &lt;element name="display" type="{http://www.chiss.org.cn/rhin/2015}String" minOccurs="0"/&gt;
 *         &lt;element name="system" type="{http://www.chiss.org.cn/rhin/2015}URI" minOccurs="0"/&gt;
 *         &lt;element name="systemName" type="{http://www.chiss.org.cn/rhin/2015}String" minOccurs="0"/&gt;
 *         &lt;element name="version" type="{http://www.chiss.org.cn/rhin/2015}String" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Coding", propOrder = {
    "code",
    "display",
    "system",
    "systemName",
    "version"
})
public class Coding
    extends Any
{

    protected Code code;
    protected String display;
    protected URI system;
    protected String systemName;
    protected String version;

    /**
     * 获取code属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Code }
     *     
     */
    public Code getCode() {
        return code;
    }

    /**
     * 设置code属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Code }
     *     
     */
    public void setCode(Code value) {
        this.code = value;
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
     * 获取systemName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSystemName() {
        return systemName;
    }

    /**
     * 设置systemName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSystemName(String value) {
        this.systemName = value;
    }

    /**
     * 获取version属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * 设置version属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

}
