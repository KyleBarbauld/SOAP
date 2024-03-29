
package beer;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebService(name = "Beer", targetNamespace = "http://server/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface Beer {


    /**
     * 
     * @return
     *     returns java.util.List<java.lang.String>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getMethods", targetNamespace = "http://server/", className = "beer.GetMethods")
    @ResponseWrapper(localName = "getMethodsResponse", targetNamespace = "http://server/", className = "beer.GetMethodsResponse")
    @Action(input = "http://server/Beer/getMethodsRequest", output = "http://server/Beer/getMethodsResponse")
    public List<String> getMethods();

    /**
     * 
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "HelloWorld")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "HelloWorld", targetNamespace = "http://server/", className = "beer.HelloWorld")
    @ResponseWrapper(localName = "HelloWorldResponse", targetNamespace = "http://server/", className = "beer.HelloWorldResponse")
    @Action(input = "http://server/Beer/HelloWorldRequest", output = "http://server/Beer/HelloWorldResponse")
    public String helloWorld();

    /**
     * 
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getCheapest", targetNamespace = "http://server/", className = "beer.GetCheapest")
    @ResponseWrapper(localName = "getCheapestResponse", targetNamespace = "http://server/", className = "beer.GetCheapestResponse")
    @Action(input = "http://server/Beer/getCheapestRequest", output = "http://server/Beer/getCheapestResponse")
    public String getCheapest();

    /**
     * 
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getCostliest", targetNamespace = "http://server/", className = "beer.GetCostliest")
    @ResponseWrapper(localName = "getCostliestResponse", targetNamespace = "http://server/", className = "beer.GetCostliestResponse")
    @Action(input = "http://server/Beer/getCostliestRequest", output = "http://server/Beer/getCostliestResponse")
    public String getCostliest();

    /**
     * 
     * @param arg0
     * @return
     *     returns double
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getPrice", targetNamespace = "http://server/", className = "beer.GetPrice")
    @ResponseWrapper(localName = "getPriceResponse", targetNamespace = "http://server/", className = "beer.GetPriceResponse")
    @Action(input = "http://server/Beer/getPriceRequest", output = "http://server/Beer/getPriceResponse")
    public double getPrice(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    /**
     * 
     * @return
     *     returns java.util.List<java.lang.String>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getBeers", targetNamespace = "http://server/", className = "beer.GetBeers")
    @ResponseWrapper(localName = "getBeersResponse", targetNamespace = "http://server/", className = "beer.GetBeersResponse")
    @Action(input = "http://server/Beer/getBeersRequest", output = "http://server/Beer/getBeersResponse")
    public List<String> getBeers();

}
