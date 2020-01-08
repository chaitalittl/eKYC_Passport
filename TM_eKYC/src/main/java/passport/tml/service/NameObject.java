
package passport.tml.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for nameObject complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="nameObject"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="nameMatch" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="surnameFromPassport" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nameScore" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nameFromPassport" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "nameObject", propOrder = {
    "nameMatch",
    "surnameFromPassport",
    "nameScore",
    "nameFromPassport"
})
public class NameObject {

    protected String nameMatch;
    protected String surnameFromPassport;
    protected String nameScore;
    protected String nameFromPassport;

    /**
     * Gets the value of the nameMatch property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameMatch() {
        return nameMatch;
    }

    /**
     * Sets the value of the nameMatch property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameMatch(String value) {
        this.nameMatch = value;
    }

    /**
     * Gets the value of the surnameFromPassport property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSurnameFromPassport() {
        return surnameFromPassport;
    }

    /**
     * Sets the value of the surnameFromPassport property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSurnameFromPassport(String value) {
        this.surnameFromPassport = value;
    }

    /**
     * Gets the value of the nameScore property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameScore() {
        return nameScore;
    }

    /**
     * Sets the value of the nameScore property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameScore(String value) {
        this.nameScore = value;
    }

    /**
     * Gets the value of the nameFromPassport property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameFromPassport() {
        return nameFromPassport;
    }

    /**
     * Sets the value of the nameFromPassport property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameFromPassport(String value) {
        this.nameFromPassport = value;
    }

}
