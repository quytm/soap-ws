
package com.concretepage.site_connect;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TicketingInfoRS_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TicketingInfoRS_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}TicketingInfoType">
 *       &lt;attribute name="eTicketNumber" type="{http://www.opentravel.org/OTA/2003/05}AlphaNumericStringLength1to14" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TicketingInfoRS_Type")
@XmlSeeAlso({
    com.concretepage.site_connect.PricedItineraryType.TicketingInfo.class
})
public class TicketingInfoRSType
    extends TicketingInfoType
{

    @XmlAttribute(name = "eTicketNumber")
    protected String eTicketNumber;

    /**
     * Gets the value of the eTicketNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getETicketNumber() {
        return eTicketNumber;
    }

    /**
     * Sets the value of the eTicketNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setETicketNumber(String value) {
        this.eTicketNumber = value;
    }

}
