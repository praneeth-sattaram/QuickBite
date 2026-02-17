package com.food.QuickBite.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Address {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private double latitude;
	private double longitude;
	private String flatNumber;
	private String floor;
	private String buildingName;
	private String street;
	private String area;
	private String landmark;
	private String city;
	private String district;
	private String state;
	private String country;
	private int pincode;
	private String addressType;
	private boolean isDefault;
	public Address(int id, double latitude, double longitude, String flatNumber, String floor, String buildingName,
			String street, String area, String landmark, String city, String district, String state, String country,
			int pincode, String addressType, boolean isDefault) {
		super();
		this.id = id;
		this.latitude = latitude;
		this.longitude = longitude;
		this.flatNumber = flatNumber;
		this.floor = floor;
		this.buildingName = buildingName;
		this.street = street;
		this.area = area;
		this.landmark = landmark;
		this.city = city;
		this.district = district;
		this.state = state;
		this.country = country;
		this.pincode = pincode;
		this.addressType = addressType;
		this.isDefault = isDefault;
	}
	public Address() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getLatitude() {
		return latitude;
	}
	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}
	public double getLongitude() {
		return longitude;
	}
	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}
	public String getFlatNumber() {
		return flatNumber;
	}
	public void setFlatNumber(String flatNumber) {
		this.flatNumber = flatNumber;
	}
	public String getFloor() {
		return floor;
	}
	public void setFloor(String floor) {
		this.floor = floor;
	}
	public String getBuildingName() {
		return buildingName;
	}
	public void setBuildingName(String buildingName) {
		this.buildingName = buildingName;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getLandmark() {
		return landmark;
	}
	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public String getAddressType() {
		return addressType;
	}
	public void setAddressType(String addressType) {
		this.addressType = addressType;
	}
	public boolean isDefault() {
		return isDefault;
	}
	public void setDefault(boolean isDefault) {
		this.isDefault = isDefault;
	}
	@Override
	public String toString() {
		return "Address [id=" + id + ", latitude=" + latitude + ", longitude=" + longitude + ", flatNumber="
				+ flatNumber + ", floor=" + floor + ", buildingName=" + buildingName + ", street=" + street + ", area="
				+ area + ", landmark=" + landmark + ", city=" + city + ", district=" + district + ", state=" + state
				+ ", country=" + country + ", pincode=" + pincode + ", addressType=" + addressType + ", isDefault="
				+ isDefault + "]";
	}
	
	

}