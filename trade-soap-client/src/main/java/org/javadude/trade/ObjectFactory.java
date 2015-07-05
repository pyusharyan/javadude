
package org.javadude.trade;

import java.math.BigInteger;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.javadude.trade package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ValidationStatus_QNAME = new QName("www.javadude.org/trade", "validationStatus");
    private final static QName _TradeName_QNAME = new QName("www.javadude.org/trade", "tradeName");
    private final static QName _ProductId_QNAME = new QName("www.javadude.org/trade", "productId");
    private final static QName _ProductName_QNAME = new QName("www.javadude.org/trade", "productName");
    private final static QName _Price_QNAME = new QName("www.javadude.org/trade", "price");
    private final static QName _TradeSource_QNAME = new QName("www.javadude.org/trade", "tradeSource");
    private final static QName _YearOfManufacture_QNAME = new QName("www.javadude.org/trade", "yearOfManufacture");
    private final static QName _TradeMarket_QNAME = new QName("www.javadude.org/trade", "tradeMarket");
    private final static QName _TradePrice_QNAME = new QName("www.javadude.org/trade", "tradePrice");
    private final static QName _Manufacturer_QNAME = new QName("www.javadude.org/trade", "manufacturer");
    private final static QName _TradeId_QNAME = new QName("www.javadude.org/trade", "tradeId");
    private final static QName _Status_QNAME = new QName("www.javadude.org/trade", "status");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.javadude.trade
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link InsertTradeRequest }
     * 
     */
    public InsertTradeRequest createInsertTradeRequest() {
        return new InsertTradeRequest();
    }

    /**
     * Create an instance of {@link Validation }
     * 
     */
    public Validation createValidation() {
        return new Validation();
    }

    /**
     * Create an instance of {@link InsertTradeResponse }
     * 
     */
    public InsertTradeResponse createInsertTradeResponse() {
        return new InsertTradeResponse();
    }

    /**
     * Create an instance of {@link Transaction }
     * 
     */
    public Transaction createTransaction() {
        return new Transaction();
    }

    /**
     * Create an instance of {@link Product }
     * 
     */
    public Product createProduct() {
        return new Product();
    }

    /**
     * Create an instance of {@link Trade }
     * 
     */
    public Trade createTrade() {
        return new Trade();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "www.javadude.org/trade", name = "validationStatus")
    public JAXBElement<String> createValidationStatus(String value) {
        return new JAXBElement<String>(_ValidationStatus_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "www.javadude.org/trade", name = "tradeName")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createTradeName(String value) {
        return new JAXBElement<String>(_TradeName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "www.javadude.org/trade", name = "productId")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createProductId(String value) {
        return new JAXBElement<String>(_ProductId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "www.javadude.org/trade", name = "productName")
    public JAXBElement<String> createProductName(String value) {
        return new JAXBElement<String>(_ProductName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "www.javadude.org/trade", name = "price")
    public JAXBElement<BigInteger> createPrice(BigInteger value) {
        return new JAXBElement<BigInteger>(_Price_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "www.javadude.org/trade", name = "tradeSource")
    public JAXBElement<String> createTradeSource(String value) {
        return new JAXBElement<String>(_TradeSource_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "www.javadude.org/trade", name = "yearOfManufacture")
    public JAXBElement<XMLGregorianCalendar> createYearOfManufacture(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_YearOfManufacture_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "www.javadude.org/trade", name = "tradeMarket")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createTradeMarket(String value) {
        return new JAXBElement<String>(_TradeMarket_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "www.javadude.org/trade", name = "tradePrice")
    public JAXBElement<BigInteger> createTradePrice(BigInteger value) {
        return new JAXBElement<BigInteger>(_TradePrice_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "www.javadude.org/trade", name = "manufacturer")
    public JAXBElement<String> createManufacturer(String value) {
        return new JAXBElement<String>(_Manufacturer_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "www.javadude.org/trade", name = "tradeId")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createTradeId(String value) {
        return new JAXBElement<String>(_TradeId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "www.javadude.org/trade", name = "status")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createStatus(String value) {
        return new JAXBElement<String>(_Status_QNAME, String.class, null, value);
    }

}
