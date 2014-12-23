//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.01.06 at 01:14:11 PM MST 
//


package com.pacificmetrics.apip.cp.manifest;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for generalType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="generalType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="identifier" type="{http://pacificmetrics.com/apip/cp/manifest}identifierType"/>
 *         &lt;element name="title" type="{http://pacificmetrics.com/apip/cp/manifest}titleType"/>
 *         &lt;element name="language" type="{http://pacificmetrics.com/apip/cp/manifest}languageType" maxOccurs="unbounded"/>
 *         &lt;element name="description" type="{http://pacificmetrics.com/apip/cp/manifest}descriptionType" maxOccurs="unbounded"/>
 *         &lt;element name="keyword" type="{http://pacificmetrics.com/apip/cp/manifest}keywordType" maxOccurs="unbounded"/>
 *         &lt;element name="coverage" type="{http://pacificmetrics.com/apip/cp/manifest}coverageType" maxOccurs="unbounded"/>
 *         &lt;element name="structure" type="{http://pacificmetrics.com/apip/cp/manifest}structureType"/>
 *         &lt;element name="aggregationLevel" type="{http://pacificmetrics.com/apip/cp/manifest}aggregationLevelType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "generalType", propOrder = {
    "identifier",
    "title",
    "languages",
    "descriptions",
    "keywords",
    "coverages",
    "structure",
    "aggregationLevel"
})
public class GeneralType {

    @XmlElement(required = true)
    protected IdentifierType identifier;
    @XmlElement(required = true)
    protected TitleType title;
    @XmlElement(name = "language", required = true)
    protected List<LanguageType> languages;
    @XmlElement(name = "description", required = true)
    protected List<DescriptionType> descriptions;
    @XmlElement(name = "keyword", required = true)
    protected List<KeywordType> keywords;
    @XmlElement(name = "coverage", required = true)
    protected List<CoverageType> coverages;
    @XmlElement(required = true)
    protected StructureType structure;
    @XmlElement(required = true)
    protected AggregationLevelType aggregationLevel;

    /**
     * Gets the value of the identifier property.
     * 
     * @return
     *     possible object is
     *     {@link IdentifierType }
     *     
     */
    public IdentifierType getIdentifier() {
        return identifier;
    }

    /**
     * Sets the value of the identifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentifierType }
     *     
     */
    public void setIdentifier(IdentifierType value) {
        this.identifier = value;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link TitleType }
     *     
     */
    public TitleType getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link TitleType }
     *     
     */
    public void setTitle(TitleType value) {
        this.title = value;
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
     * {@link LanguageType }
     * 
     * 
     */
    public List<LanguageType> getLanguages() {
        if (languages == null) {
            languages = new ArrayList<LanguageType>();
        }
        return this.languages;
    }

    /**
     * Gets the value of the descriptions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the descriptions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDescriptions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DescriptionType }
     * 
     * 
     */
    public List<DescriptionType> getDescriptions() {
        if (descriptions == null) {
            descriptions = new ArrayList<DescriptionType>();
        }
        return this.descriptions;
    }

    /**
     * Gets the value of the keywords property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the keywords property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKeywords().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link KeywordType }
     * 
     * 
     */
    public List<KeywordType> getKeywords() {
        if (keywords == null) {
            keywords = new ArrayList<KeywordType>();
        }
        return this.keywords;
    }

    /**
     * Gets the value of the coverages property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the coverages property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCoverages().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CoverageType }
     * 
     * 
     */
    public List<CoverageType> getCoverages() {
        if (coverages == null) {
            coverages = new ArrayList<CoverageType>();
        }
        return this.coverages;
    }

    /**
     * Gets the value of the structure property.
     * 
     * @return
     *     possible object is
     *     {@link StructureType }
     *     
     */
    public StructureType getStructure() {
        return structure;
    }

    /**
     * Sets the value of the structure property.
     * 
     * @param value
     *     allowed object is
     *     {@link StructureType }
     *     
     */
    public void setStructure(StructureType value) {
        this.structure = value;
    }

    /**
     * Gets the value of the aggregationLevel property.
     * 
     * @return
     *     possible object is
     *     {@link AggregationLevelType }
     *     
     */
    public AggregationLevelType getAggregationLevel() {
        return aggregationLevel;
    }

    /**
     * Sets the value of the aggregationLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link AggregationLevelType }
     *     
     */
    public void setAggregationLevel(AggregationLevelType value) {
        this.aggregationLevel = value;
    }

}