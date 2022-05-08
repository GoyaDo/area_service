
package com.wisdom.area.webservice.wsdl;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>durationUnitPrimitive的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <pre>
 * &lt;simpleType name="durationUnitPrimitive"&gt;
 *   &lt;restriction base="{http://www.chiss.org.cn/rhin/2015}stringPrimitive"&gt;
 *     &lt;enumeration value="yr"/&gt;
 *     &lt;enumeration value="mth"/&gt;
 *     &lt;enumeration value="wk"/&gt;
 *     &lt;enumeration value="d"/&gt;
 *     &lt;enumeration value="h"/&gt;
 *     &lt;enumeration value="min"/&gt;
 *     &lt;enumeration value="s"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "durationUnitPrimitive")
@XmlEnum
public enum DurationUnitPrimitive {

    @XmlEnumValue("yr")
    YR("yr"),
    @XmlEnumValue("mth")
    MTH("mth"),
    @XmlEnumValue("wk")
    WK("wk"),
    @XmlEnumValue("d")
    D("d"),
    @XmlEnumValue("h")
    H("h"),
    @XmlEnumValue("min")
    MIN("min"),
    @XmlEnumValue("s")
    S("s");
    private final java.lang.String value;

    DurationUnitPrimitive(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static DurationUnitPrimitive fromValue(java.lang.String v) {
        for (DurationUnitPrimitive c: DurationUnitPrimitive.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
