//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.08.09 at 09:22:32 PM IST 
//


package com.pacificmetrics.ims.apip.qti.item;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.w3.xinclude.Include;


/**
 * 
 *                 The OutcomeElse complexType is the container for 'Else' processing. An outcomeElse part consists of an expression which must have an effective baseType of boolean and single cardinality. For more information about the runtime data model employed see Expressions. It also contains a set of sub-rules. If the expression is true then the sub-rules are processed.
 *             
 * 
 * <p>Java class for OutcomeElse.Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OutcomeElse.Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice maxOccurs="unbounded" minOccurs="0">
 *           &lt;element ref="{http://www.imsglobal.org/xsd/apip/apipv1p0/qtiitem/imsqti_v2p2}lookupOutcomeValue"/>
 *           &lt;element ref="{http://www.imsglobal.org/xsd/apip/apipv1p0/qtiitem/imsqti_v2p2}outcomeProcessingFragment"/>
 *           &lt;element ref="{http://www.imsglobal.org/xsd/apip/apipv1p0/qtiitem/imsqti_v2p2}setOutcomeValue"/>
 *           &lt;element ref="{http://www.w3.org/2001/XInclude}include"/>
 *           &lt;element ref="{http://www.imsglobal.org/xsd/apip/apipv1p0/qtiitem/imsqti_v2p2}exitTest"/>
 *           &lt;element ref="{http://www.imsglobal.org/xsd/apip/apipv1p0/qtiitem/imsqti_v2p2}outcomeCondition"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OutcomeElse.Type", propOrder = {
    "lookupOutcomeValuesAndOutcomeProcessingFragmentsAndSetOutcomeValues"
})
@XmlRootElement(name = "outcomeElse")
public class OutcomeElse {

    @XmlElements({
        @XmlElement(name = "lookupOutcomeValue", type = LookupOutcomeValue.class),
        @XmlElement(name = "outcomeProcessingFragment", type = OutcomeProcessingFragment.class),
        @XmlElement(name = "setOutcomeValue", type = SetValueType.class),
        @XmlElement(name = "include", namespace = "http://www.w3.org/2001/XInclude", type = Include.class),
        @XmlElement(name = "exitTest", type = EmptyPrimitiveTypeType.class),
        @XmlElement(name = "outcomeCondition", type = OutcomeCondition.class)
    })
    protected List<java.lang.Object> lookupOutcomeValuesAndOutcomeProcessingFragmentsAndSetOutcomeValues;

    /**
     * Gets the value of the lookupOutcomeValuesAndOutcomeProcessingFragmentsAndSetOutcomeValues property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lookupOutcomeValuesAndOutcomeProcessingFragmentsAndSetOutcomeValues property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLookupOutcomeValuesAndOutcomeProcessingFragmentsAndSetOutcomeValues().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LookupOutcomeValue }
     * {@link OutcomeProcessingFragment }
     * {@link SetValueType }
     * {@link Include }
     * {@link EmptyPrimitiveTypeType }
     * {@link OutcomeCondition }
     * 
     * 
     */
    public List<java.lang.Object> getLookupOutcomeValuesAndOutcomeProcessingFragmentsAndSetOutcomeValues() {
        if (lookupOutcomeValuesAndOutcomeProcessingFragmentsAndSetOutcomeValues == null) {
            lookupOutcomeValuesAndOutcomeProcessingFragmentsAndSetOutcomeValues = new ArrayList<java.lang.Object>();
        }
        return this.lookupOutcomeValuesAndOutcomeProcessingFragmentsAndSetOutcomeValues;
    }

}