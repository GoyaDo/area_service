
package com.wisdom.area.webservice.wsdl;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>telecomModePrimitive的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <pre>
 * &lt;simpleType name="telecomModePrimitive"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Telephone"/&gt;
 *     &lt;enumeration value="Cellphone"/&gt;
 *     &lt;enumeration value="Email"/&gt;
 *     &lt;enumeration value="QQ"/&gt;
 *     &lt;enumeration value="Wechat"/&gt;
 *     &lt;enumeration value="Other"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "telecomModePrimitive")
@XmlEnum
public enum TelecomModePrimitive {


    /**
     * 投递地址
     * 
     */
    @XmlEnumValue("Telephone")
    TELEPHONE("Telephone"),

    /**
     * 地理位置.
     * 
     */
    @XmlEnumValue("Cellphone")
    CELLPHONE("Cellphone"),

    /**
     * 投递地址与地理位置通用.
     * 
     */
    @XmlEnumValue("Email")
    EMAIL("Email"),
    QQ("QQ"),
    @XmlEnumValue("Wechat")
    WECHAT("Wechat"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final java.lang.String value;

    TelecomModePrimitive(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static TelecomModePrimitive fromValue(java.lang.String v) {
        for (TelecomModePrimitive c: TelecomModePrimitive.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
