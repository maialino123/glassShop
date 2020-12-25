package com.glassProject.model;

public class newCategoryModel extends abtractModel<newCategoryModel> {
	private Long newCategoryId;
	private String name;
	private String metaTitle;
	private int parentId;
	private int displayOrder;
	private String seoTitle;
	private String metaKeywords;
	private String metaDiscription;
	private boolean showOnHome;

	public Long getNewCategoryId() {
		return newCategoryId;
	}

	public void setNewCategoryId(Long newCategoryId) {
		this.newCategoryId = newCategoryId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMetaTitle() {
		return metaTitle;
	}

	public void setMetaTitle(String metaTitle) {
		this.metaTitle = metaTitle;
	}

	public int getParentId() {
		return parentId;
	}

	public void setParentId(int parentId) {
		this.parentId = parentId;
	}

	public int getDisplayOrder() {
		return displayOrder;
	}

	public void setDisplayOrder(int displayOrder) {
		this.displayOrder = displayOrder;
	}

	public String getSeoTitle() {
		return seoTitle;
	}

	public void setSeoTitle(String seoTitle) {
		this.seoTitle = seoTitle;
	}

	public String getMetaKeywords() {
		return metaKeywords;
	}

	public void setMetaKeywords(String metaKeywords) {
		this.metaKeywords = metaKeywords;
	}

	public String getMetaDiscription() {
		return metaDiscription;
	}

	public void setMetaDiscription(String metaDiscription) {
		this.metaDiscription = metaDiscription;
	}

	public boolean isShowOnHome() {
		return showOnHome;
	}

	public void setShowOnHome(boolean showOnHome) {
		this.showOnHome = showOnHome;
	}

}
