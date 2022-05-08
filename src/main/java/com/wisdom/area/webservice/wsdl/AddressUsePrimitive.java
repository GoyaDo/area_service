
package com.wisdom.area.webservice.wsdl;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>addressUsePrimitive的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <pre>
 * &lt;simpleType name="addressUsePrimitive"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Home"/&gt;
 *     &lt;enumeration value="Work"/&gt;
 *     &lt;enumeration value="Temp"/&gt;
 *     &lt;enumeration value="Old"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "addressUsePrimitive")
@XmlEnum
public enum AddressUsePrimitive {


    /**
     * 家庭地址
     * 
     */
    @XmlEnumValue("Home")
    HOME("Home"),

    /**
     * 工作地址
     * 
     */
    @XmlEnumValue("Work")
    WORK("Work"),

    /**
     * 临时地址
     * 
     */
    @XmlEnumValue("Temp")
    TEMP("Temp"),

    /**
     * 旧地址
     * 
     */
    @XmlEnumValue("Old")
    OLD("Old");
    private final java.lang.String value;

    AddressUsePrimitive(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static AddressUsePrimitive fromValue(java.lang.String v) {
        for (AddressUsePrimitive c: AddressUsePrimitive.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
