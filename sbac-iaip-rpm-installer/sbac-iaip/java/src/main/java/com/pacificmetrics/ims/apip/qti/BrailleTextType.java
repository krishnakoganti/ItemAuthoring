//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.08.09 at 09:22:32 PM IST 
//


package com.pacificmetrics.ims.apip.qti;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *                 The BrailleText complexType is the container for the text string that is to be passed to a Braile reader.
 *             
 * 
 * <p>Java class for BrailleText.Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BrailleText.Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="brailleTextString" type="{http://www.imsglobal.org/xsd/apip/apipv1p0/imsapip_qtiv1p0}LabelledString.Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BrailleText.Type", propOrder = {
    "brailleTextString"
})
@XmlRootElement(name = "brailleText")
public class BrailleTextType {

    @XmlElement(required = true)
    protected LabelledStringType brailleTextString;

    /**
     * Gets the value of the brailleTextString property.
     * 
     * @return
     *     possible object is
     *     {@link LabelledStringType }
     *     
     */
    public LabelledStringType getBrailleTextString() {
        return brailleTextString;
    }

    /**
     * Sets the value of the brailleTextString property.
     * 
     * @param value
     *     allowed object is
     *     {@link LabelledStringType }
     *     
     */
    public void setBrailleTextString(LabelledStringType value) {
        this.brailleTextString = value;
    }

}
