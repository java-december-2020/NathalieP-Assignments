package com.Nathalie.ninjagold.models;

public class Building {
	String name;
	int min;
	int max;
	Boolean canLose;
	public Building(String name, int min, int max, Boolean canLose) {
		super();
		this.name = name;
		this.min = min;
		this.max = max;
		this.canLose = canLose;
}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMin() {
		return min;
	}
	public void setMin(int min) {
		this.min = min;
	}
	public int getMax() {
		return max;
	}
	public void setMax(int max) {
		this.max = max;
	}
	public Boolean getCanLose() {
		return canLose;
	}
	public void setCanLose(Boolean canLose) {
		this.canLose = canLose;
	}
}