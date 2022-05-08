
package com.wisdom.area.webservice.wsdl;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>objectStatusPrimitive的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <pre>
 * &lt;simpleType name="objectStatusPrimitive"&gt;
 *   &lt;restriction base="{http://www.chiss.org.cn/rhin/2015}stringPrimitive"&gt;
 *     &lt;enumeration value="New"/&gt;
 *     &lt;enumeration value="Active"/&gt;
 *     &lt;enumeration value="Nullified"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "objectStatusPrimitive")
@XmlEnum
public enum ObjectStatusPrimitive {

    @XmlEnumValue("New")
    NEW("New"),
    @XmlEnumValue("Active")
    ACTIVE("Active"),
    @XmlEnumValue("Nullified")
    NULLIFIED("Nullified");
    private final java.lang.String value;

    ObjectStatusPrimitive(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static ObjectStatusPrimitive fromValue(java.lang.String v) {
        for (ObjectStatusPrimitive c: ObjectStatusPrimitive.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
