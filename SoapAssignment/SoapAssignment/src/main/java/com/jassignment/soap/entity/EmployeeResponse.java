//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.03.14 at 02:30:40 PM IST 
//


package com.jassignment.soap.entity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="employeeName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="employeeEmail" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="salary" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "employeeName",
    "employeeEmail",
    "salary"
})
@XmlRootElement(name = "EmployeeResponse")
public class EmployeeResponse {

    @XmlElement(required = true)
    protected String employeeName;
    @XmlElement(required = true)
    protected String employeeEmail;
    protected double salary;

    /**
     * Gets the value of the employeeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmployeeName() {
        return employeeName;
    }

    /**
     * Sets the value of the employeeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmployeeName(String value) {
        this.employeeName = value;
    }

    /**
     * Gets the value of the employeeEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmployeeEmail() {
        return employeeEmail;
    }

    /**
     * Sets the value of the employeeEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmployeeEmail(String value) {
        this.employeeEmail = value;
    }

    /**
     * Gets the value of the salary property.
     * 
     */
    public double getSalary() {
        return salary;
    }

    /**
     * Sets the value of the salary property.
     * 
     */
    public void setSalary(double value) {
        this.salary = value;
    }
    
    /**
     * Updates the salary of the employee.
     * 
     * @param newSalary the new salary to set
     * @return true if the salary was successfully updated, false otherwise
     */
    public boolean updateSalary(double newSalary) {
        if (newSalary >= 0) {
            this.salary = newSalary;
            return true;
        } else {
            return false;
        }
    }


}