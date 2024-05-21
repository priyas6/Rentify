package com.example.demo.Model;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class Property {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long propertyId;
	private String Location;
	public Property(long userId) {
		super();
		this.userId = userId;
	}

	private int Area;
	private int bedroom;
	private int bathroom;
	private String nearBy;
	private String Description;
	private long price;
	private long userId;
	public Property() {
		super();
	}
	public long getPropertyId() {
		return propertyId;
	}

	public void setPropertyId(long propertyId) {
		this.propertyId = propertyId;
	}

	public String getLocation() {
		return Location;
	}

	public void setLocation(String location) {
		Location = location;
	}

	public int getBedroom() {
		return bedroom;
	}

	public void setBedroom(int bedroom) {
		this.bedroom = bedroom;
	}

	public int getBathroom() {
		return bathroom;
	}

	public void setBathroom(int bathroom) {
		this.bathroom = bathroom;
	}

	public String getNearBy() {
		return nearBy;
	}

	public void setNearBy(String nearBy) {
		this.nearBy = nearBy;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	public long getPrice() {
		return price;
	}

	public void setPrice(long price) {
		this.price = price;
	}

	
	
	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public Property(long id, String location, int area, int bedroom, int bathroom, String nearBy, String description,
			long userId,long price) {
		super();
		this.propertyId = id;
		this.Location = location;
		this.setArea(area);
		this.bedroom = bedroom;
		this.bathroom = bathroom;
		this.nearBy = nearBy;
		this.Description = description;
		this.userId = userId;
		this.price=price;
	}
	public int getArea() {
		return Area;
	}

	public void setArea(int area) {
		Area = area;
	}
	
}
