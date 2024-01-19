package com.grant.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table
public class Item {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String trackingId;
	private String senderName;
	private String totalFreight;
	private String departedTime;
	private String destination;
	private String status;
	private String comment;
	
	
	public Item() {
		super();
	}


	public Item(Long id, String trackingId, String senderName, String totalFreight, String departedTime,
			String destination, String status, String comment) {
		super();
		this.id = id;
		this.trackingId = trackingId;
		this.senderName = senderName;
		this.totalFreight = totalFreight;
		this.departedTime = departedTime;
		this.destination = destination;
		this.status = status;
		this.comment = comment;
	}




	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public String getTrackingId() {
		return trackingId;
	}

	public void setTrackingId(String trackingId) {
		this.trackingId = trackingId;
	}

	public String getSenderName() {
		return senderName;
	}



	public void setSenderName(String senderName) {
		this.senderName = senderName;
	}



	public String getTotalFreight() {
		return totalFreight;
	}



	public void setTotalFreight(String totalFreight) {
		this.totalFreight = totalFreight;
	}



	public String getDepartedTime() {
		return departedTime;
	}



	public void setDepartedTime(String departedTime) {
		this.departedTime = departedTime;
	}



	public String getDestination() {
		return destination;
	}



	public void setDestination(String destination) {
		this.destination = destination;
	}



	public String getStatus() {
		return status;
	}



	public void setStatus(String status) {
		this.status = status;
	}



	public String getComment() {
		return comment;
	}



	public void setComment(String comment) {
		this.comment = comment;
	}
	
	
	
}
