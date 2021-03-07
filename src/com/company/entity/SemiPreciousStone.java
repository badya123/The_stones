package com.company.entity;

import com.company.entity.interfaces.IStone;

public class SemiPreciousStone implements IStone {
	private int id;
	private String name;
	private String type;
	private int price;
	private int necklaceId;
	private double weight;
	public SemiPreciousStone(int id, String name, String type, int price, int necklaceId, double weight) {
		super();
		this.id = id;
		this.name = name;
		this.type = type;
		this.price = price;
		this.necklaceId = necklaceId;
		this.weight = weight;
	}
	
	@Override
	public double getWeight() {
		return this.weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}
	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}
	/**
	 * @return the price
	 */
	public int getPrice() {
		return price;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(int price) {
		this.price = price;
	}
	/**
	 * @return the necklaceId
	 */
	public int getNecklaceId() {
		return necklaceId;
	}
	/**
	 * @param necklaceId the necklaceId to set
	 */
	public void setNecklaceId(int necklaceId) {
		this.necklaceId = necklaceId;
	}
	@Override
	public String toString() {
		return "SemiPreciousStone [id=" + id + ", name=" + name + ", type=" + type + ", price=" + price
				+ ", necklaceId=" + necklaceId + "]";
	}
	
	 

}
