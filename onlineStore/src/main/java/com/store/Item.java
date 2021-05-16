package com.store;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Item {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id", nullable = false, unique = true)
    public int id;
	private String product;
	private String gender;
	private int discounted;
	private int price;
	private int discountprice;
	private int newarrival;
	
	
	public int getNewarrival() {
		return newarrival;
	}
	public void setNewarrival(int newarrival) {
		this.newarrival = newarrival;
	}
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getDiscounted() {
		return discounted;
	}
	public void setDiscounted(int discounted) {
		this.discounted = discounted;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getDiscountprice() {
		return discountprice;
	}
	public void setDiscountprice(int discountprice) {
		this.discountprice = discountprice;
	}
	
	
	
}
