//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.01.06 at 01:14:11 PM MST 
//


package com.pacificmetrics.apip.cp.manifest;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ccssType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ccssType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="meta" type="{http://pacificmetrics.com/apip/cp/manifest}metaType"/>
 *       &lt;/sequence>
 *       &lt;attribute name="resourceLabel" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="resourcePartId" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ccssType", propOrder = {
    "meta"
})
public class CcssType {

    @XmlElement(required = true)
    protected MetaType meta;
    @XmlAttribute(name = "resourceLabel")
    protected String resourceLabel;
    @XmlAttribute(name = "resourcePartId")
    protected String resourcePartId;

    /**
     * Gets the value of the meta property.
     * 
     * @return
     *     possible object is
     *     {@link MetaType }
     *     
     */
    public MetaType getMeta() {
        return meta;
    }

    /**
     * Sets the value of the meta property.
     * 
     * @param value
     *     allowed object is
     *     {@link MetaType }
     *     
     */
    public void setMeta(MetaType value) {
        this.meta = value;
    }

    /**
     * Gets the value of the resourceLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResourceLabel() {
        return resourceLabel;
    }

    /**
     * Sets the value of the resourceLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResourceLabel(String value) {
        this.resourceLabel = value;
    }

    /**
     * Gets the value of the resourcePartId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResourcePartId() {
        return resourcePartId;
    }

    /**
     * Sets the value of the resourcePartId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResourcePartId(String value) {
        this.resourcePartId = value;
    }

}