package com.pluralsight.springbatch.patientbatchloader.domain;

import java.io.Serializable;

/**
 * The Class PatientRecord.
 */
public class PatientRecord implements Serializable {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 8554152838365789226L;

	/** The source id. */
	private String sourceId;

	/** The first name. */
	private String firstName;

	/** The middle initial. */
	private String middleInitial;

	/** The last name. */
	private String lastName;

	/** The email address. */
	private String emailAddress;

	/** The phone number. */
	private String phoneNumber;

	/** The street. */
	private String street;

	/** The city. */
	private String city;

	/** The state. */
	private String state;

	/** The zip. */
	private String zip;

	/** The birth date. */
	private String birthDate;

	/** The action. */
	private String action;

	/** The ssn. */
	private String ssn;

	/**
	 * Instantiates a new patient record.
	 *
	 * @param sourceId      the source id
	 * @param firstName     the first name
	 * @param middleInitial the middle initial
	 * @param lastName      the last name
	 * @param emailAddress  the email address
	 * @param phoneNumber   the phone number
	 * @param street        the street
	 * @param city          the city
	 * @param state         the state
	 * @param zip           the zip
	 * @param birthDate     the birth date
	 * @param action        the action
	 * @param ssn           the ssn
	 */
	public PatientRecord(String sourceId, String firstName, String middleInitial, String lastName, String emailAddress,
			String phoneNumber, String street, String city, String state, String zip, String birthDate, String action,
			String ssn) {
		super();
		this.sourceId = sourceId;
		this.firstName = firstName;
		this.middleInitial = middleInitial;
		this.lastName = lastName;
		this.emailAddress = emailAddress;
		this.phoneNumber = phoneNumber;
		this.street = street;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.birthDate = birthDate;
		this.action = action;
		this.ssn = ssn;
	}

	/**
	 * Gets the source id.
	 *
	 * @return the source id
	 */
	public String getSourceId() {
		return sourceId;
	}

	/**
	 * Gets the first name.
	 *
	 * @return the first name
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * Gets the middle initial.
	 *
	 * @return the middle initial
	 */
	public String getMiddleInitial() {
		return middleInitial;
	}

	/**
	 * Gets the last name.
	 *
	 * @return the last name
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * Gets the email address.
	 *
	 * @return the email address
	 */
	public String getEmailAddress() {
		return emailAddress;
	}

	/**
	 * Gets the phone number.
	 *
	 * @return the phone number
	 */
	public String getPhoneNumber() {
		return phoneNumber;
	}

	/**
	 * Gets the street.
	 *
	 * @return the street
	 */
	public String getStreet() {
		return street;
	}

	/**
	 * Gets the city.
	 *
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * Gets the state.
	 *
	 * @return the state
	 */
	public String getState() {
		return state;
	}

	/**
	 * Gets the zip.
	 *
	 * @return the zip
	 */
	public String getZip() {
		return zip;
	}

	/**
	 * Gets the birth date.
	 *
	 * @return the birth date
	 */
	public String getBirthDate() {
		return birthDate;
	}

	/**
	 * Gets the action.
	 *
	 * @return the action
	 */
	public String getAction() {
		return action;
	}

	/**
	 * Gets the ssn.
	 *
	 * @return the ssn
	 */
	public String getSsn() {
		return ssn;
	}

	/**
	 * Sets the source id.
	 *
	 * @param sourceId the new source id
	 */
	public void setSourceId(String sourceId) {
		this.sourceId = sourceId;
	}

	/**
	 * Sets the first name.
	 *
	 * @param firstName the new first name
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * Sets the middle initial.
	 *
	 * @param middleInitial the new middle initial
	 */
	public void setMiddleInitial(String middleInitial) {
		this.middleInitial = middleInitial;
	}

	/**
	 * Sets the last name.
	 *
	 * @param lastName the new last name
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * Sets the email address.
	 *
	 * @param emailAddress the new email address
	 */
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	/**
	 * Sets the phone number.
	 *
	 * @param phoneNumber the new phone number
	 */
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	/**
	 * Sets the street.
	 *
	 * @param street the new street
	 */
	public void setStreet(String street) {
		this.street = street;
	}

	/**
	 * Sets the city.
	 *
	 * @param city the new city
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * Sets the state.
	 *
	 * @param state the new state
	 */
	public void setState(String state) {
		this.state = state;
	}

	/**
	 * Sets the zip.
	 *
	 * @param zip the new zip
	 */
	public void setZip(String zip) {
		this.zip = zip;
	}

	/**
	 * Sets the birth date.
	 *
	 * @param birthDate the new birth date
	 */
	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}

	/**
	 * Sets the action.
	 *
	 * @param action the new action
	 */
	public void setAction(String action) {
		this.action = action;
	}

	/**
	 * Sets the ssn.
	 *
	 * @param ssn the new ssn
	 */
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	/**
	 * To string.
	 *
	 * @return the string
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("PatientRecord [sourceId=");
		builder.append(sourceId);
		builder.append(", firstName=");
		builder.append(firstName);
		builder.append(", middleInitial=");
		builder.append(middleInitial);
		builder.append(", lastName=");
		builder.append(lastName);
		builder.append(", emailAddress=");
		builder.append(emailAddress);
		builder.append(", phoneNumber=");
		builder.append(phoneNumber);
		builder.append(", street=");
		builder.append(street);
		builder.append(", city=");
		builder.append(city);
		builder.append(", state=");
		builder.append(state);
		builder.append(", zip=");
		builder.append(zip);
		builder.append(", birthDate=");
		builder.append(birthDate);
		builder.append(", action=");
		builder.append(action);
		builder.append(", ssn=");
		builder.append(ssn);
		builder.append("]");
		return builder.toString();
	}

}
