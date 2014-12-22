//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.08.09 at 06:44:50 PM IST 
//


package org.ieee.ltsc.lom.resource;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.pacificmetrics.ims.apip.qti.metadata.QtiMetadata;


/**
 * 
 *                 The LOM complexType is the container for the metadata instance.
 *                 [APIP-Resource] Profile - the changes to the XML element list are:
 *                 * The "qtiMetadata" element has been added using Import;
 *             
 * 
 * <p>Java class for LOM.Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LOM.Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="unbounded" minOccurs="0">
 *         &lt;element name="general" type="{http://ltsc.ieee.org/xsd/apipv1p0/LOM/resource}General.Type" minOccurs="0"/>
 *         &lt;element name="lifeCycle" type="{http://ltsc.ieee.org/xsd/apipv1p0/LOM/resource}LifeCycle.Type" minOccurs="0"/>
 *         &lt;element name="metaMetadata" type="{http://ltsc.ieee.org/xsd/apipv1p0/LOM/resource}MetaMetadata.Type" minOccurs="0"/>
 *         &lt;element name="technical" type="{http://ltsc.ieee.org/xsd/apipv1p0/LOM/resource}Technical.Type" minOccurs="0"/>
 *         &lt;element name="educational" type="{http://ltsc.ieee.org/xsd/apipv1p0/LOM/resource}Educational.Type" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="rights" type="{http://ltsc.ieee.org/xsd/apipv1p0/LOM/resource}Rights.Type" minOccurs="0"/>
 *         &lt;element name="relation" type="{http://ltsc.ieee.org/xsd/apipv1p0/LOM/resource}Relation.Type" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="annotation" type="{http://ltsc.ieee.org/xsd/apipv1p0/LOM/resource}Annotation.Type" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="classification" type="{http://ltsc.ieee.org/xsd/apipv1p0/LOM/resource}Classification.Type" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.imsglobal.org/xsd/apip/apipv1p0/qtimetadata/imsqti_v2p2}qtiMetadata" minOccurs="0"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LOM.Type", propOrder = {
    "generalsAndLifeCyclesAndMetaMetadatas"
})
@XmlRootElement(name = "lom")
public class Lom {

    @XmlElements({
        @XmlElement(name = "general", type = GeneralType.class),
        @XmlElement(name = "lifeCycle", type = LifeCycleType.class),
        @XmlElement(name = "metaMetadata", type = MetaMetadataType.class),
        @XmlElement(name = "technical", type = TechnicalType.class),
        @XmlElement(name = "educational", type = EducationalType.class),
        @XmlElement(name = "rights", type = RightsType.class),
        @XmlElement(name = "relation", type = RelationType.class),
        @XmlElement(name = "annotation", type = AnnotationType.class),
        @XmlElement(name = "classification", type = ClassificationType.class),
        @XmlElement(name = "qtiMetadata", namespace = "http://www.imsglobal.org/xsd/apip/apipv1p0/qtimetadata/imsqti_v2p2", type = QtiMetadata.class)
    })
    protected List<Object> generalsAndLifeCyclesAndMetaMetadatas;

    /**
     * Gets the value of the generalsAndLifeCyclesAndMetaMetadatas property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the generalsAndLifeCyclesAndMetaMetadatas property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGeneralsAndLifeCyclesAndMetaMetadatas().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GeneralType }
     * {@link LifeCycleType }
     * {@link MetaMetadataType }
     * {@link TechnicalType }
     * {@link EducationalType }
     * {@link RightsType }
     * {@link RelationType }
     * {@link AnnotationType }
     * {@link ClassificationType }
     * {@link QtiMetadata }
     * 
     * 
     */
    public List<Object> getGeneralsAndLifeCyclesAndMetaMetadatas() {
        if (generalsAndLifeCyclesAndMetaMetadatas == null) {
            generalsAndLifeCyclesAndMetaMetadatas = new ArrayList<Object>();
        }
        return this.generalsAndLifeCyclesAndMetaMetadatas;
    }

}