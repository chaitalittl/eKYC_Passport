
package passport.tml.service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the passport.tml.service package. 
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

    private final static QName _OTPRequest_QNAME = new QName("http://service.TML.passport/", "OTPRequest");
    private final static QName _OTPResponse_QNAME = new QName("http://service.TML.passport/", "OTPResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: passport.tml.service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link OTPRequestObject }
     * 
     */
    public OTPRequestObject createOTPRequestObject() {
        return new OTPRequestObject();
    }

    /**
     * Create an instance of {@link OTPResponseObject }
     * 
     */
    public OTPResponseObject createOTPResponseObject() {
        return new OTPResponseObject();
    }

    /**
     * Create an instance of {@link ResultObject }
     * 
     */
    public ResultObject createResultObject() {
        return new ResultObject();
    }

    /**
     * Create an instance of {@link DateOfIssueObject }
     * 
     */
    public DateOfIssueObject createDateOfIssueObject() {
        return new DateOfIssueObject();
    }

    /**
     * Create an instance of {@link PassportNumberObject }
     * 
     */
    public PassportNumberObject createPassportNumberObject() {
        return new PassportNumberObject();
    }

    /**
     * Create an instance of {@link NameObject }
     * 
     */
    public NameObject createNameObject() {
        return new NameObject();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OTPRequestObject }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link OTPRequestObject }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.TML.passport/", name = "OTPRequest")
    public JAXBElement<OTPRequestObject> createOTPRequest(OTPRequestObject value) {
        return new JAXBElement<OTPRequestObject>(_OTPRequest_QNAME, OTPRequestObject.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OTPResponseObject }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link OTPResponseObject }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.TML.passport/", name = "OTPResponse")
    public JAXBElement<OTPResponseObject> createOTPResponse(OTPResponseObject value) {
        return new JAXBElement<OTPResponseObject>(_OTPResponse_QNAME, OTPResponseObject.class, null, value);
    }

}
