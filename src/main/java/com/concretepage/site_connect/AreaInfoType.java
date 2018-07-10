
package com.concretepage.site_connect;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for AreaInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AreaInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RefPoints" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}RefPointsType">
 *                 &lt;attribute name="LastUpdated" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Attractions" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Attraction" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Contact" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;extension base="{http://www.opentravel.org/OTA/2003/05}ContactInfoType">
 *                                     &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}RemovalGroup"/>
 *                                   &lt;/extension>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="OperationSchedules" type="{http://www.opentravel.org/OTA/2003/05}OperationSchedulesPlusChargeType" minOccurs="0"/>
 *                             &lt;element name="MultimediaDescriptions" type="{http://www.opentravel.org/OTA/2003/05}MultimediaDescriptionsType" minOccurs="0"/>
 *                             &lt;element name="RefPoints" type="{http://www.opentravel.org/OTA/2003/05}RefPointsType" minOccurs="0"/>
 *                             &lt;element name="DescriptiveText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                           &lt;/sequence>
 *                           &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CodeInfoGroup"/>
 *                           &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}DateTimeSpanGroup"/>
 *                           &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}ID_OptionalGroup"/>
 *                           &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CodeListGroup"/>
 *                           &lt;attribute name="AttractionCategoryCode" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
 *                           &lt;attribute name="AttractionName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="AttractionFee" type="{http://www.w3.org/2001/XMLSchema}float" />
 *                           &lt;attribute name="CourtesyPhone" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                           &lt;attribute name="ProximityCode" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
 *                           &lt;attribute name="Sort" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="LastUpdated" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Recreations" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Recreation" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Contact" type="{http://www.opentravel.org/OTA/2003/05}ContactInfoType" minOccurs="0"/>
 *                             &lt;element name="OperationSchedules" type="{http://www.opentravel.org/OTA/2003/05}OperationSchedulesPlusChargeType" minOccurs="0"/>
 *                             &lt;element name="RefPoints" type="{http://www.opentravel.org/OTA/2003/05}RefPointsType" minOccurs="0"/>
 *                             &lt;element name="MultimediaDescriptions" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;extension base="{http://www.opentravel.org/OTA/2003/05}MultimediaDescriptionsType">
 *                                     &lt;attribute name="Location" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *                                     &lt;attribute name="RefDirectionTo" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" />
 *                                   &lt;/extension>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="RecreationDetails" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="RecreationDetail" maxOccurs="unbounded">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="Description" type="{http://www.opentravel.org/OTA/2003/05}ParagraphType" maxOccurs="5" minOccurs="0"/>
 *                                               &lt;/sequence>
 *                                               &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CodeInfoGroup"/>
 *                                               &lt;attribute name="Code" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
 *                                               &lt;attribute name="ExistsCode" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="DescriptiveText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                           &lt;/sequence>
 *                           &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CodeInfoGroup"/>
 *                           &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}ID_OptionalGroup"/>
 *                           &lt;attribute name="Code" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
 *                           &lt;attribute name="Name" type="{http://www.opentravel.org/OTA/2003/05}StringLength0to64" />
 *                           &lt;attribute name="ProximityCode" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
 *                           &lt;attribute name="Included" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                           &lt;attribute name="ExistsCode" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
 *                           &lt;attribute name="Sort" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="LastUpdated" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="OtherHotels" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="OtherHotel" maxOccurs="99">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="ContactInfos" type="{http://www.opentravel.org/OTA/2003/05}ContactInfosType" minOccurs="0"/>
 *                             &lt;element name="RefPoints" type="{http://www.opentravel.org/OTA/2003/05}RefPointsType" minOccurs="0"/>
 *                           &lt;/sequence>
 *                           &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}HotelReferenceGroup"/>
 *                           &lt;attribute name="CompetitorIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                           &lt;attribute name="SegmentCategoryCode" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
 *                           &lt;attribute name="ID" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to32" />
 *                           &lt;attribute name="AlternateID" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to32" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="LastUpdated" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AreaInfoType", propOrder = {
    "refPoints",
    "attractions",
    "recreations",
    "otherHotels"
})
public class AreaInfoType {

    @XmlElement(name = "RefPoints")
    protected AreaInfoType.RefPoints refPoints;
    @XmlElement(name = "Attractions")
    protected AreaInfoType.Attractions attractions;
    @XmlElement(name = "Recreations")
    protected AreaInfoType.Recreations recreations;
    @XmlElement(name = "OtherHotels")
    protected AreaInfoType.OtherHotels otherHotels;

    /**
     * Gets the value of the refPoints property.
     * 
     * @return
     *     possible object is
     *     {@link AreaInfoType.RefPoints }
     *     
     */
    public AreaInfoType.RefPoints getRefPoints() {
        return refPoints;
    }

    /**
     * Sets the value of the refPoints property.
     * 
     * @param value
     *     allowed object is
     *     {@link AreaInfoType.RefPoints }
     *     
     */
    public void setRefPoints(AreaInfoType.RefPoints value) {
        this.refPoints = value;
    }

