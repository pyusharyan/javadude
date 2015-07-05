
package org.javadude.trade;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for trade complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="trade">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="product" type="{www.javadude.org/trade}product"/>
 *         &lt;element name="productId" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *         &lt;element name="tradeId" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *         &lt;element name="tradeMarket" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *         &lt;element name="tradeName" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *         &lt;element name="tradePrice" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *         &lt;element name="tradeSource" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "trade", propOrder = {
    "product",
    "productId",
    "status",
    "tradeId",
    "tradeMarket",
    "tradeName",
    "tradePrice",
    "tradeSource"
})
public class Trade {

    @XmlElement(required = true)
    protected Product product;
    @XmlElement(required = true)
    protected Object productId;
    @XmlElement(required = true)
    protected Object status;
    @XmlElement(required = true)
    protected Object tradeId;
    @XmlElement(required = true)
    protected Object tradeMarket;
    @XmlElement(required = true)
    protected Object tradeName;
    @XmlElement(required = true)
    protected Object tradePrice;
    @XmlElement(required = true)
    protected Object tradeSource;

    /**
     * Gets the value of the product property.
     * 
     * @return
     *     possible object is
     *     {@link Product }
     *     
     */
    public Product getProduct() {
        return product;
    }

    /**
     * Sets the value of the product property.
     * 
     * @param value
     *     allowed object is
     *     {@link Product }
     *     
     */
    public void setProduct(Product value) {
        this.product = value;
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
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setStatus(Object value) {
        this.status = value;
    }

    /**
     * Gets the value of the tradeId property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getTradeId() {
        return tradeId;
    }

    /**
     * Sets the value of the tradeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setTradeId(Object value) {
        this.tradeId = value;
    }

    /**
     * Gets the value of the tradeMarket property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getTradeMarket() {
        return tradeMarket;
    }

    /**
     * Sets the value of the tradeMarket property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setTradeMarket(Object value) {
        this.tradeMarket = value;
    }

    /**
     * Gets the value of the tradeName property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getTradeName() {
        return tradeName;
    }

    /**
     * Sets the value of the tradeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setTradeName(Object value) {
        this.tradeName = value;
    }

    /**
     * Gets the value of the tradePrice property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getTradePrice() {
        return tradePrice;
    }

    /**
     * Sets the value of the tradePrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setTradePrice(Object value) {
        this.tradePrice = value;
    }

    /**
     * Gets the value of the tradeSource property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getTradeSource() {
        return tradeSource;
    }

    /**
     * Sets the value of the tradeSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setTradeSource(Object value) {
        this.tradeSource = value;
    }

}
