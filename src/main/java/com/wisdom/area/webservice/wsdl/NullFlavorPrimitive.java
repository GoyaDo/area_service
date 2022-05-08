
package com.wisdom.area.webservice.wsdl;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>nullFlavorPrimitive的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <pre>
 * &lt;simpleType name="nullFlavorPrimitive"&gt;
 *   &lt;restriction base="{http://www.chiss.org.cn/rhin/2015}stringPrimitive"&gt;
 *     &lt;enumeration value="UNK"/&gt;
 *     &lt;enumeration value="NAV"/&gt;
 *     &lt;enumeration value="NASK"/&gt;
 *     &lt;enumeration value="ASKU"/&gt;
 *     &lt;enumeration value="NP"/&gt;
 *     &lt;enumeration value="NA"/&gt;
 *     &lt;enumeration value="NI"/&gt;
 *     &lt;enumeration value="MSK"/&gt;
 *     &lt;enumeration value="OTH"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "nullFlavorPrimitive")
@XmlEnum
public enum NullFlavorPrimitive {

    UNK,
    NAV,
    NASK,
    ASKU,
    NP,
    NA,
    NI,
    MSK,
    OTH;

    public java.lang.String value() {
        return name();
    }

    public static NullFlavorPrimitive fromValue(java.lang.String v) {
        return valueOf(v);
    }

}
