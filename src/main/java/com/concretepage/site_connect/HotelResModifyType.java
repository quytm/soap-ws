
package com.concretepage.site_connect;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HotelResModifyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HotelResModifyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="HotelResModify" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}HotelReservationType">
 *                 &lt;sequence>
 *                   &lt;element name="Verification" maxOccurs="5" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{http://www.opentravel.org/OTA/2003/05}VerificationType">
 *                           &lt;sequence>
 *                             &lt;element name="CurrentStateReservation" type="{http://www.opentravel.org/OTA/2003/05}HotelReservationType" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/extension>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="RoutingHops" type="{http://www.opentravel.org/OTA/2003/05}RoutingHopType" minOccurs="0"/>
 *         &lt;element name="WrittenConfInst" type="{http://www.opentravel.org/OTA/2003/05}WrittenConfInstType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HotelResModifyType", propOrder = {
    "hotelResModify",
    "routingHops",
    "writtenConfInst"
})
public class HotelResModifyType {

    @XmlElement(name = "HotelResModify", required = true)
    protected List<HotelResModifyType.HotelResModify> hotelResModify;
    @XmlElement(name = "RoutingHops")
    protected RoutingHopType routingHops;
    @XmlElement(name = "WrittenConfInst")
    protected WrittenConfInstType writtenConfInst;

    /**
     * Gets the value of the hotelResModify property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hotelResModify property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHotelResModify().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HotelResModifyType.HotelResModify }
     * 
     * 
     */
    public List<HotelResModifyType.HotelResModify> getHotelResModify() {
        if (hotelResModify == null) {
            hotelResModify = new ArrayList<HotelResModifyType.HotelResModify>();
        }
        return this.hotelResModify;
    }

    /**
     * Gets the value of the routingHops property.
     * 
     * @return
     *     possible object is
     *     {@link RoutingHopType }
     *     
     */
    public RoutingHopType getRoutingHops() {
        return routingHops;
    }

    /**
     * Sets the value of the routingHops property.
     * 
     * @param value
     *     allowed object is
     *     {@link RoutingHopType }
     *     
     */
    public void setRoutingHops(RoutingHopType value) {
        this.routingHops = value;
    }

    /**
     * Gets the value of the writtenConfInst property.
     * 
     * @return
     *     possible object is
     *     {@link WrittenConfInstType }
     *     
     */
    public WrittenConfInstType getWrittenConfInst() {
        return writtenConfInst;
    }

    /**
     * Sets the value of the writtenConfInst property.
     * 
     * @param value
     *     allowed object is
     *     {@link WrittenConfInstType }
     *     
     */
    public void setWrittenConfInst(WrittenConfInstType value) {
        this.writtenConfInst = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}HotelReservationType">
     *       &lt;sequence>
     *         &lt;element name="Verification" maxOccurs="5" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}VerificationType">
     *                 &lt;sequence>
     *                   &lt;element name="CurrentStateReservation" type="{http://www.opentravel.org/OTA/2003/05}HotelReservationType" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/extension>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "verification"
    })
    public static class HotelResModify
        extends HotelReservationType
    {

        @XmlElement(name = "Verification")
        protected List<HotelResModifyType.HotelResModify.Verification> verification;

        /**
         * Gets the value of the verification property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the verification property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getVerification().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link HotelResModifyType.HotelResModify.Verification }
         * 
         * 
         */
        public List<HotelResModifyType.HotelResModify.Verification> getVerification() {
            if (verification == null) {
                verification = new ArrayList<HotelResModifyType.HotelResModify.Verification>();
            }
            return this.verification;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}VerificationType">
         *       &lt;sequence>
         *         &lt;element name="CurrentStateReservation" type="{http://www.opentravel.org/OTA/2003/05}HotelReservationType" minOccurs="0"/>
         *       &lt;/sequence>
         *     &lt;/extension>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "currentStateReservation"
        })
        public static class Verification
            extends VerificationType
        {

            @XmlElement(name = "CurrentStateReservation")
            protected HotelReservationType currentStateReservation;

            /**
             * Gets the value of the currentStateReservation property.
             * 
             * @return
             *     possible object is
             *     {@link HotelReservationType }
             *     
             */
            public HotelReservationType getCurrentStateReservation() {
                return currentStateReservation;
            }

            /**
             * Sets the value of the currentStateReservation property.
             * 
             * @param value
             *     allowed object is
             *     {@link HotelReservationType }
             *     
             */
            public void setCurrentStateReservation(HotelReservationType value) {
                this.currentStateReservation = value;
            }

        }

    }

}
