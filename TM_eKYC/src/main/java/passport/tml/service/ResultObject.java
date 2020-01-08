
package passport.tml.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for resultObject complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="resultObject"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="applicationDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dateOfIssue" type="{http://service.TML.passport/}dateOfIssueObject" minOccurs="0"/&gt;
 *         &lt;element name="passportNumber" type="{http://service.TML.passport/}passportNumberObject" minOccurs="0"/&gt;
 *         &lt;element name="name" type="{http://service.TML.passport/}nameObject" minOccurs="0"/&gt;
 *         &lt;element name="typeOfApplication" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "resultObject", propOrder = {
    "applicationDate",
    "dateOfIssue",
    "passportNumber",
    "name",
    "typeOfApplication"
})
public class ResultObject {

    protected String applicationDate;
    protected DateOfIssueObject dateOfIssue;
    protected PassportNumberObject passportNumber;
    protected NameObject name;
    protected String typeOfApplication;

    /**
     * Gets the value of the applicationDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplicationDate() {
        return applicationDate;
    }

    /**
     * Sets the value of the applicationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplicationDate(String value) {
        this.applicationDate = value;
    }

    /**
     * Gets the value of the dateOfIssue property.
     * 
     * @return
     *     possible object is
     *     {@link DateOfIssueObject }
     *     
     */
    public DateOfIssueObject getDateOfIssue() {
        return dateOfIssue;
    }

    /**
     * Sets the value of the dateOfIssue property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateOfIssueObject }
     *     
     */
    public void setDateOfIssue(DateOfIssueObject value) {
        this.dateOfIssue = value;
    }

    /**
     * Gets the value of the passportNumber property.
     * 
     * @return
     *     possible object is
     *     {@link PassportNumberObject }
     *     
     */
    public PassportNumberObject getPassportNumber() {
        return passportNumber;
    }

    /**
     * Sets the value of the passportNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link PassportNumberObject }
     *     
     */
    public void setPassportNumber(PassportNumberObject value) {
        this.passportNumber = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link NameObject }
     *     
     */
    public NameObject getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link NameObject }
     *     
     */
    public void setName(NameObject value) {
        this.name = value;
    }

    /**
     * Gets the value of the typeOfApplication property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeOfApplication() {
        return typeOfApplication;
    }

    /**
     * Sets the value of the typeOfApplication property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeOfApplication(String value) {
        this.typeOfApplication = value;
    }

}
