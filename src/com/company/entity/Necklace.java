package com.company.entity;

public class Necklace {
	private int id;
	private String name;
	private int price;
	private String side;
	public Necklace(int id, String name, int price, String side) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.side = side;
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
	 * @return the side
	 */
	public String getSide() {
		return side;
	}
	/**
	 * @param side the side to set
	 */
	public void setSide(String side) {
		this.side = side;
	}
	@Override
	public String toString() {
		return "Necklace [id=" + id + ", name=" + name + ", price=" + price + ", side=" + side + "]";
	}
	
}
