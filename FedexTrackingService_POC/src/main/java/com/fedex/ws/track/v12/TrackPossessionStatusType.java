//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.02.25 at 08:30:31 PM EST 
//


package com.fedex.ws.track.v12;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TrackPossessionStatusType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TrackPossessionStatusType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="BROKER"/>
 *     &lt;enumeration value="CARRIER"/>
 *     &lt;enumeration value="CUSTOMS"/>
 *     &lt;enumeration value="RECIPIENT"/>
 *     &lt;enumeration value="SHIPPER"/>
 *     &lt;enumeration value="SPLIT_STATUS"/>
 *     &lt;enumeration value="TRANSFER_PARTNER"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TrackPossessionStatusType")
@XmlEnum
public enum TrackPossessionStatusType {

    BROKER,
    CARRIER,
    CUSTOMS,
    RECIPIENT,
    SHIPPER,
    SPLIT_STATUS,
    TRANSFER_PARTNER;

    public String value() {
        return name();
    }

    public static TrackPossessionStatusType fromValue(String v) {
        return valueOf(v);
    }

}
