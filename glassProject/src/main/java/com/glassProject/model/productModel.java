package com.glassProject.model;

public class productModel extends abtractModel<productModel> {
	private Long productId;
	private String productCode;
	private String productName;
	private String metaTile;
	private String description;
	private String productImage;
	private float price;
	private float promotionPrice;
	private boolean includeVAT;
	private int quantity;
	private Long categoryId;
	private String detail;
	private int warranty;
	private String metaKeywords;
	private String metaDescription;

	private int viewCounts;

	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public String getProductCode() {
		return productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
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

	public String getProductImage() {
		return productImage;
	}

	public void setProductImage(String productImage) {
		this.productImage = productImage;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public float getPromotionPrice() {
		return promotionPrice;
	}

	public void setPromotionPrice(float promotionPrice) {
		this.promotionPrice = promotionPrice;
	}

	public boolean isIncludeVAT() {
		return includeVAT;
	}

	public void setIncludeVAT(boolean includeVAT) {
		this.includeVAT = includeVAT;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Long getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Long categoryId) {
		this.categoryId = categoryId;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public int getWarranty() {
		return warranty;
	}

	public void setWarranty(int warranty) {
		this.warranty = warranty;
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

	public int getViewCounts() {
		return viewCounts;
	}

	public void setViewCounts(int viewCounts) {
		this.viewCounts = viewCounts;
	}

}
