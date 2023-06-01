package com.jsp.beanFactory;

public class Pen {
	String brand;
	String color;
	int price;
	
	 public Pen(String brand, String color, int price) {
		 this.brand=brand;
		 this.color=color;
		 this.price = price;
		 
	 }
		 public void print(){
			 System.out.println(brand);
			 System.out.println(color);
			 System.out.println(price);
			
		 }
		 
	 }
	


