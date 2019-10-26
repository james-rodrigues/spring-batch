package com.pluralsight.springbatch.patientbatchloader.domain;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

/**
 * The Class PatientEntity.
 */
@Entity
@Table(name = "patient")
public class PatientEntity implements Serializable {

	/** The id. */
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
	@SequenceGenerator(name = "sequenceGenerator")
	@Column(name = "patient_id")
	private Long id;

	/** The source id. */
	@NotNull
	@Column(name = "source_id", nullable = false)
	private String sourceId;

	/** The first name. */
	@NotNull
	@Column(name = "first_name", nullable = false)
	private String firstName;

	/** The middle initial. */
	@Column(name = "middle_initial", nullable = true)
	private String middleInitial;

	/** The last name. */
	@NotNull
	@Column(name = "last_name", nullable = false)
	private String lastName;

	/** The email address. */
	@Column(name = "email_address", nullable = true)
	private String emailAddress;

	/** The phone number. */
	@NotNull
	@Column(name = "phone_number", nullable = false)
	private String phoneNumber;

	/** The street. */
	@NotNull
	@Column(name = "street", nullable = false)
	private String street;

	/** The city. */
	@NotNull
	@Column(name = "city", nullable = false)
	private String city;

	/** The state. */
	@NotNull
	@Column(name = "state", nullable = false)
	private String state;

	/** The zip code. */
	@NotNull
	@Column(name = "zip_code", nullable = false)
	private String zipCode;

	/** The birth date. */
	@NotNull
	@Column(name = "birth_date", nullable = false)
	private LocalDate birthDate;

	/** The social security number. */
	@NotNull
	@Column(name = "social_security_number", nullable = false)
	private String socialSecurityNumber;

	/**
	 * Instantiates a new patient entity.
	 */
	public PatientEntity() {

	}

	/**
	 * Instantiates a new patient entity.
	 *
	 * @param sourceId the source id
	 * @param firstName the first name
	 * @param middleInitial the middle initial
	 * @param lastName the last name
	 * @param emailAddress the email address
	 * @param phoneNumber the phone number
	 * @param street the street
	 * @param city the city
	 * @param state the state
	 * @param zipCode the zip code
	 * @param birthDate the birth date
	 * @param socialSecurityNumber the social security number
	 */
	public PatientEntity(@NotNull String sourceId, @NotNull String firstName, String middleInitial,
			@NotNull String lastName, String emailAddress, @NotNull String phoneNumber, @NotNull String street,
			@NotNull String city, @NotNull String state, @NotNull String zipCode, @NotNull LocalDate birthDate,
			@NotNull String socialSecurityNumber) {
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
		this.zipCode = zipCode;
		this.birthDate = birthDate;
		this.socialSecurityNumber = socialSecurityNumber;
	}

	/**
	 * Instantiates a new patient entity.
	 *
	 * @param id the id
	 * @param sourceId the source id
	 * @param firstName the first name
	 * @param middleInitial the middle initial
	 * @param lastName the last name
	 * @param emailAddress the email address
	 * @param phoneNumber the phone number
	 * @param street the street
	 * @param city the city
	 * @param state the state
	 * @param zipCode the zip code
	 * @param birthDate the birth date
	 * @param socialSecurityNumber the social security number
	 */
	public PatientEntity(Long id, @NotNull String sourceId, @NotNull String firstName, String middleInitial,
			@NotNull String lastName, String emailAddress, @NotNull String phoneNumber, @NotNull String street,
			@NotNull String city, @NotNull String state, @NotNull String zipCode, @NotNull LocalDate birthDate,
			@NotNull String socialSecurityNumber) {
		super();
		this.id = id;
		this.sourceId = sourceId;
		this.firstName = firstName;
		this.middleInitial = middleInitial;
		this.lastName = lastName;
		this.emailAddress = emailAddress;
		this.phoneNumber = phoneNumber;
		this.street = street;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
		this.birthDate = birthDate;
		this.socialSecurityNumber = socialSecurityNumber;
	}

	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	public Long getId() {
		return id;
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
	 * Gets the zip code.
	 *
	 * @return the zip code
	 */
	public String getZipCode() {
		return zipCode;
	}

	/**
	 * Gets the birth date.
	 *
	 * @return the birth date
	 */
	public LocalDate getBirthDate() {
		return birthDate;
	}

	/**
	 * Gets the social security number.
	 *
	 * @return the social security number
	 */
	public String getSocialSecurityNumber() {
		return socialSecurityNumber;
	}

	/**
	 * Sets the id.
	 *
	 * @param id the new id
	 */
	public void setId(Long id) {
		this.id = id;
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
	 * Sets the zip code.
	 *
	 * @param zipCode the new zip code
	 */
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	/**
	 * Sets the birth date.
	 *
	 * @param birthDate the new birth date
	 */
	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}

	/**
	 * Sets the social security number.
	 *
	 * @param socialSecurityNumber the new social security number
	 */
	public void setSocialSecurityNumber(String socialSecurityNumber) {
		this.socialSecurityNumber = socialSecurityNumber;
	}

	/**
	 * To string.
	 *
	 * @return the string
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("PatientEntity [id=");
		builder.append(id);
		builder.append(", sourceId=");
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
		builder.append(", zipCode=");
		builder.append(zipCode);
		builder.append(", birthDate=");
		builder.append(birthDate);
		builder.append(", socialSecurityNumber=");
		builder.append(socialSecurityNumber);
		builder.append("]");
		return builder.toString();
	}

}
