package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class AssestEntity {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String mediaAssest;
	private String tags;
	private String campaigns;
	private String usageRights;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMediaAssest() {
		return mediaAssest;
	}
	public void setMediaAssest(String mediaAssest) {
		this.mediaAssest = mediaAssest;
	}
	public String getTags() {
		return tags;
	}
	public void setTags(String tags) {
		this.tags = tags;
	}
	public String getCampaigns() {
		return campaigns;
	}
	public void setCampaigns(String campaigns) {
		this.campaigns = campaigns;
	}
	public String getUsageRights() {
		return usageRights;
	}
	public void setUsageRights(String usageRights) {
		this.usageRights = usageRights;
	}

}
