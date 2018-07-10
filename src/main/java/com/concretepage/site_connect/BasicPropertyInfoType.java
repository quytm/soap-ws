
package com.concretepage.site_connect;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for BasicPropertyInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BasicPropertyInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="VendorMessages" type="{http://www.opentravel.org/OTA/2003/05}VendorMessagesType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Position" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}PositionGroup"/>
 *                 &lt;attribute name="MapURL" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Address" type="{http://www.opentravel.org/OTA/2003/05}AddressInfoType" minOccurs="0"/>
 *         &lt;element name="ContactNumbers" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ContactNumber" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}TelephoneInfoGroup"/>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Award" maxOccurs="5" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="Provider" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="Rating" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="RelativePosition" type="{http://www.opentravel.org/OTA/2003/05}RelativePositionType" minOccurs="0"/>
 *         &lt;element name="HotelAmenity" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="Code" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Recreation" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="Code" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Service" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="BusinessServiceCode" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Policy" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="CheckInTime" type="{http://www.w3.org/2001/XMLSchema}time" />
 *                 &lt;attribute name="CheckOutTime" type="{http://www.w3.org/2001/XMLSchema}time" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}HotelReferenceGroup"/>
 *       &lt;attribute name="HotelSegmentCategoryCode" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
 *       &lt;attribute name="SupplierIntegrationLevel" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *       &lt;attribute name="MaxGroupRoomQuantity" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *       &lt;attribute name="CurrencyCode" type="{http://www.opentravel.org/OTA/2003/05}AlphaLength3" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BasicPropertyInfoType", propOrder = {
    "vendorMessages",
    "position",
    "address",
    "contactNumbers",
    "award",
    "relativePosition",
    "hotelAmenity",
    "recreation",
    "service",
    "policy"
})
@XmlSeeAlso({
    PropertyValueMatchType.class
})
public class BasicPropertyInfoType {

