//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.01.20 at 02:28:00 PM EST 
//


package com.fedex.ws.track.v12;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TrackChargesPaymentClassificationType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TrackChargesPaymentClassificationType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="DUTIES_AND_TAXES"/>
 *     &lt;enumeration value="TRANSPORTATION"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TrackChargesPaymentClassificationType")
@XmlEnum
public enum TrackChargesPaymentClassificationType {

    DUTIES_AND_TAXES,
    TRANSPORTATION;

    public String value() {
        return name();
    }

    public static TrackChargesPaymentClassificationType fromValue(String v) {
        return valueOf(v);
    }

}
