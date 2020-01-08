
package passport.tml.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for passportNumberObject complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="passportNumberObject"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="passportNumberFromSource" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="passportNumberMatch" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "passportNumberObject", propOrder = {
    "passportNumberFromSource",
    "passportNumberMatch"
})
public class PassportNumberObject {

    protected String passportNumberFromSource;
    protected String passportNumberMatch;

    /**
     * Gets the value of the passportNumberFromSource property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassportNumberFromSource() {
        return passportNumberFromSource;
    }

    /**
     * Sets the value of the passportNumberFromSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassportNumberFromSource(String value) {
        this.passportNumberFromSource = value;
    }

    /**
     * Gets the value of the passportNumberMatch property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassportNumberMatch() {
        return passportNumberMatch;
    }

    /**
     * Sets the value of the passportNumberMatch property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassportNumberMatch(String value) {
        this.passportNumberMatch = value;
    }

}
