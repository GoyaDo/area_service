
package com.wisdom.area.webservice.wsdl;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>addressTypePrimitive的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <pre>
 * &lt;simpleType name="addressTypePrimitive"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Postal"/&gt;
 *     &lt;enumeration value="Physical"/&gt;
 *     &lt;enumeration value="Both"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "addressTypePrimitive")
@XmlEnum
public enum AddressTypePrimitive {


    /**
     * 投递地址
     * 
     */
    @XmlEnumValue("Postal")
    POSTAL("Postal"),

    /**
     * 地理位置.
     * 
     */
    @XmlEnumValue("Physical")
    PHYSICAL("Physical"),

    /**
     * 投递地址与地理位置通用.
     * 
     */
    @XmlEnumValue("Both")
    BOTH("Both");
    private final java.lang.String value;

    AddressTypePrimitive(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static AddressTypePrimitive fromValue(java.lang.String v) {
        for (AddressTypePrimitive c: AddressTypePrimitive.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
