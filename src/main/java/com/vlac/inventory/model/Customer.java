package com.vlac.inventory.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

//@Data
@Entity
public class Customer implements Serializable{

	/**
	 * Serial Version UID
	 */
	private static final long serialVersionUID = -2274409234047503792L;

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private String customerID;
	public String getCustomerID() {
		return customerID;
	}



	public void setCustomerID(String customerID) {
		this.customerID = customerID;
	}



	public String getCustomerName() {
		return customerName;
	}



	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}



	public String getCustomerAddress() {
		return customerAddress;
	}



	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}



	public Integer getContactNumber() {
		return contactNumber;
	}



	public void setContactNumber(Integer contactNumber) {
		this.contactNumber = contactNumber;
	}



	private String customerName;
	private String customerAddress;
	private Integer contactNumber;
	
	

	/**
	 * Default Constructor
	 */
	public Customer() {
		super();
	}



	/**
	 * @param contactNumber
	 * @param customerID
	 * @param customerName
	 * @param customerAddress
	 */
	public Customer(Integer contactNumber, String customerID, String customerName, String customerAddress) {
		super();
		this.contactNumber = contactNumber;
		this.customerID = customerID;
		this.customerName = customerName;
		this.customerAddress = customerAddress;
	}
	
}
