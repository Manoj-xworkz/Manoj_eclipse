package com.xworkz.constructor.boot;

import com.xworkz.constructor.things.Chocolate;


public class ChocolateRunner {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	Chocolate silk= new Chocolate();
	System.out.println("************Default Values******************");
	System.out.println("Name:"+silk.name);
	System.out.println("Brand:"+silk.brand);
	System.out.println("Price:"+silk.price);
	System.out.println("Flavor:"+silk.flavor);
	
	silk.name="Silk";
	silk.brand="Cadbury";
	silk.price=80;
	silk.flavor="Fruit and Nut";
	
	System.out.println("************After Instantiation******************");
	System.out.println("Name:"+silk.name);
	System.out.println("Brand:"+silk.brand);
	System.out.println("Price:"+silk.price);
	System.out.println("Flavor:"+silk.flavor);
	}


}
