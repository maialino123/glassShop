package com.glassProject.model;

public class aboutModel extends abtractModel<aboutModel> {
	private Long aboutId;
	private String title;
	private String metaTile;
	private String description;
	private String image;
	private String detail;
	private String metaKeywords;
	private String metaDescription;


	public Long getAboutId() {
		return aboutId;
	}

	public void setAboutId(Long aboutId) {
		this.aboutId = aboutId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getMetaTile() {
		return metaTile;
	}

	public void setMetaTile(String metaTile) {
		this.metaTile = metaTile;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public String getMetaKeywords() {
		return metaKeywords;
	}

	public void setMetaKeywords(String metaKeywords) {
		this.metaKeywords = metaKeywords;
	}

	public String getMetaDescription() {
		return metaDescription;
	}

	public void setMetaDescription(String metaDescription) {
		this.metaDescription = metaDescription;
	}

}
