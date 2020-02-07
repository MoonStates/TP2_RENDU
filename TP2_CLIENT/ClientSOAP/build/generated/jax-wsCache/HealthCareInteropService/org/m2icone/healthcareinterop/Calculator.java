
package org.m2icone.healthcareinterop;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour calculator complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="calculator">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="operation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="integer1" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="integer2" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "calculator", propOrder = {
    "operation",
    "integer1",
    "integer2"
})
public class Calculator {

    protected String operation;
    protected int integer1;
    protected int integer2;

    /**
     * Obtient la valeur de la propriété operation.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperation() {
        return operation;
    }

    /**
     * Définit la valeur de la propriété operation.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperation(String value) {
        this.operation = value;
    }

    /**
     * Obtient la valeur de la propriété integer1.
     * 
     */
    public int getInteger1() {
        return integer1;
    }

    /**
     * Définit la valeur de la propriété integer1.
     * 
     */
    public void setInteger1(int value) {
        this.integer1 = value;
    }

    /**
     * Obtient la valeur de la propriété integer2.
     * 
     */
    public int getInteger2() {
        return integer2;
    }

    /**
     * Définit la valeur de la propriété integer2.
     * 
     */
    public void setInteger2(int value) {
        this.integer2 = value;
    }

}
