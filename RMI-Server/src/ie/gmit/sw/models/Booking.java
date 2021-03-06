//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.11.07 at 08:10:38 PM GMT 
//


package ie.gmit.sw.models;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Booking complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Booking">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="bookingId" use="required" type="{http://sw.gmit.ie/models/}BookingId" />
 *       &lt;attribute name="vehicle_id" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="cust_id" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="bookingNumber" use="required" type="{http://sw.gmit.ie/models/}BookingNumber" />
 *       &lt;attribute name="startDate" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="endDate" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Booking")
@XmlRootElement
public class Booking implements Serializable{

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@XmlAttribute(name = "bookingId", required = true)
    protected int bookingId;
    @XmlAttribute(name = "vehicle_id", required = true)
    protected int vehicleId;
    @XmlAttribute(name = "cust_id", required = true)
    protected int custId;
    @XmlAttribute(name = "bookingNumber")
    protected String bookingNumber;
    @XmlAttribute(name = "startDate", required = true)
    protected String startDate;
    @XmlAttribute(name = "endDate", required = true)
    protected String endDate;

    /**
     * Gets the value of the bookingId property.
     * 
     */
    public int getBookingId() {
        return bookingId;
    }

    /**
     * Sets the value of the bookingId property.
     * 
     */
    public void setBookingId(int value) {
        this.bookingId = value;
    }

    /**
     * Gets the value of the vehicleId property.
     * 
     */
    public int getVehicleId() {
        return vehicleId;
    }

    /**
     * Sets the value of the vehicleId property.
     * 
     */
    public void setVehicleId(int value) {
        this.vehicleId = value;
    }

    /**
     * Gets the value of the custId property.
     * 
     */
    public int getCustId() {
        return custId;
    }

    /**
     * Sets the value of the custId property.
     * 
     */
    public void setCustId(int value) {
        this.custId = value;
    }

    /**
     * Gets the value of the bookingNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBookingNumber() {
        return bookingNumber;
    }

    /**
     * Sets the value of the bookingNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBookingNumber(String value) {
        this.bookingNumber = value;
    }

    /**
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartDate(String value) {
        this.startDate = value;
    }

    @Override
	public String toString() {
		return "Booking [bookingId=" + bookingId + ", vehicleId=" + vehicleId + ", custId=" + custId
				+ ", bookingNumber=" + bookingNumber + ", startDate=" + startDate + ", endDate=" + endDate + "]";
	}

	/**
     * Gets the value of the endDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndDate() {
        return endDate;
    }

    /**
     * Sets the value of the endDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndDate(String value) {
        this.endDate = value;
    }

}
