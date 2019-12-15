package com.bharat.amity;

public class Circle 
{
	private String type;
	private int height;
	
	
	public Circle(String type)
	{
		this.type=type;
	}
	
	public Circle(int height)
	{
		this.height=height;
	}
	
	public Circle(String type,int height)
	{
		this.type=type;
		this.height=height;
	}
	
	
	
	public String getType() {
		return type;
	}
	
	public int getHeight() {
		return height;
	}

	/*
	 * public void setType(String type) { this.type = type; }
	 */

	public void draw()
	{
		System.out.println(getType()+" " + "is drawn with height"+" "+ getHeight());
System.out.println("This is tge project which is cloned from git bash "
+ "and we r going to edit it here in eclipse and going to update in bharat branch of spring core project of "
+ "bharathadpad59 and we will see it");
	}
}