    @XmlElement(name = "VendorMessages")
    protected List<VendorMessagesType> vendorMessages;
    @XmlElement(name = "Position")
    protected BasicPropertyInfoType.Position position;
    @XmlElement(name = "Address")
    protected AddressInfoType address;
    @XmlElement(name = "ContactNumbers")
    protected BasicPropertyInfoType.ContactNumbers contactNumbers;
    @XmlElement(name = "Award")
    protected List<BasicPropertyInfoType.Award> award;
    @XmlElement(name = "RelativePosition")
    protected RelativePositionType relativePosition;
    @XmlElement(name = "HotelAmenity")
    protected List<BasicPropertyInfoType.HotelAmenity> hotelAmenity;
    @XmlElement(name = "Recreation")
    protected List<BasicPropertyInfoType.Recreation> recreation;
    @XmlElement(name = "Service")
    protected List<BasicPropertyInfoType.Service> service;
    @XmlElement(name = "Policy")
    protected BasicPropertyInfoType.Policy policy;
    @XmlAttribute(name = "HotelSegmentCategoryCode")
    protected String hotelSegmentCategoryCode;
    @XmlAttribute(name = "SupplierIntegrationLevel")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger supplierIntegrationLevel;
    @XmlAttribute(name = "MaxGroupRoomQuantity")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger maxGroupRoomQuantity;
    @XmlAttribute(name = "CurrencyCode")
    protected String currencyCode;
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
     * Gets the value of the vendorMessages property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vendorMessages property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVendorMessages().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VendorMessagesType }
     * 
     * 
     */
    public List<VendorMessagesType> getVendorMessages() {
        if (vendorMessages == null) {
            vendorMessages = new ArrayList<VendorMessagesType>();
        }
        return this.vendorMessages;
    }

    /**
     * Gets the value of the position property.
     * 
     * @return
     *     possible object is
     *     {@link BasicPropertyInfoType.Position }
     *     
     */
    public BasicPropertyInfoType.Position getPosition() {
        return position;
    }

    /**
     * Sets the value of the position property.
     * 
     * @param value
     *     allowed object is
     *     {@link BasicPropertyInfoType.Position }
     *     
     */
    public void setPosition(BasicPropertyInfoType.Position value) {
        this.position = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link AddressInfoType }
     *     
     */
    public AddressInfoType getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressInfoType }
     *     
     */
    public void setAddress(AddressInfoType value) {
        this.address = value;
    }

    /**
     * Gets the value of the contactNumbers property.
     * 
     * @return
     *     possible object is
     *     {@link BasicPropertyInfoType.ContactNumbers }
     *     
     */
    public BasicPropertyInfoType.ContactNumbers getContactNumbers() {
        return contactNumbers;
    }

    /**
     * Sets the value of the contactNumbers property.
     * 
     * @param value
     *     allowed object is
     *     {@link BasicPropertyInfoType.ContactNumbers }
     *     
     */
    public void setContactNumbers(BasicPropertyInfoType.ContactNumbers value) {
        this.contactNumbers = value;
    }

    /**
     * Gets the value of the award property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the award property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAward().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BasicPropertyInfoType.Award }
     * 
     * 
     */
    public List<BasicPropertyInfoType.Award> getAward() {
        if (award == null) {
            award = new ArrayList<BasicPropertyInfoType.Award>();
        }
        return this.award;
    }

    /**
     * Gets the value of the relativePosition property.
     * 
     * @return
     *     possible object is
     *     {@link RelativePositionType }
     *     
     */
    public RelativePositionType getRelativePosition() {
        return relativePosition;
    }

    /**
     * Sets the value of the relativePosition property.
     * 
     * @param value
     *     allowed object is
     *     {@link RelativePositionType }
     *     
     */
    public void setRelativePosition(RelativePositionType value) {
        this.relativePosition = value;
    }

    /**
     * Gets the value of the hotelAmenity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hotelAmenity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHotelAmenity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BasicPropertyInfoType.HotelAmenity }
     * 
     * 
     */
    public List<BasicPropertyInfoType.HotelAmenity> getHotelAmenity() {
        if (hotelAmenity == null) {
            hotelAmenity = new ArrayList<BasicPropertyInfoType.HotelAmenity>();
        }
        return this.hotelAmenity;
    }

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
     * {@link BasicPropertyInfoType.Recreation }
     * 
     * 
     */
    public List<BasicPropertyInfoType.Recreation> getRecreation() {
        if (recreation == null) {
            recreation = new ArrayList<BasicPropertyInfoType.Recreation>();
        }
        return this.recreation;
    }

    /**
     * Gets the value of the service property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the service property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getService().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BasicPropertyInfoType.Service }
     * 
     * 
     */
    public List<BasicPropertyInfoType.Service> getService() {
        if (service == null) {
            service = new ArrayList<BasicPropertyInfoType.Service>();
        }
        return this.service;
    }

    /**
     * Gets the value of the policy property.
     * 
     * @return
     *     possible object is
     *     {@link BasicPropertyInfoType.Policy }
     *     
     */
    public BasicPropertyInfoType.Policy getPolicy() {
        return policy;
    }

    /**
     * Sets the value of the policy property.
     * 
     * @param value
     *     allowed object is
     *     {@link BasicPropertyInfoType.Policy }
     *     
     */
    public void setPolicy(BasicPropertyInfoType.Policy value) {
        this.policy = value;
    }

    /**
     * Gets the value of the hotelSegmentCategoryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHotelSegmentCategoryCode() {
        return hotelSegmentCategoryCode;
    }

    /**
     * Sets the value of the hotelSegmentCategoryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHotelSegmentCategoryCode(String value) {
        this.hotelSegmentCategoryCode = value;
    }

    /**
     * Gets the value of the supplierIntegrationLevel property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSupplierIntegrationLevel() {
        return supplierIntegrationLevel;
    }

    /**
     * Sets the value of the supplierIntegrationLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSupplierIntegrationLevel(BigInteger value) {
        this.supplierIntegrationLevel = value;
    }

    /**
     * Gets the value of the maxGroupRoomQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaxGroupRoomQuantity() {
        return maxGroupRoomQuantity;
    }

    /**
     * Sets the value of the maxGroupRoomQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaxGroupRoomQuantity(BigInteger value) {
        this.maxGroupRoomQuantity = value;
    }

    /**
     * Gets the value of the currencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrencyCode() {
        return currencyCode;
    }

    /**
     * Sets the value of the currencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrencyCode(String value) {
        this.currencyCode = value;
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


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="Provider" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="Rating" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Award {

        @XmlAttribute(name = "Provider")
        protected String provider;
        @XmlAttribute(name = "Rating")
        protected String rating;

        /**
         * Gets the value of the provider property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getProvider() {
            return provider;
        }

        /**
         * Sets the value of the provider property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setProvider(String value) {
            this.provider = value;
        }

        /**
         * Gets the value of the rating property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRating() {
            return rating;
        }

        /**
         * Sets the value of the rating property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRating(String value) {
            this.rating = value;
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
     *         &lt;element name="ContactNumber" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}TelephoneInfoGroup"/>
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
        "contactNumber"
    })
    public static class ContactNumbers {

        @XmlElement(name = "ContactNumber")
        protected List<BasicPropertyInfoType.ContactNumbers.ContactNumber> contactNumber;

        /**
         * Gets the value of the contactNumber property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the contactNumber property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getContactNumber().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link BasicPropertyInfoType.ContactNumbers.ContactNumber }
         * 
         * 
         */
        public List<BasicPropertyInfoType.ContactNumbers.ContactNumber> getContactNumber() {
            if (contactNumber == null) {
                contactNumber = new ArrayList<BasicPropertyInfoType.ContactNumbers.ContactNumber>();
            }
            return this.contactNumber;
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
         *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}TelephoneInfoGroup"/>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class ContactNumber {

            @XmlAttribute(name = "ShareSynchInd")
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            protected String shareSynchInd;
            @XmlAttribute(name = "ShareMarketInd")
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            protected String shareMarketInd;
            @XmlAttribute(name = "PhoneLocationType")
            protected String phoneLocationType;
            @XmlAttribute(name = "PhoneTechType")
            protected String phoneTechType;
            @XmlAttribute(name = "PhoneUseType")
            protected String phoneUseType;
            @XmlAttribute(name = "CountryAccessCode")
            protected String countryAccessCode;
            @XmlAttribute(name = "AreaCityCode")
            protected String areaCityCode;
            @XmlAttribute(name = "PhoneNumber", required = true)
            protected String phoneNumber;
            @XmlAttribute(name = "Extension")
            protected String extension;
            @XmlAttribute(name = "PIN")
            protected String pin;
            @XmlAttribute(name = "Remark")
            protected String remark;
            @XmlAttribute(name = "FormattedInd")
            protected Boolean formattedInd;
            @XmlAttribute(name = "DefaultInd")
            protected Boolean defaultInd;
            @XmlAttribute(name = "RPH")
            protected String rph;

            /**
             * Gets the value of the shareSynchInd property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getShareSynchInd() {
                return shareSynchInd;
            }

            /**
             * Sets the value of the shareSynchInd property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setShareSynchInd(String value) {
                this.shareSynchInd = value;
            }

            /**
             * Gets the value of the shareMarketInd property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getShareMarketInd() {
                return shareMarketInd;
            }

            /**
             * Sets the value of the shareMarketInd property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setShareMarketInd(String value) {
                this.shareMarketInd = value;
            }

            /**
             * Gets the value of the phoneLocationType property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPhoneLocationType() {
                return phoneLocationType;
            }

            /**
             * Sets the value of the phoneLocationType property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPhoneLocationType(String value) {
                this.phoneLocationType = value;
            }

            /**
             * Gets the value of the phoneTechType property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPhoneTechType() {
                return phoneTechType;
            }

            /**
             * Sets the value of the phoneTechType property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPhoneTechType(String value) {
                this.phoneTechType = value;
            }

            /**
             * Gets the value of the phoneUseType property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPhoneUseType() {
                return phoneUseType;
            }

            /**
             * Sets the value of the phoneUseType property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPhoneUseType(String value) {
                this.phoneUseType = value;
            }

            /**
             * Gets the value of the countryAccessCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCountryAccessCode() {
                return countryAccessCode;
            }

            /**
             * Sets the value of the countryAccessCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCountryAccessCode(String value) {
                this.countryAccessCode = value;
            }

            /**
             * Gets the value of the areaCityCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAreaCityCode() {
                return areaCityCode;
            }

            /**
             * Sets the value of the areaCityCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAreaCityCode(String value) {
                this.areaCityCode = value;
            }

            /**
             * Gets the value of the phoneNumber property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPhoneNumber() {
                return phoneNumber;
            }

            /**
             * Sets the value of the phoneNumber property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPhoneNumber(String value) {
                this.phoneNumber = value;
            }

            /**
             * Gets the value of the extension property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getExtension() {
                return extension;
            }

            /**
             * Sets the value of the extension property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setExtension(String value) {
                this.extension = value;
            }

            /**
             * Gets the value of the pin property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPIN() {
                return pin;
            }

            /**
             * Sets the value of the pin property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPIN(String value) {
                this.pin = value;
            }

            /**
             * Gets the value of the remark property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRemark() {
                return remark;
            }

            /**
             * Sets the value of the remark property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRemark(String value) {
                this.remark = value;
            }

            /**
             * Gets the value of the formattedInd property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isFormattedInd() {
                return formattedInd;
            }

            /**
             * Sets the value of the formattedInd property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setFormattedInd(Boolean value) {
                this.formattedInd = value;
            }

            /**
             * Gets the value of the defaultInd property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isDefaultInd() {
                return defaultInd;
            }

            /**
             * Sets the value of the defaultInd property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setDefaultInd(Boolean value) {
                this.defaultInd = value;
            }

            /**
             * Gets the value of the rph property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRPH() {
                return rph;
            }

            /**
             * Sets the value of the rph property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRPH(String value) {
                this.rph = value;
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
     *       &lt;attribute name="Code" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class HotelAmenity {

        @XmlAttribute(name = "Code")
        protected String code;

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
     *       &lt;attribute name="CheckInTime" type="{http://www.w3.org/2001/XMLSchema}time" />
     *       &lt;attribute name="CheckOutTime" type="{http://www.w3.org/2001/XMLSchema}time" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Policy {

        @XmlAttribute(name = "CheckInTime")
        @XmlSchemaType(name = "time")
        protected XMLGregorianCalendar checkInTime;
        @XmlAttribute(name = "CheckOutTime")
        @XmlSchemaType(name = "time")
        protected XMLGregorianCalendar checkOutTime;

        /**
         * Gets the value of the checkInTime property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getCheckInTime() {
            return checkInTime;
        }

        /**
         * Sets the value of the checkInTime property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setCheckInTime(XMLGregorianCalendar value) {
            this.checkInTime = value;
        }

        /**
         * Gets the value of the checkOutTime property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getCheckOutTime() {
            return checkOutTime;
        }

        /**
         * Sets the value of the checkOutTime property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setCheckOutTime(XMLGregorianCalendar value) {
            this.checkOutTime = value;
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
     *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}PositionGroup"/>
     *       &lt;attribute name="MapURL" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Position {

        @XmlAttribute(name = "MapURL")
        @XmlSchemaType(name = "anyURI")
        protected String mapURL;
        @XmlAttribute(name = "Latitude")
        protected String latitude;
        @XmlAttribute(name = "Longitude")
        protected String longitude;
        @XmlAttribute(name = "Altitude")
        protected String altitude;
        @XmlAttribute(name = "AltitudeUnitOfMeasureCode")
        protected String altitudeUnitOfMeasureCode;
        @XmlAttribute(name = "PositionAccuracy")
        protected String positionAccuracy;

        /**
         * Gets the value of the mapURL property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMapURL() {
            return mapURL;
        }

        /**
         * Sets the value of the mapURL property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMapURL(String value) {
            this.mapURL = value;
        }

        /**
         * Gets the value of the latitude property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLatitude() {
            return latitude;
        }

        /**
         * Sets the value of the latitude property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLatitude(String value) {
            this.latitude = value;
        }

        /**
         * Gets the value of the longitude property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLongitude() {
            return longitude;
        }

        /**
         * Sets the value of the longitude property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLongitude(String value) {
            this.longitude = value;
        }

        /**
         * Gets the value of the altitude property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAltitude() {
            return altitude;
        }

        /**
         * Sets the value of the altitude property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAltitude(String value) {
            this.altitude = value;
        }

        /**
         * Gets the value of the altitudeUnitOfMeasureCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAltitudeUnitOfMeasureCode() {
            return altitudeUnitOfMeasureCode;
        }

        /**
         * Sets the value of the altitudeUnitOfMeasureCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAltitudeUnitOfMeasureCode(String value) {
            this.altitudeUnitOfMeasureCode = value;
        }

        /**
         * Gets the value of the positionAccuracy property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPositionAccuracy() {
            return positionAccuracy;
        }

        /**
         * Sets the value of the positionAccuracy property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPositionAccuracy(String value) {
            this.positionAccuracy = value;
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
     *       &lt;attribute name="Code" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Recreation {

        @XmlAttribute(name = "Code")
        protected String code;

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
     *       &lt;attribute name="BusinessServiceCode" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Service {

        @XmlAttribute(name = "BusinessServiceCode")
        protected String businessServiceCode;

        /**
         * Gets the value of the businessServiceCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBusinessServiceCode() {
            return businessServiceCode;
        }

        /**
         * Sets the value of the businessServiceCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBusinessServiceCode(String value) {
            this.businessServiceCode = value;
        }

    }

}
