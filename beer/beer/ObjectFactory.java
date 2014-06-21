
package beer;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the beer package. 
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

    private final static QName _GetBeers_QNAME = new QName("http://server/", "getBeers");
    private final static QName _GetMethodsResponse_QNAME = new QName("http://server/", "getMethodsResponse");
    private final static QName _GetCheapest_QNAME = new QName("http://server/", "getCheapest");
    private final static QName _HelloWorld_QNAME = new QName("http://server/", "HelloWorld");
    private final static QName _GetCostliestResponse_QNAME = new QName("http://server/", "getCostliestResponse");
    private final static QName _HelloWorldResponse_QNAME = new QName("http://server/", "HelloWorldResponse");
    private final static QName _GetCheapestResponse_QNAME = new QName("http://server/", "getCheapestResponse");
    private final static QName _GetMethods_QNAME = new QName("http://server/", "getMethods");
    private final static QName _GetPriceResponse_QNAME = new QName("http://server/", "getPriceResponse");
    private final static QName _GetBeersResponse_QNAME = new QName("http://server/", "getBeersResponse");
    private final static QName _GetPrice_QNAME = new QName("http://server/", "getPrice");
    private final static QName _GetCostliest_QNAME = new QName("http://server/", "getCostliest");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: beer
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetMethods }
     * 
     */
    public GetMethods createGetMethods() {
        return new GetMethods();
    }

    /**
     * Create an instance of {@link GetPriceResponse }
     * 
     */
    public GetPriceResponse createGetPriceResponse() {
        return new GetPriceResponse();
    }

    /**
     * Create an instance of {@link HelloWorldResponse }
     * 
     */
    public HelloWorldResponse createHelloWorldResponse() {
        return new HelloWorldResponse();
    }

    /**
     * Create an instance of {@link GetCheapestResponse }
     * 
     */
    public GetCheapestResponse createGetCheapestResponse() {
        return new GetCheapestResponse();
    }

    /**
     * Create an instance of {@link GetCostliest }
     * 
     */
    public GetCostliest createGetCostliest() {
        return new GetCostliest();
    }

    /**
     * Create an instance of {@link GetPrice }
     * 
     */
    public GetPrice createGetPrice() {
        return new GetPrice();
    }

    /**
     * Create an instance of {@link GetBeersResponse }
     * 
     */
    public GetBeersResponse createGetBeersResponse() {
        return new GetBeersResponse();
    }

    /**
     * Create an instance of {@link GetMethodsResponse }
     * 
     */
    public GetMethodsResponse createGetMethodsResponse() {
        return new GetMethodsResponse();
    }

    /**
     * Create an instance of {@link GetBeers }
     * 
     */
    public GetBeers createGetBeers() {
        return new GetBeers();
    }

    /**
     * Create an instance of {@link GetCheapest }
     * 
     */
    public GetCheapest createGetCheapest() {
        return new GetCheapest();
    }

    /**
     * Create an instance of {@link GetCostliestResponse }
     * 
     */
    public GetCostliestResponse createGetCostliestResponse() {
        return new GetCostliestResponse();
    }

    /**
     * Create an instance of {@link HelloWorld }
     * 
     */
    public HelloWorld createHelloWorld() {
        return new HelloWorld();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBeers }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server/", name = "getBeers")
    public JAXBElement<GetBeers> createGetBeers(GetBeers value) {
        return new JAXBElement<GetBeers>(_GetBeers_QNAME, GetBeers.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMethodsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server/", name = "getMethodsResponse")
    public JAXBElement<GetMethodsResponse> createGetMethodsResponse(GetMethodsResponse value) {
        return new JAXBElement<GetMethodsResponse>(_GetMethodsResponse_QNAME, GetMethodsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCheapest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server/", name = "getCheapest")
    public JAXBElement<GetCheapest> createGetCheapest(GetCheapest value) {
        return new JAXBElement<GetCheapest>(_GetCheapest_QNAME, GetCheapest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HelloWorld }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server/", name = "HelloWorld")
    public JAXBElement<HelloWorld> createHelloWorld(HelloWorld value) {
        return new JAXBElement<HelloWorld>(_HelloWorld_QNAME, HelloWorld.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCostliestResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server/", name = "getCostliestResponse")
    public JAXBElement<GetCostliestResponse> createGetCostliestResponse(GetCostliestResponse value) {
        return new JAXBElement<GetCostliestResponse>(_GetCostliestResponse_QNAME, GetCostliestResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HelloWorldResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server/", name = "HelloWorldResponse")
    public JAXBElement<HelloWorldResponse> createHelloWorldResponse(HelloWorldResponse value) {
        return new JAXBElement<HelloWorldResponse>(_HelloWorldResponse_QNAME, HelloWorldResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCheapestResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server/", name = "getCheapestResponse")
    public JAXBElement<GetCheapestResponse> createGetCheapestResponse(GetCheapestResponse value) {
        return new JAXBElement<GetCheapestResponse>(_GetCheapestResponse_QNAME, GetCheapestResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMethods }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server/", name = "getMethods")
    public JAXBElement<GetMethods> createGetMethods(GetMethods value) {
        return new JAXBElement<GetMethods>(_GetMethods_QNAME, GetMethods.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPriceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server/", name = "getPriceResponse")
    public JAXBElement<GetPriceResponse> createGetPriceResponse(GetPriceResponse value) {
        return new JAXBElement<GetPriceResponse>(_GetPriceResponse_QNAME, GetPriceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBeersResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server/", name = "getBeersResponse")
    public JAXBElement<GetBeersResponse> createGetBeersResponse(GetBeersResponse value) {
        return new JAXBElement<GetBeersResponse>(_GetBeersResponse_QNAME, GetBeersResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPrice }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server/", name = "getPrice")
    public JAXBElement<GetPrice> createGetPrice(GetPrice value) {
        return new JAXBElement<GetPrice>(_GetPrice_QNAME, GetPrice.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCostliest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server/", name = "getCostliest")
    public JAXBElement<GetCostliest> createGetCostliest(GetCostliest value) {
        return new JAXBElement<GetCostliest>(_GetCostliest_QNAME, GetCostliest.class, null, value);
    }

}
