package com.app.core;

public class Developers {
	public static Integer initID;
	private Integer Id;
	static {
		initID = 1000;
	}
	private String email;
	private String password;
	private String firstName;
	private String lastName;
	private String countryOfResidence;//select all countries
	private String countryOfCitizenship;//select all countries
	private String phoneNumber;
	private String preferredSalary;//select {USD, RUB, EUR, KZT}
	private String preferredRole;//select {Web Frontend, Web Backend, Fullstack, Mobile, Machine Learning, Research}
	private String englishProficiency; //select {Great, Average, Basic}
	private Integer yearsOfExperience;
	private Integer yearsOfRemoteExperience;
	public Developers(String email, String password, String firstName, String lastName,
			String countryOfResidence, String countryOfCitizenship,
			String phoneNumber, String preferredSalary, String preferredRole,
			String englishProficiency, Integer yearsOfExperience,
			Integer yearsOfRemoteExperience) {
		super();
		this.Id = initID++;
		this.email = email;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		this.countryOfResidence = countryOfResidence;
		this.countryOfCitizenship = countryOfCitizenship;
		this.phoneNumber = phoneNumber;
		this.preferredSalary = preferredSalary;
		this.preferredRole = preferredRole;
		this.englishProficiency = englishProficiency;
		this.yearsOfExperience = yearsOfExperience;
		this.yearsOfRemoteExperience = yearsOfRemoteExperience;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getCountryOfResidence() {
		return countryOfResidence;
	}
	public void setCountryOfResidence(String countryOfResidence) {
		this.countryOfResidence = countryOfResidence;
	}
	public String getCountryOfCitizenship() {
		return countryOfCitizenship;
	}
	public void setCountryOfCitizenship(String countryOfCitizenship) {
		this.countryOfCitizenship = countryOfCitizenship;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getPreferredSalary() {
		return preferredSalary;
	}
	public void setPreferredSalary(String preferredSalary) {
		this.preferredSalary = preferredSalary;
	}
	public String getPreferredRole() {
		return preferredRole;
	}
	public void setPreferredRole(String preferredRole) {
		this.preferredRole = preferredRole;
	}
	public String getEnglishProficiency() {
		return englishProficiency;
	}
	public void setEnglishProficiency(String englishProficiency) {
		this.englishProficiency = englishProficiency;
	}
	public Integer getYearsOfExperience() {
		return yearsOfExperience;
	}
	public void setYearsOfExperience(Integer yearsOfExperience) {
		this.yearsOfExperience = yearsOfExperience;
	}
	public Integer getYearsOfRemoteExperience() {
		return yearsOfRemoteExperience;
	}
	public void setYearsOfRemoteExperience(Integer yearsOfRemoteExperience) {
		this.yearsOfRemoteExperience = yearsOfRemoteExperience;
	}
	public Integer getId() {
		return Id;
	}
	@Override
	public String toString() {
		return "Developers [Id=" + Id + ", email=" + email + ", firstName="
				+ firstName + ", lastName=" + lastName
				+ ", \ncountryOfResidence=" + countryOfResidence
				+ ", countryOfCitizenship=" + countryOfCitizenship
				+ ", \nphoneNumber=" + phoneNumber + ", preferredSalary="
				+ preferredSalary + ", preferredRole=" + preferredRole
				+ ", englishProficiency=" + englishProficiency
				+ ", \nyearsOfExperience=" + yearsOfExperience
				+ ", yearsOfRemoteExperience=" + yearsOfRemoteExperience + "]";
	}
	
	
	
}
