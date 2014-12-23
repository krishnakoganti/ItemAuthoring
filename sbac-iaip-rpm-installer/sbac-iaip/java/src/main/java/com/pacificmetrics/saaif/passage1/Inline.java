//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.09.17 at 10:19:27 AM IST 
//


package com.pacificmetrics.saaif.passage1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlMixed;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *       "Inline" covers inline or "text-level" elements
 *       
 * 
 * <p>Java class for Inline complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Inline">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="unbounded" minOccurs="0">
 *         &lt;group ref="{http://www.w3.org/1999/xhtml}inline"/>
 *         &lt;group ref="{http://www.w3.org/1999/xhtml}misc.inline"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Inline", propOrder = {
    "content"
})
@XmlSeeAlso({
    P.class,
    Legend.class,
    Caption.class,
    Address.class,
    Label.class,
    Sup.class,
    Sub.class,
    Acronym.class,
    Abbr.class,
    Cite.class,
    Var.class,
    Kbd.class,
    Samp.class,
    Q.class,
    Code.class,
    Dfn.class,
    Strong.class,
    Em.class,
    Small.class,
    Big.class,
    B.class,
    I.class,
    Tt.class,
    Dt.class,
    H6 .class,
    H5 .class,
    H4 .class,
    H3 .class,
    H2 .class,
    H1 .class,
    Bdo.class,
    Span.class
})
public class Inline {

    @XmlElementRefs({
        @XmlElementRef(name = "script", namespace = "http://www.w3.org/1999/xhtml", type = Script.class, required = false),
        @XmlElementRef(name = "object", namespace = "http://www.w3.org/1999/xhtml", type = com.pacificmetrics.saaif.passage1.Object.class, required = false),
        @XmlElementRef(name = "br", namespace = "http://www.w3.org/1999/xhtml", type = Br.class, required = false),
        @XmlElementRef(name = "code", namespace = "http://www.w3.org/1999/xhtml", type = Code.class, required = false),
        @XmlElementRef(name = "i", namespace = "http://www.w3.org/1999/xhtml", type = I.class, required = false),
        @XmlElementRef(name = "bdo", namespace = "http://www.w3.org/1999/xhtml", type = Bdo.class, required = false),
        @XmlElementRef(name = "cite", namespace = "http://www.w3.org/1999/xhtml", type = Cite.class, required = false),
        @XmlElementRef(name = "button", namespace = "http://www.w3.org/1999/xhtml", type = Button.class, required = false),
        @XmlElementRef(name = "a", namespace = "http://www.w3.org/1999/xhtml", type = A.class, required = false),
        @XmlElementRef(name = "q", namespace = "http://www.w3.org/1999/xhtml", type = Q.class, required = false),
        @XmlElementRef(name = "abbr", namespace = "http://www.w3.org/1999/xhtml", type = Abbr.class, required = false),
        @XmlElementRef(name = "var", namespace = "http://www.w3.org/1999/xhtml", type = Var.class, required = false),
        @XmlElementRef(name = "del", namespace = "http://www.w3.org/1999/xhtml", type = Del.class, required = false),
        @XmlElementRef(name = "sup", namespace = "http://www.w3.org/1999/xhtml", type = Sup.class, required = false),
        @XmlElementRef(name = "span", namespace = "http://www.w3.org/1999/xhtml", type = Span.class, required = false),
        @XmlElementRef(name = "samp", namespace = "http://www.w3.org/1999/xhtml", type = Samp.class, required = false),
        @XmlElementRef(name = "label", namespace = "http://www.w3.org/1999/xhtml", type = Label.class, required = false),
        @XmlElementRef(name = "input", namespace = "http://www.w3.org/1999/xhtml", type = Input.class, required = false),
        @XmlElementRef(name = "map", namespace = "http://www.w3.org/1999/xhtml", type = Map.class, required = false),
        @XmlElementRef(name = "textarea", namespace = "http://www.w3.org/1999/xhtml", type = Textarea.class, required = false),
        @XmlElementRef(name = "select", namespace = "http://www.w3.org/1999/xhtml", type = Select.class, required = false),
        @XmlElementRef(name = "big", namespace = "http://www.w3.org/1999/xhtml", type = Big.class, required = false),
        @XmlElementRef(name = "sub", namespace = "http://www.w3.org/1999/xhtml", type = Sub.class, required = false),
        @XmlElementRef(name = "small", namespace = "http://www.w3.org/1999/xhtml", type = Small.class, required = false),
        @XmlElementRef(name = "dfn", namespace = "http://www.w3.org/1999/xhtml", type = Dfn.class, required = false),
        @XmlElementRef(name = "em", namespace = "http://www.w3.org/1999/xhtml", type = Em.class, required = false),
        @XmlElementRef(name = "ins", namespace = "http://www.w3.org/1999/xhtml", type = Ins.class, required = false),
        @XmlElementRef(name = "acronym", namespace = "http://www.w3.org/1999/xhtml", type = Acronym.class, required = false),
        @XmlElementRef(name = "strong", namespace = "http://www.w3.org/1999/xhtml", type = Strong.class, required = false),
        @XmlElementRef(name = "b", namespace = "http://www.w3.org/1999/xhtml", type = B.class, required = false),
        @XmlElementRef(name = "tt", namespace = "http://www.w3.org/1999/xhtml", type = Tt.class, required = false),
        @XmlElementRef(name = "img", namespace = "http://www.w3.org/1999/xhtml", type = Img.class, required = false),
        @XmlElementRef(name = "kbd", namespace = "http://www.w3.org/1999/xhtml", type = Kbd.class, required = false)
    })
    @XmlMixed
    protected List<java.lang.Object> content;

    /**
     * 
     *       "Inline" covers inline or "text-level" elements
     *       Gets the value of the content property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the content property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link com.pacificmetrics.saaif.passage1.Object }
     * {@link Script }
     * {@link Code }
     * {@link Br }
     * {@link I }
     * {@link Cite }
     * {@link Bdo }
     * {@link A }
     * {@link Button }
     * {@link Q }
     * {@link Abbr }
     * {@link Var }
     * {@link Del }
     * {@link Sup }
     * {@link Span }
     * {@link Samp }
     * {@link Label }
     * {@link Input }
     * {@link Map }
     * {@link Big }
     * {@link Select }
     * {@link Textarea }
     * {@link Sub }
     * {@link Small }
     * {@link Dfn }
     * {@link Em }
     * {@link String }
     * {@link Acronym }
     * {@link Ins }
     * {@link Strong }
     * {@link Tt }
     * {@link B }
     * {@link Kbd }
     * {@link Img }
     * 
     * 
     */
    public List<java.lang.Object> getContent() {
        if (content == null) {
            content = new ArrayList<java.lang.Object>();
        }
        return this.content;
    }

}
