package com.digitalworksolutions.model;
	
public class CitizenAddress {


	private String city;
	private String state;
	private String county;
	private String zipCode;
	
	private String address;
	/**
	 * @param address
	 * @param city
	 * @param state
	 * @param county
	 * @param zipCode
	 */
	public CitizenAddress(String address, String city, String state, String county, String zipCode) {
		this.address = address;
		this.city = city;
		this.state = state;
		this.county = county;
		this.zipCode = zipCode;
	}



	
	

	public CitizenAddress() {
		
	}

	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}



	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}



	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}



	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}



	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}



	/**
	 * @param state the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}



	/**
	 * @return the county
	 */
	public String getCounty() {
		return county;
	}



	/**
	 * @param county the county to set
	 */
	public void setCounty(String county) {
		this.county = county;
	}



	/**
	 * @return the zipCode
	 */
	public String getZipCode() {
		return zipCode;
	}



	/**
	 * @param zipCode the zipCode to set
	 */
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}



	
	
}
