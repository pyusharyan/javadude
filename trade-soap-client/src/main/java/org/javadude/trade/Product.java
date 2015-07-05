
package org.javadude.trade;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for product complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="product">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="manufacturer" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *         &lt;element name="price" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *         &lt;element name="productId" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *         &lt;element name="productName" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *         &lt;element name="yearOfManufacture" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "product", propOrder = {
    "manufacturer",
    "price",
    "productId",
    "productName",
    "yearOfManufacture"
})
public class Product {

    @XmlElement(required = true)
    protected Object manufacturer;
    @XmlElement(required = true)
    protected Object price;
    @XmlElement(required = true)
    protected Object productId;
    @XmlElement(required = true)
    protected Object productName;
    @XmlElement(required = true)
    protected Object yearOfManufacture;

    /**
     * Gets the value of the manufacturer property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getManufacturer() {
        return manufacturer;
    }

    /**
     * Sets the value of the manufacturer property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setManufacturer(Object value) {
        this.manufacturer = value;
    }

    /**
     * Gets the value of the price property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getPrice() {
        return price;
    }

    /**
     * Sets the value of the price property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setPrice(Object value) {
        this.price = value;
    }

    /**
     * Gets the value of the productId property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getProductId() {
        return productId;
    }

    /**
     * Sets the value of the productId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setProductId(Object value) {
        this.productId = value;
    }

    /**
     * Gets the value of the productName property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getProductName() {
        return productName;
    }

    /**
     * Sets the value of the productName property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setProductName(Object value) {
        this.productName = value;
    }

    /**
     * Gets the value of the yearOfManufacture property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getYearOfManufacture() {
        return yearOfManufacture;
    }

    /**
     * Sets the value of the yearOfManufacture property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setYearOfManufacture(Object value) {
        this.yearOfManufacture = value;
    }

}
