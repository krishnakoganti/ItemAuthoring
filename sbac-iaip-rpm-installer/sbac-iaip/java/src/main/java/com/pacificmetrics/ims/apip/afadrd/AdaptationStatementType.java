//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.08.09 at 06:44:50 PM IST 
//


package com.pacificmetrics.ims.apip.afadrd;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 *                 The Adaptation_Statement complexType is the container for a collection of information that gives detailed
 * information about an adaptation.
 *             
 * 
 * <p>Java class for Adaptation_Statement.Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Adaptation_Statement.Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="adaptationType" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="audio representation"/>
 *               &lt;enumeration value="tactile representation"/>
 *               &lt;enumeration value="text representation"/>
 *               &lt;enumeration value="visual representation"/>
 *               &lt;enumeration value="audio description"/>
 *               &lt;enumeration value="caption"/>
 *               &lt;enumeration value="ebook"/>
 *               &lt;enumeration value="sign language"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
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
 *         &lt;element name="extent" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="all"/>
 *               &lt;enumeration value="part"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="representationForm" maxOccurs="unbounded" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="enhanced"/>
 *               &lt;enumeration value="verbatim"/>
 *               &lt;enumeration value="reduced"/>
 *               &lt;enumeration value="real-time"/>
 *               &lt;enumeration value="transcript"/>
 *               &lt;enumeration value="alternative text"/>
 *               &lt;enumeration value="long description"/>
 *               &lt;enumeration value="talking book"/>
 *               &lt;enumeration value="Daisy"/>
 *               &lt;enumeration value="image based"/>
 *               &lt;enumeration value="symbolic"/>
 *               &lt;enumeration value="recorded"/>
 *               &lt;enumeration value="synthesized"/>
 *               &lt;enumeration value="Braille"/>
 *               &lt;enumeration value="haptic"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="language" type="{http://www.w3.org/2001/XMLSchema}normalizedString" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="readingRate" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="educationLevel" type="{http://www.w3.org/2001/XMLSchema}normalizedString" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "Adaptation_Statement.Type", propOrder = {
    "adaptationType",
    "originalAccessMode",
    "extent",
    "representationForms",
    "languages",
    "readingRate",
    "educationLevels",
    "anies"
})
public class AdaptationStatementType {

    protected String adaptationType;
    @XmlElement(required = true)
    protected String originalAccessMode;
    @XmlElement(defaultValue = "all")
    protected String extent;
    @XmlElement(name = "representationForm")
    protected List<String> representationForms;
    @XmlElement(name = "language")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected List<String> languages;
    protected BigInteger readingRate;
    @XmlElement(name = "educationLevel")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected List<String> educationLevels;
    @XmlAnyElement(lax = true)
    protected List<Object> anies;

    /**
     * Gets the value of the adaptationType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdaptationType() {
        return adaptationType;
    }

    /**
     * Sets the value of the adaptationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdaptationType(String value) {
        this.adaptationType = value;
    }

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
     * Gets the value of the extent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtent() {
        return extent;
    }

    /**
     * Sets the value of the extent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtent(String value) {
        this.extent = value;
    }

    /**
     * Gets the value of the representationForms property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the representationForms property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRepresentationForms().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getRepresentationForms() {
        if (representationForms == null) {
            representationForms = new ArrayList<String>();
        }
        return this.representationForms;
    }

    /**
     * Gets the value of the languages property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the languages property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLanguages().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getLanguages() {
        if (languages == null) {
            languages = new ArrayList<String>();
        }
        return this.languages;
    }

    /**
     * Gets the value of the readingRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getReadingRate() {
        return readingRate;
    }

    /**
     * Sets the value of the readingRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setReadingRate(BigInteger value) {
        this.readingRate = value;
    }

    /**
     * Gets the value of the educationLevels property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the educationLevels property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEducationLevels().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getEducationLevels() {
        if (educationLevels == null) {
            educationLevels = new ArrayList<String>();
        }
        return this.educationLevels;
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
