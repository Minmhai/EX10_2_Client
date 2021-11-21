
package servicedclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for updateStudent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="updateStudent">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="stud" type="{http://services/}student" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "updateStudent", propOrder = {
    "stud"
})
public class UpdateStudent {

    protected Student stud;

    /**
     * Gets the value of the stud property.
     * 
     * @return
     *     possible object is
     *     {@link Student }
     *     
     */
    public Student getStud() {
        return stud;
    }

    /**
     * Sets the value of the stud property.
     * 
     * @param value
     *     allowed object is
     *     {@link Student }
     *     
     */
    public void setStud(Student value) {
        this.stud = value;
    }

}
