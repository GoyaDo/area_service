
package com.wisdom.area.webservice.wsdl;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>nameUsePrimitive的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <pre>
 * &lt;simpleType name="nameUsePrimitive"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Usual"/&gt;
 *     &lt;enumeration value="Official"/&gt;
 *     &lt;enumeration value="Temp"/&gt;
 *     &lt;enumeration value="Nickname"/&gt;
 *     &lt;enumeration value="Anonymous"/&gt;
 *     &lt;enumeration value="Old"/&gt;
 *     &lt;enumeration value="Maiden"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "nameUsePrimitive")
@XmlEnum
public enum NameUsePrimitive {


    /**
     * 常用名
     * 
     */
    @XmlEnumValue("Usual")
    USUAL("Usual"),

    /**
     * 正式名字
     * 
     */
    @XmlEnumValue("Official")
    OFFICIAL("Official"),

    /**
     * 临时名字
     * 
     */
    @XmlEnumValue("Temp")
    TEMP("Temp"),

    /**
     * 昵称、网名、号
     * 
     */
    @XmlEnumValue("Nickname")
    NICKNAME("Nickname"),

    /**
     * 别名(字)
     * 
     */
    @XmlEnumValue("Anonymous")
    ANONYMOUS("Anonymous"),

    /**
     * 曾用名
     * 
     */
    @XmlEnumValue("Old")
    OLD("Old"),

    /**
     * 婚前名
     * 
     */
    @XmlEnumValue("Maiden")
    MAIDEN("Maiden");
    private final java.lang.String value;

    NameUsePrimitive(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static NameUsePrimitive fromValue(java.lang.String v) {
        for (NameUsePrimitive c: NameUsePrimitive.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