    /**
     * Gets the value of the attractions property.
     * 
     * @return
     *     possible object is
     *     {@link AreaInfoType.Attractions }
     *     
     */
    public AreaInfoType.Attractions getAttractions() {
        return attractions;
    }

    /**
     * Sets the value of the attractions property.
     * 
     * @param value
     *     allowed object is
     *     {@link AreaInfoType.Attractions }
     *     
     */
    public void setAttractions(AreaInfoType.Attractions value) {
        this.attractions = value;
    }

    /**
     * Gets the value of the recreations property.
     * 
     * @return
     *     possible object is
     *     {@link AreaInfoType.Recreations }
     *     
     */
    public AreaInfoType.Recreations getRecreations() {
        return recreations;
    }

    /**
     * Sets the value of the recreations property.
     * 
     * @param value
     *     allowed object is
     *     {@link AreaInfoType.Recreations }
     *     
     */
    public void setRecreations(AreaInfoType.Recreations value) {
        this.recreations = value;
    }

    /**
     * Gets the value of the otherHotels property.
     * 
     * @return
     *     possible object is
     *     {@link AreaInfoType.OtherHotels }
     *     
     */
    public AreaInfoType.OtherHotels getOtherHotels() {
        return otherHotels;
    }

    /**
     * Sets the value of the otherHotels property.
     * 
     * @param value
     *     allowed object is
     *     {@link AreaInfoType.OtherHotels }
     *     
     */
    public void setOtherHotels(AreaInfoType.OtherHotels value) {
        this.otherHotels = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="Attraction" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Contact" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;extension base="{http://www.opentravel.org/OTA/2003/05}ContactInfoType">
     *                           &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}RemovalGroup"/>
     *                         &lt;/extension>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="OperationSchedules" type="{http://www.opentravel.org/OTA/2003/05}OperationSchedulesPlusChargeType" minOccurs="0"/>
     *                   &lt;element name="MultimediaDescriptions" type="{http://www.opentravel.org/OTA/2003/05}MultimediaDescriptionsType" minOccurs="0"/>
     *                   &lt;element name="RefPoints" type="{http://www.opentravel.org/OTA/2003/05}RefPointsType" minOccurs="0"/>
     *                   &lt;element name="DescriptiveText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                 &lt;/sequence>
     *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CodeInfoGroup"/>
     *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}DateTimeSpanGroup"/>
     *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}ID_OptionalGroup"/>
     *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CodeListGroup"/>
     *                 &lt;attribute name="AttractionCategoryCode" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
     *                 &lt;attribute name="AttractionName" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="AttractionFee" type="{http://www.w3.org/2001/XMLSchema}float" />
     *                 &lt;attribute name="CourtesyPhone" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                 &lt;attribute name="ProximityCode" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
     *                 &lt;attribute name="Sort" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="LastUpdated" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "attraction"
    })
    public static class Attractions {

        @XmlElement(name = "Attraction", required = true)
        protected List<AreaInfoType.Attractions.Attraction> attraction;
        @XmlAttribute(name = "LastUpdated")
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar lastUpdated;

        /**
         * Gets the value of the attraction property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the attraction property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAttraction().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AreaInfoType.Attractions.Attraction }
         * 
         * 
         */
        public List<AreaInfoType.Attractions.Attraction> getAttraction() {
            if (attraction == null) {
                attraction = new ArrayList<AreaInfoType.Attractions.Attraction>();
            }
            return this.attraction;
        }

        /**
         * Gets the value of the lastUpdated property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getLastUpdated() {
            return lastUpdated;
        }

        /**
         * Sets the value of the lastUpdated property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setLastUpdated(XMLGregorianCalendar value) {
            this.lastUpdated = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="Contact" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}ContactInfoType">
         *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}RemovalGroup"/>
         *               &lt;/extension>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="OperationSchedules" type="{http://www.opentravel.org/OTA/2003/05}OperationSchedulesPlusChargeType" minOccurs="0"/>
         *         &lt;element name="MultimediaDescriptions" type="{http://www.opentravel.org/OTA/2003/05}MultimediaDescriptionsType" minOccurs="0"/>
         *         &lt;element name="RefPoints" type="{http://www.opentravel.org/OTA/2003/05}RefPointsType" minOccurs="0"/>
         *         &lt;element name="DescriptiveText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *       &lt;/sequence>
         *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CodeInfoGroup"/>
         *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}DateTimeSpanGroup"/>
         *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}ID_OptionalGroup"/>
         *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CodeListGroup"/>
         *       &lt;attribute name="AttractionCategoryCode" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
         *       &lt;attribute name="AttractionName" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="AttractionFee" type="{http://www.w3.org/2001/XMLSchema}float" />
         *       &lt;attribute name="CourtesyPhone" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *       &lt;attribute name="ProximityCode" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
         *       &lt;attribute name="Sort" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "contact",
            "operationSchedules",
            "multimediaDescriptions",
            "refPoints",
            "descriptiveText"
        })
        public static class Attraction {

            @XmlElement(name = "Contact")
            protected AreaInfoType.Attractions.Attraction.Contact contact;
            @XmlElement(name = "OperationSchedules")
            protected OperationSchedulesPlusChargeType operationSchedules;
            @XmlElement(name = "MultimediaDescriptions")
            protected MultimediaDescriptionsType multimediaDescriptions;
            @XmlElement(name = "RefPoints")
            protected RefPointsType refPoints;
            @XmlElement(name = "DescriptiveText")
            protected String descriptiveText;
            @XmlAttribute(name = "AttractionCategoryCode")
            protected String attractionCategoryCode;
            @XmlAttribute(name = "AttractionName")
            protected String attractionName;
            @XmlAttribute(name = "AttractionFee")
            protected Float attractionFee;
            @XmlAttribute(name = "CourtesyPhone")
            protected Boolean courtesyPhone;
            @XmlAttribute(name = "ProximityCode")
            protected String proximityCode;
            @XmlAttribute(name = "Sort")
            @XmlSchemaType(name = "nonNegativeInteger")
            protected BigInteger sort;
            @XmlAttribute(name = "CodeDetail")
            protected String codeDetail;
            @XmlAttribute(name = "Removal")
            protected Boolean removal;
            @XmlAttribute(name = "Start")
            protected String start;
            @XmlAttribute(name = "Duration")
            protected String duration;
            @XmlAttribute(name = "End")
            protected String end;
            @XmlAttribute(name = "ID")
            protected String id;
            @XmlAttribute(name = "Code")
            protected String code;
            @XmlAttribute(name = "CodeContext")
            protected String codeContext;
            @XmlAttribute(name = "URI")
            @XmlSchemaType(name = "anyURI")
            protected String uri;
            @XmlAttribute(name = "Quantity")
            @XmlSchemaType(name = "nonNegativeInteger")
            protected BigInteger quantity;

            /**
             * Gets the value of the contact property.
             * 
             * @return
             *     possible object is
             *     {@link AreaInfoType.Attractions.Attraction.Contact }
             *     
             */
            public AreaInfoType.Attractions.Attraction.Contact getContact() {
                return contact;
            }

            /**
             * Sets the value of the contact property.
             * 
             * @param value
             *     allowed object is
             *     {@link AreaInfoType.Attractions.Attraction.Contact }
             *     
             */
            public void setContact(AreaInfoType.Attractions.Attraction.Contact value) {
                this.contact = value;
            }

            /**
             * Gets the value of the operationSchedules property.
             * 
             * @return
             *     possible object is
             *     {@link OperationSchedulesPlusChargeType }
             *     
             */
            public OperationSchedulesPlusChargeType getOperationSchedules() {
                return operationSchedules;
            }

            /**
             * Sets the value of the operationSchedules property.
             * 
             * @param value
             *     allowed object is
             *     {@link OperationSchedulesPlusChargeType }
             *     
             */
            public void setOperationSchedules(OperationSchedulesPlusChargeType value) {
                this.operationSchedules = value;
            }

            /**
             * Gets the value of the multimediaDescriptions property.
             * 
             * @return
             *     possible object is
             *     {@link MultimediaDescriptionsType }
             *     
             */
            public MultimediaDescriptionsType getMultimediaDescriptions() {
                return multimediaDescriptions;
            }

            /**
             * Sets the value of the multimediaDescriptions property.
             * 
             * @param value
             *     allowed object is
             *     {@link MultimediaDescriptionsType }
             *     
             */
            public void setMultimediaDescriptions(MultimediaDescriptionsType value) {
                this.multimediaDescriptions = value;
            }

            /**
             * Gets the value of the refPoints property.
             * 
             * @return
             *     possible object is
             *     {@link RefPointsType }
             *     
             */
            public RefPointsType getRefPoints() {
                return refPoints;
            }

            /**
             * Sets the value of the refPoints property.
             * 
             * @param value
             *     allowed object is
             *     {@link RefPointsType }
             *     
             */
            public void setRefPoints(RefPointsType value) {
                this.refPoints = value;
            }

            /**
             * Gets the value of the descriptiveText property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDescriptiveText() {
                return descriptiveText;
            }

            /**
             * Sets the value of the descriptiveText property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDescriptiveText(String value) {
                this.descriptiveText = value;
            }

            /**
             * Gets the value of the attractionCategoryCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAttractionCategoryCode() {
                return attractionCategoryCode;
            }

            /**
             * Sets the value of the attractionCategoryCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAttractionCategoryCode(String value) {
                this.attractionCategoryCode = value;
            }

            /**
             * Gets the value of the attractionName property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAttractionName() {
                return attractionName;
            }

            /**
             * Sets the value of the attractionName property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAttractionName(String value) {
                this.attractionName = value;
            }

            /**
             * Gets the value of the attractionFee property.
             * 
             * @return
             *     possible object is
             *     {@link Float }
             *     
             */
            public Float getAttractionFee() {
                return attractionFee;
            }

            /**
             * Sets the value of the attractionFee property.
             * 
             * @param value
             *     allowed object is
             *     {@link Float }
             *     
             */
            public void setAttractionFee(Float value) {
                this.attractionFee = value;
            }

            /**
             * Gets the value of the courtesyPhone property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isCourtesyPhone() {
                return courtesyPhone;
            }

            /**
             * Sets the value of the courtesyPhone property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setCourtesyPhone(Boolean value) {
                this.courtesyPhone = value;
            }

            /**
             * Gets the value of the proximityCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getProximityCode() {
                return proximityCode;
            }

            /**
             * Sets the value of the proximityCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setProximityCode(String value) {
                this.proximityCode = value;
            }

            /**
             * Gets the value of the sort property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getSort() {
                return sort;
            }

            /**
             * Sets the value of the sort property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setSort(BigInteger value) {
                this.sort = value;
            }

            /**
             * Gets the value of the codeDetail property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCodeDetail() {
                return codeDetail;
            }

            /**
             * Sets the value of the codeDetail property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCodeDetail(String value) {
                this.codeDetail = value;
            }

            /**
             * Gets the value of the removal property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isRemoval() {
                return removal;
            }

            /**
             * Sets the value of the removal property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setRemoval(Boolean value) {
                this.removal = value;
            }

            /**
             * Gets the value of the start property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getStart() {
                return start;
            }

            /**
             * Sets the value of the start property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setStart(String value) {
                this.start = value;
            }

            /**
             * Gets the value of the duration property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDuration() {
                return duration;
            }

            /**
             * Sets the value of the duration property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDuration(String value) {
                this.duration = value;
            }

            /**
             * Gets the value of the end property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getEnd() {
                return end;
            }

            /**
             * Sets the value of the end property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setEnd(String value) {
                this.end = value;
            }

            /**
             * Gets the value of the id property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getID() {
                return id;
            }

            /**
             * Sets the value of the id property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setID(String value) {
                this.id = value;
            }

            /**
             * Gets the value of the code property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCode() {
                return code;
            }

            /**
             * Sets the value of the code property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCode(String value) {
                this.code = value;
            }

            /**
             * Gets the value of the codeContext property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCodeContext() {
                return codeContext;
            }

            /**
             * Sets the value of the codeContext property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCodeContext(String value) {
                this.codeContext = value;
            }

            /**
             * Gets the value of the uri property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getURI() {
                return uri;
            }

            /**
             * Sets the value of the uri property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setURI(String value) {
                this.uri = value;
            }

            /**
             * Gets the value of the quantity property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getQuantity() {
                return quantity;
            }

            /**
             * Sets the value of the quantity property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setQuantity(BigInteger value) {
                this.quantity = value;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}ContactInfoType">
             *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}RemovalGroup"/>
             *     &lt;/extension>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class Contact
                extends ContactInfoType
            {

                @XmlAttribute(name = "Removal")
                protected Boolean removal;

                /**
                 * Gets the value of the removal property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Boolean }
                 *     
                 */
                public Boolean isRemoval() {
                    return removal;
                }

                /**
                 * Sets the value of the removal property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Boolean }
                 *     
                 */
                public void setRemoval(Boolean value) {
                    this.removal = value;
                }

            }

        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="OtherHotel" maxOccurs="99">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="ContactInfos" type="{http://www.opentravel.org/OTA/2003/05}ContactInfosType" minOccurs="0"/>
     *                   &lt;element name="RefPoints" type="{http://www.opentravel.org/OTA/2003/05}RefPointsType" minOccurs="0"/>
     *                 &lt;/sequence>
     *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}HotelReferenceGroup"/>
     *                 &lt;attribute name="CompetitorIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                 &lt;attribute name="SegmentCategoryCode" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
     *                 &lt;attribute name="ID" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to32" />
     *                 &lt;attribute name="AlternateID" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to32" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="LastUpdated" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "otherHotel"
    })
    public static class OtherHotels {

        @XmlElement(name = "OtherHotel", required = true)
        protected List<AreaInfoType.OtherHotels.OtherHotel> otherHotel;
        @XmlAttribute(name = "LastUpdated")
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar lastUpdated;

        /**
         * Gets the value of the otherHotel property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the otherHotel property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getOtherHotel().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AreaInfoType.OtherHotels.OtherHotel }
         * 
         * 
         */
        public List<AreaInfoType.OtherHotels.OtherHotel> getOtherHotel() {
            if (otherHotel == null) {
                otherHotel = new ArrayList<AreaInfoType.OtherHotels.OtherHotel>();
            }
            return this.otherHotel;
        }

        /**
         * Gets the value of the lastUpdated property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getLastUpdated() {
            return lastUpdated;
        }

        /**
         * Sets the value of the lastUpdated property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setLastUpdated(XMLGregorianCalendar value) {
            this.lastUpdated = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="ContactInfos" type="{http://www.opentravel.org/OTA/2003/05}ContactInfosType" minOccurs="0"/>
         *         &lt;element name="RefPoints" type="{http://www.opentravel.org/OTA/2003/05}RefPointsType" minOccurs="0"/>
         *       &lt;/sequence>
         *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}HotelReferenceGroup"/>
         *       &lt;attribute name="CompetitorIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *       &lt;attribute name="SegmentCategoryCode" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
         *       &lt;attribute name="ID" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to32" />
         *       &lt;attribute name="AlternateID" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to32" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "contactInfos",
            "refPoints"
        })
        public static class OtherHotel {

            @XmlElement(name = "ContactInfos")
            protected ContactInfosType contactInfos;
            @XmlElement(name = "RefPoints")
            protected RefPointsType refPoints;
            @XmlAttribute(name = "CompetitorIndicator")
            protected Boolean competitorIndicator;
            @XmlAttribute(name = "SegmentCategoryCode")
            protected String segmentCategoryCode;
            @XmlAttribute(name = "ID")
            protected String id;
            @XmlAttribute(name = "AlternateID")
            protected String alternateID;
            @XmlAttribute(name = "ChainCode")
            protected String chainCode;
            @XmlAttribute(name = "BrandCode")
            protected String brandCode;
            @XmlAttribute(name = "HotelCode")
            protected String hotelCode;
            @XmlAttribute(name = "HotelCityCode")
            protected String hotelCityCode;
            @XmlAttribute(name = "HotelName")
            protected String hotelName;
            @XmlAttribute(name = "HotelCodeContext")
            protected String hotelCodeContext;
            @XmlAttribute(name = "ChainName")
            protected String chainName;
            @XmlAttribute(name = "BrandName")
            protected String brandName;
            @XmlAttribute(name = "AreaID")
            protected String areaID;

            /**
             * Gets the value of the contactInfos property.
             * 
             * @return
             *     possible object is
             *     {@link ContactInfosType }
             *     
             */
            public ContactInfosType getContactInfos() {
                return contactInfos;
            }

            /**
             * Sets the value of the contactInfos property.
             * 
             * @param value
             *     allowed object is
             *     {@link ContactInfosType }
             *     
             */
            public void setContactInfos(ContactInfosType value) {
                this.contactInfos = value;
            }

            /**
             * Gets the value of the refPoints property.
             * 
             * @return
             *     possible object is
             *     {@link RefPointsType }
             *     
             */
            public RefPointsType getRefPoints() {
                return refPoints;
            }

            /**
             * Sets the value of the refPoints property.
             * 
             * @param value
             *     allowed object is
             *     {@link RefPointsType }
             *     
             */
            public void setRefPoints(RefPointsType value) {
                this.refPoints = value;
            }

            /**
             * Gets the value of the competitorIndicator property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isCompetitorIndicator() {
                return competitorIndicator;
            }

            /**
             * Sets the value of the competitorIndicator property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setCompetitorIndicator(Boolean value) {
                this.competitorIndicator = value;
            }

            /**
             * Gets the value of the segmentCategoryCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSegmentCategoryCode() {
                return segmentCategoryCode;
            }

            /**
             * Sets the value of the segmentCategoryCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSegmentCategoryCode(String value) {
                this.segmentCategoryCode = value;
            }

            /**
             * Gets the value of the id property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getID() {
                return id;
            }

            /**
             * Sets the value of the id property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setID(String value) {
                this.id = value;
            }

            /**
             * Gets the value of the alternateID property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAlternateID() {
                return alternateID;
            }

            /**
             * Sets the value of the alternateID property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAlternateID(String value) {
                this.alternateID = value;
            }

            /**
             * Gets the value of the chainCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getChainCode() {
                return chainCode;
            }

            /**
             * Sets the value of the chainCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setChainCode(String value) {
                this.chainCode = value;
            }

            /**
             * Gets the value of the brandCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBrandCode() {
                return brandCode;
            }

            /**
             * Sets the value of the brandCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBrandCode(String value) {
                this.brandCode = value;
            }

            /**
             * Gets the value of the hotelCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getHotelCode() {
                return hotelCode;
            }

            /**
             * Sets the value of the hotelCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setHotelCode(String value) {
                this.hotelCode = value;
            }

            /**
             * Gets the value of the hotelCityCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getHotelCityCode() {
                return hotelCityCode;
            }

            /**
             * Sets the value of the hotelCityCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setHotelCityCode(String value) {
                this.hotelCityCode = value;
            }

            /**
             * Gets the value of the hotelName property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getHotelName() {
                return hotelName;
            }

            /**
             * Sets the value of the hotelName property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setHotelName(String value) {
                this.hotelName = value;
            }

            /**
             * Gets the value of the hotelCodeContext property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getHotelCodeContext() {
                return hotelCodeContext;
            }

            /**
             * Sets the value of the hotelCodeContext property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setHotelCodeContext(String value) {
                this.hotelCodeContext = value;
            }

            /**
             * Gets the value of the chainName property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getChainName() {
                return chainName;
            }

            /**
             * Sets the value of the chainName property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setChainName(String value) {
                this.chainName = value;
            }

            /**
             * Gets the value of the brandName property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBrandName() {
                return brandName;
            }

            /**
             * Sets the value of the brandName property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBrandName(String value) {
                this.brandName = value;
            }

            /**
             * Gets the value of the areaID property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAreaID() {
                return areaID;
            }

            /**
             * Sets the value of the areaID property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAreaID(String value) {
                this.areaID = value;
            }

        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="Recreation" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Contact" type="{http://www.opentravel.org/OTA/2003/05}ContactInfoType" minOccurs="0"/>
     *                   &lt;element name="OperationSchedules" type="{http://www.opentravel.org/OTA/2003/05}OperationSchedulesPlusChargeType" minOccurs="0"/>
     *                   &lt;element name="RefPoints" type="{http://www.opentravel.org/OTA/2003/05}RefPointsType" minOccurs="0"/>
     *                   &lt;element name="MultimediaDescriptions" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;extension base="{http://www.opentravel.org/OTA/2003/05}MultimediaDescriptionsType">
     *                           &lt;attribute name="Location" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
     *                           &lt;attribute name="RefDirectionTo" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" />
     *                         &lt;/extension>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="RecreationDetails" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="RecreationDetail" maxOccurs="unbounded">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="Description" type="{http://www.opentravel.org/OTA/2003/05}ParagraphType" maxOccurs="5" minOccurs="0"/>
     *                                     &lt;/sequence>
     *                                     &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CodeInfoGroup"/>
     *                                     &lt;attribute name="Code" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
     *                                     &lt;attribute name="ExistsCode" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="DescriptiveText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                 &lt;/sequence>
     *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CodeInfoGroup"/>
     *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}ID_OptionalGroup"/>
     *                 &lt;attribute name="Code" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
     *                 &lt;attribute name="Name" type="{http://www.opentravel.org/OTA/2003/05}StringLength0to64" />
     *                 &lt;attribute name="ProximityCode" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
     *                 &lt;attribute name="Included" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                 &lt;attribute name="ExistsCode" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
     *                 &lt;attribute name="Sort" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="LastUpdated" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "recreation"
    })
    public static class Recreations {

        @XmlElement(name = "Recreation", required = true)
        protected List<AreaInfoType.Recreations.Recreation> recreation;
        @XmlAttribute(name = "LastUpdated")
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar lastUpdated;

        /**
         * Gets the value of the recreation property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the recreation property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRecreation().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AreaInfoType.Recreations.Recreation }
         * 
         * 
         */
        public List<AreaInfoType.Recreations.Recreation> getRecreation() {
            if (recreation == null) {
                recreation = new ArrayList<AreaInfoType.Recreations.Recreation>();
            }
            return this.recreation;
        }

        /**
         * Gets the value of the lastUpdated property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getLastUpdated() {
            return lastUpdated;
        }

        /**
         * Sets the value of the lastUpdated property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setLastUpdated(XMLGregorianCalendar value) {
            this.lastUpdated = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="Contact" type="{http://www.opentravel.org/OTA/2003/05}ContactInfoType" minOccurs="0"/>
         *         &lt;element name="OperationSchedules" type="{http://www.opentravel.org/OTA/2003/05}OperationSchedulesPlusChargeType" minOccurs="0"/>
         *         &lt;element name="RefPoints" type="{http://www.opentravel.org/OTA/2003/05}RefPointsType" minOccurs="0"/>
         *         &lt;element name="MultimediaDescriptions" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}MultimediaDescriptionsType">
         *                 &lt;attribute name="Location" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
         *                 &lt;attribute name="RefDirectionTo" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" />
         *               &lt;/extension>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="RecreationDetails" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="RecreationDetail" maxOccurs="unbounded">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="Description" type="{http://www.opentravel.org/OTA/2003/05}ParagraphType" maxOccurs="5" minOccurs="0"/>
         *                           &lt;/sequence>
         *                           &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CodeInfoGroup"/>
         *                           &lt;attribute name="Code" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
         *                           &lt;attribute name="ExistsCode" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="DescriptiveText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *       &lt;/sequence>
         *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CodeInfoGroup"/>
         *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}ID_OptionalGroup"/>
         *       &lt;attribute name="Code" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
         *       &lt;attribute name="Name" type="{http://www.opentravel.org/OTA/2003/05}StringLength0to64" />
         *       &lt;attribute name="ProximityCode" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
         *       &lt;attribute name="Included" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *       &lt;attribute name="ExistsCode" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
         *       &lt;attribute name="Sort" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "contact",
            "operationSchedules",
            "refPoints",
            "multimediaDescriptions",
            "recreationDetails",
            "descriptiveText"
        })
        public static class Recreation {

            @XmlElement(name = "Contact")
            protected ContactInfoType contact;
            @XmlElement(name = "OperationSchedules")
            protected OperationSchedulesPlusChargeType operationSchedules;
            @XmlElement(name = "RefPoints")
            protected RefPointsType refPoints;
            @XmlElement(name = "MultimediaDescriptions")
            protected AreaInfoType.Recreations.Recreation.MultimediaDescriptions multimediaDescriptions;
            @XmlElement(name = "RecreationDetails")
            protected AreaInfoType.Recreations.Recreation.RecreationDetails recreationDetails;
            @XmlElement(name = "DescriptiveText")
            protected String descriptiveText;
            @XmlAttribute(name = "Code")
            protected String code;
            @XmlAttribute(name = "Name")
            protected String name;
            @XmlAttribute(name = "ProximityCode")
            protected String proximityCode;
            @XmlAttribute(name = "Included")
            protected Boolean included;
            @XmlAttribute(name = "ExistsCode")
            protected String existsCode;
            @XmlAttribute(name = "Sort")
            @XmlSchemaType(name = "nonNegativeInteger")
            protected BigInteger sort;
            @XmlAttribute(name = "CodeDetail")
            protected String codeDetail;
            @XmlAttribute(name = "Removal")
            protected Boolean removal;
            @XmlAttribute(name = "ID")
            protected String id;

            /**
             * Gets the value of the contact property.
             * 
             * @return
             *     possible object is
             *     {@link ContactInfoType }
             *     
             */
            public ContactInfoType getContact() {
                return contact;
            }

            /**
             * Sets the value of the contact property.
             * 
             * @param value
             *     allowed object is
             *     {@link ContactInfoType }
             *     
             */
            public void setContact(ContactInfoType value) {
                this.contact = value;
            }

            /**
             * Gets the value of the operationSchedules property.
             * 
             * @return
             *     possible object is
             *     {@link OperationSchedulesPlusChargeType }
             *     
             */
            public OperationSchedulesPlusChargeType getOperationSchedules() {
                return operationSchedules;
            }

            /**
             * Sets the value of the operationSchedules property.
             * 
             * @param value
             *     allowed object is
             *     {@link OperationSchedulesPlusChargeType }
             *     
             */
            public void setOperationSchedules(OperationSchedulesPlusChargeType value) {
                this.operationSchedules = value;
            }

            /**
             * Gets the value of the refPoints property.
             * 
             * @return
             *     possible object is
             *     {@link RefPointsType }
             *     
             */
            public RefPointsType getRefPoints() {
                return refPoints;
            }

            /**
             * Sets the value of the refPoints property.
             * 
             * @param value
             *     allowed object is
             *     {@link RefPointsType }
             *     
             */
            public void setRefPoints(RefPointsType value) {
                this.refPoints = value;
            }

            /**
             * Gets the value of the multimediaDescriptions property.
             * 
             * @return
             *     possible object is
             *     {@link AreaInfoType.Recreations.Recreation.MultimediaDescriptions }
             *     
             */
            public AreaInfoType.Recreations.Recreation.MultimediaDescriptions getMultimediaDescriptions() {
                return multimediaDescriptions;
            }

            /**
             * Sets the value of the multimediaDescriptions property.
             * 
             * @param value
             *     allowed object is
             *     {@link AreaInfoType.Recreations.Recreation.MultimediaDescriptions }
             *     
             */
            public void setMultimediaDescriptions(AreaInfoType.Recreations.Recreation.MultimediaDescriptions value) {
                this.multimediaDescriptions = value;
            }

            /**
             * Gets the value of the recreationDetails property.
             * 
             * @return
             *     possible object is
             *     {@link AreaInfoType.Recreations.Recreation.RecreationDetails }
             *     
             */
            public AreaInfoType.Recreations.Recreation.RecreationDetails getRecreationDetails() {
                return recreationDetails;
            }

            /**
             * Sets the value of the recreationDetails property.
             * 
             * @param value
             *     allowed object is
             *     {@link AreaInfoType.Recreations.Recreation.RecreationDetails }
             *     
             */
            public void setRecreationDetails(AreaInfoType.Recreations.Recreation.RecreationDetails value) {
                this.recreationDetails = value;
            }

            /**
             * Gets the value of the descriptiveText property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDescriptiveText() {
                return descriptiveText;
            }

            /**
             * Sets the value of the descriptiveText property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDescriptiveText(String value) {
                this.descriptiveText = value;
            }

            /**
             * Gets the value of the code property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCode() {
                return code;
            }

            /**
             * Sets the value of the code property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCode(String value) {
                this.code = value;
            }

            /**
             * Gets the value of the name property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getName() {
                return name;
            }

            /**
             * Sets the value of the name property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setName(String value) {
                this.name = value;
            }

            /**
             * Gets the value of the proximityCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getProximityCode() {
                return proximityCode;
            }

            /**
             * Sets the value of the proximityCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setProximityCode(String value) {
                this.proximityCode = value;
            }

            /**
             * Gets the value of the included property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isIncluded() {
                return included;
            }

            /**
             * Sets the value of the included property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setIncluded(Boolean value) {
                this.included = value;
            }

            /**
             * Gets the value of the existsCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getExistsCode() {
                return existsCode;
            }

            /**
             * Sets the value of the existsCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setExistsCode(String value) {
                this.existsCode = value;
            }

            /**
             * Gets the value of the sort property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getSort() {
                return sort;
            }

            /**
             * Sets the value of the sort property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setSort(BigInteger value) {
                this.sort = value;
            }

            /**
             * Gets the value of the codeDetail property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCodeDetail() {
                return codeDetail;
            }

            /**
             * Sets the value of the codeDetail property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCodeDetail(String value) {
                this.codeDetail = value;
            }

            /**
             * Gets the value of the removal property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isRemoval() {
                return removal;
            }

            /**
             * Sets the value of the removal property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setRemoval(Boolean value) {
                this.removal = value;
            }

            /**
             * Gets the value of the id property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getID() {
                return id;
            }

            /**
             * Sets the value of the id property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setID(String value) {
                this.id = value;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}MultimediaDescriptionsType">
             *       &lt;attribute name="Location" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
             *       &lt;attribute name="RefDirectionTo" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" />
             *     &lt;/extension>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class MultimediaDescriptions
                extends MultimediaDescriptionsType
            {

                @XmlAttribute(name = "Location")
                protected Boolean location;
                @XmlAttribute(name = "RefDirectionTo")
                protected Boolean refDirectionTo;

                /**
                 * Gets the value of the location property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Boolean }
                 *     
                 */
                public boolean isLocation() {
                    if (location == null) {
                        return false;
                    } else {
                        return location;
                    }
                }

                /**
                 * Sets the value of the location property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Boolean }
                 *     
                 */
                public void setLocation(Boolean value) {
                    this.location = value;
                }

                /**
                 * Gets the value of the refDirectionTo property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Boolean }
                 *     
                 */
                public boolean isRefDirectionTo() {
                    if (refDirectionTo == null) {
                        return true;
                    } else {
                        return refDirectionTo;
                    }
                }

                /**
                 * Sets the value of the refDirectionTo property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Boolean }
                 *     
                 */
                public void setRefDirectionTo(Boolean value) {
                    this.refDirectionTo = value;
                }

            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="RecreationDetail" maxOccurs="unbounded">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="Description" type="{http://www.opentravel.org/OTA/2003/05}ParagraphType" maxOccurs="5" minOccurs="0"/>
             *                 &lt;/sequence>
             *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CodeInfoGroup"/>
             *                 &lt;attribute name="Code" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
             *                 &lt;attribute name="ExistsCode" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "recreationDetail"
            })
            public static class RecreationDetails {

                @XmlElement(name = "RecreationDetail", required = true)
                protected List<AreaInfoType.Recreations.Recreation.RecreationDetails.RecreationDetail> recreationDetail;

                /**
                 * Gets the value of the recreationDetail property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the recreationDetail property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getRecreationDetail().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link AreaInfoType.Recreations.Recreation.RecreationDetails.RecreationDetail }
                 * 
                 * 
                 */
                public List<AreaInfoType.Recreations.Recreation.RecreationDetails.RecreationDetail> getRecreationDetail() {
                    if (recreationDetail == null) {
                        recreationDetail = new ArrayList<AreaInfoType.Recreations.Recreation.RecreationDetails.RecreationDetail>();
                    }
                    return this.recreationDetail;
                }


                /**
                 * <p>Java class for anonymous complex type.
                 * 
                 * <p>The following schema fragment specifies the expected content contained within this class.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;sequence>
                 *         &lt;element name="Description" type="{http://www.opentravel.org/OTA/2003/05}ParagraphType" maxOccurs="5" minOccurs="0"/>
                 *       &lt;/sequence>
                 *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CodeInfoGroup"/>
                 *       &lt;attribute name="Code" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
                 *       &lt;attribute name="ExistsCode" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "description"
                })
                public static class RecreationDetail {

                    @XmlElement(name = "Description")
                    protected List<ParagraphType> description;
                    @XmlAttribute(name = "Code")
                    protected String code;
                    @XmlAttribute(name = "ExistsCode")
                    protected String existsCode;
                    @XmlAttribute(name = "CodeDetail")
                    protected String codeDetail;
                    @XmlAttribute(name = "Removal")
                    protected Boolean removal;

                    /**
                     * Gets the value of the description property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the description property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getDescription().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link ParagraphType }
                     * 
                     * 
                     */
                    public List<ParagraphType> getDescription() {
                        if (description == null) {
                            description = new ArrayList<ParagraphType>();
                        }
                        return this.description;
                    }

                    /**
                     * Gets the value of the code property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getCode() {
                        return code;
                    }

                    /**
                     * Sets the value of the code property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setCode(String value) {
                        this.code = value;
                    }

                    /**
                     * Gets the value of the existsCode property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getExistsCode() {
                        return existsCode;
                    }

                    /**
                     * Sets the value of the existsCode property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setExistsCode(String value) {
                        this.existsCode = value;
                    }

                    /**
                     * Gets the value of the codeDetail property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getCodeDetail() {
                        return codeDetail;
                    }

                    /**
                     * Sets the value of the codeDetail property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setCodeDetail(String value) {
                        this.codeDetail = value;
                    }

                    /**
                     * Gets the value of the removal property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link Boolean }
                     *     
                     */
                    public Boolean isRemoval() {
                        return removal;
                    }

                    /**
                     * Sets the value of the removal property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Boolean }
                     *     
                     */
                    public void setRemoval(Boolean value) {
                        this.removal = value;
                    }

                }

            }

        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}RefPointsType">
     *       &lt;attribute name="LastUpdated" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class RefPoints
        extends RefPointsType
    {

        @XmlAttribute(name = "LastUpdated")
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar lastUpdated;

        /**
         * Gets the value of the lastUpdated property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getLastUpdated() {
            return lastUpdated;
        }

        /**
         * Sets the value of the lastUpdated property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setLastUpdated(XMLGregorianCalendar value) {
            this.lastUpdated = value;
        }

    }

}
