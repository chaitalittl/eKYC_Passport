
package passport.tml.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dateOfIssueObject complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dateOfIssueObject"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="dispatchedOnFromSource" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dateOfIssueMatch" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dateOfIssueObject", propOrder = {
    "dispatchedOnFromSource",
    "dateOfIssueMatch"
})
public class DateOfIssueObject {

    protected String dispatchedOnFromSource;
    protected String dateOfIssueMatch;

    /**
     * Gets the value of the dispatchedOnFromSource property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDispatchedOnFromSource() {
        return dispatchedOnFromSource;
    }

    /**
     * Sets the value of the dispatchedOnFromSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDispatchedOnFromSource(String value) {
        this.dispatchedOnFromSource = value;
    }

    /**
     * Gets the value of the dateOfIssueMatch property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateOfIssueMatch() {
        return dateOfIssueMatch;
    }

    /**
     * Sets the value of the dateOfIssueMatch property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateOfIssueMatch(String value) {
        this.dateOfIssueMatch = value;
    }

}
