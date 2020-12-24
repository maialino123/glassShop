package com.glassProject.model;

public class slideModel extends abtractModel<slideModel> {
	private Long slideId;
	private String image;
	private int displayOrder;
	private String link;
	private String description;
	private String metaKeywords;
	private String metaDescription;

	public Long getSlideId() {
		return slideId;
	}

	public void setSlideId(Long slideId) {
		this.slideId = slideId;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public int getDisplayOrder() {
		return displayOrder;
	}

	public void setDisplayOrder(int displayOrder) {
		this.displayOrder = displayOrder;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
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
