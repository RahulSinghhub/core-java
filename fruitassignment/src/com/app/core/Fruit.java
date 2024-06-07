package com.app.core;

public class Fruit {
	private double weight;
	private String name;
	private String color;
	public static boolean fresh=true;
	public Fruit(String name,String color,double weight) {
		super();
		// TODO Auto-generated constructor stub
		this.color=color;
		this.name=name;
		this.weight=weight;
		
	}
	public Fruit() {
		super();
	}
	@Override
	public String toString() {
		return "Fruit [weight=" + weight + ", name=" + name + ", color=" + color + "freshness ="+fresh + "]";
	}
	
	
	public String taste() {
		return "no specific taste";
		
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public void setTaste(boolean fresh) {
		Fruit.fresh=fresh;
	}
	public boolean isFresh() {
		return fresh;
	}
	
	
	
	
	

}
