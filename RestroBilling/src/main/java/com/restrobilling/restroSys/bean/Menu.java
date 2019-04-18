package com.restrobilling.restroSys.bean;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Menu {

	@Id
	private int foodId;
	private String foodName;
	private int unitPrice;
	private String category;


	public int getFoodId() {
		return foodId;
	}

	public void setFoodId(int foodId) {
		this.foodId = foodId;
	}

	public String getFoodName() {
		return foodName;
	}

	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}

	public int getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(int unitPrice) {
		this.unitPrice = unitPrice;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	@Override
	public String toString() {
		return "Food [foodId=" + foodId + ", foodName=" + foodName + ", unitPrice=" + unitPrice + ", category="
				+ category + "]";
	}
}
