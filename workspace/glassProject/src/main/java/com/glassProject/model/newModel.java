package com.glassProject.model;

import java.sql.Timestamp;

public class newModel extends abtractModel<newModel> {
	private Long newId;
	private String title;
	private String metaTile;
	private String description;
	private String newImage;
	private Long newCategoryId;
	private String detal;
	private String metaKeywords;
	private String metaDescription;
	private Timestamp topHot;
	private int viewCount;
	private String tagId;

	public Long getNewId() {
		return newId;
	}

	public void setNewId(Long newId) {
		this.newId = newId;
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

	public String getNewImage() {
		return newImage;
	}

	public void setNewImage(String newImage) {
		this.newImage = newImage;
	}

	public Long getNewCategoryId() {
		return newCategoryId;
	}

	public void setNewCategoryId(Long newCategoryId) {
		this.newCategoryId = newCategoryId;
	}

	public String getDetal() {
		return detal;
	}

	public void setDetal(String detal) {
		this.detal = detal;
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

	public Timestamp getTopHot() {
		return topHot;
	}

	public void setTopHot(Timestamp topHot) {
		this.topHot = topHot;
	}

	public int getViewCount() {
		return viewCount;
	}

	public void setViewCount(int viewCount) {
		this.viewCount = viewCount;
	}

	public String getTagId() {
		return tagId;
	}

	public void setTagId(String tagId) {
		this.tagId = tagId;
	}

}
