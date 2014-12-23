//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.08.09 at 06:44:50 PM IST 
//


package com.pacificmetrics.ims.apip.afadrd;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *                 The Access_Mode_Statement complexType is the container for a collection of information that states a primary access mode of a resource
 * and its usage in the resource.
 *             
 * 
 * <p>Java class for Access_Mode_Statement.Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Access_Mode_Statement.Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="originalAccessMode">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="auditory"/>
 *               &lt;enumeration value="tactile"/>
 *               &lt;enumeration value="textual"/>
 *               &lt;enumeration value="visual"/>
 *               &lt;enumeration value="olfactory"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="accessModeUsage" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="informative"/>
 *               &lt;enumeration value="ornamental"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;group ref="{http://www.imsglobal.org/xsd/apip/apipv1p0/imsafa_drdv2p0}grpStrict.any"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Access_Mode_Statement.Type", propOrder = {
    "originalAccessMode",
    "accessModeUsage",
    "anies"
})
public class AccessModeStatementType {

    @XmlElement(required = true)
    protected String originalAccessMode;
    @XmlElement(defaultValue = "informative")
    protected String accessModeUsage;
    @XmlAnyElement(lax = true)
    protected List<Object> anies;

    /**
     * Gets the value of the originalAccessMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginalAccessMode() {
        return originalAccessMode;
    }

    /**
     * Sets the value of the originalAccessMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginalAccessMode(String value) {
        this.originalAccessMode = value;
    }

    /**
     * Gets the value of the accessModeUsage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccessModeUsage() {
        return accessModeUsage;
    }

    /**
     * Sets the value of the accessModeUsage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccessModeUsage(String value) {
        this.accessModeUsage = value;
    }

    /**
     * Gets the value of the anies property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the anies property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAnies().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getAnies() {
        if (anies == null) {
            anies = new ArrayList<Object>();
        }
        return this.anies;
    }

}
