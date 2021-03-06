
package com.concretepage.site_connect;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "SiteConnectService", targetNamespace = "https://cmtpi.siteminder.com:443/siteconnect")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface SiteConnectService {


    /**
     * 
     * @param security
     * @param otaHotelResNotifRQ
     * @return
     *     returns com.concretepage.site_connect.OTAHotelResNotifRS
     */
    @WebMethod(operationName = "HotelResNotifRQ", action = "HotelResNotifRQ")
    @WebResult(name = "OTA_HotelResNotifRS", targetNamespace = "http://www.opentravel.org/OTA/2003/05", partName = "OTA_HotelResNotifRS")
    public OTAHotelResNotifRS hotelResNotifRQ(
        @WebParam(name = "Security", targetNamespace = "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd", header = true, partName = "Security")
        SecurityHeaderType security,
        @WebParam(name = "OTA_HotelResNotifRQ", targetNamespace = "http://www.opentravel.org/OTA/2003/05", partName = "OTA_HotelResNotifRQ")
        OTAHotelResNotifRQ otaHotelResNotifRQ);

    /**
     * 
     * @param otaHotelAvailRQ
     * @param security
     * @return
     *     returns com.concretepage.site_connect.OTAHotelAvailRS
     */
    @WebMethod(operationName = "HotelAvailRQ", action = "HotelAvailRQ")
    @WebResult(name = "OTA_HotelAvailRS", targetNamespace = "http://www.opentravel.org/OTA/2003/05", partName = "OTA_HotelAvailRS")
    public OTAHotelAvailRS hotelAvailRQ(
        @WebParam(name = "Security", targetNamespace = "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd", header = true, partName = "Security")
        SecurityHeaderType security,
        @WebParam(name = "OTA_HotelAvailRQ", targetNamespace = "http://www.opentravel.org/OTA/2003/05", partName = "OTA_HotelAvailRQ")
        OTAHotelAvailRQ otaHotelAvailRQ);

    /**
     * 
     * @param security
     * @param otaHotelAvailNotifRQ
     * @return
     *     returns com.concretepage.site_connect.MessageAcknowledgementType
     */
    @WebMethod(operationName = "HotelAvailNotifRQ", action = "HotelAvailNotifRQ")
    @WebResult(name = "OTA_HotelAvailNotifRS", targetNamespace = "http://www.opentravel.org/OTA/2003/05", partName = "OTA_HotelAvailNotifRS")
    public MessageAcknowledgementType hotelAvailNotifRQ(
        @WebParam(name = "Security", targetNamespace = "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd", header = true, partName = "Security")
        SecurityHeaderType security,
        @WebParam(name = "OTA_HotelAvailNotifRQ", targetNamespace = "http://www.opentravel.org/OTA/2003/05", partName = "OTA_HotelAvailNotifRQ")
        OTAHotelAvailNotifRQ otaHotelAvailNotifRQ);

    /**
     * 
     * @param security
     * @param otaHotelRateAmountNotifRQ
     * @return
     *     returns com.concretepage.site_connect.MessageAcknowledgementType
     */
    @WebMethod(operationName = "HotelRateAmountNotifRQ", action = "HotelRateAmountNotifRQ")
    @WebResult(name = "OTA_HotelRateAmountNotifRS", targetNamespace = "http://www.opentravel.org/OTA/2003/05", partName = "OTA_HotelRateAmountNotifRS")
    public MessageAcknowledgementType hotelRateAmountNotifRQ(
        @WebParam(name = "Security", targetNamespace = "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd", header = true, partName = "Security")
        SecurityHeaderType security,
        @WebParam(name = "OTA_HotelRateAmountNotifRQ", targetNamespace = "http://www.opentravel.org/OTA/2003/05", partName = "OTA_HotelRateAmountNotifRQ")
        OTAHotelRateAmountNotifRQ otaHotelRateAmountNotifRQ);

}
