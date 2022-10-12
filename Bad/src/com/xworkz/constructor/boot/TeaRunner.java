package com.xworkz.constructor.boot;

import com.xworkz.constructor.things.Tea;

public class TeaRunner {

	public static void main(String[] args) {
		
		
		Tea kadak=new Tea();
		
		kadak.originatedPlace="Assam";
		kadak.strongLevel="Light";
		kadak.quantity="1Kg";
		kadak.bussinessScale="Medium";
		kadak.sugarLevel="Light";
		kadak.fssaiApproved=true;
		kadak.leafShape="Long Narrow";
		kadak.aroma="Weak";
		kadak.steamingTime=10;
		
		
		System.out.println("************After Instantiation******************");
		System.out.println("Brand: "+kadak.brand);
		System.out.println("Type: "+kadak.type);
		System.out.println("Color: "+kadak.color);
		System.out.println("Price: "+kadak.price);
		System.out.println("Leaf Size: "+kadak.leafSize);
		System.out.println("Is Famous: "+kadak.isFamous);
		System.out.println("Packing Type: "+kadak.packingType);
		System.out.println("Manufacturing Date: "+kadak.mfd);
		System.out.println("Expiry Date: "+kadak.expDate);
		System.out.println("Originated Place: "+kadak.originatedPlace);
		System.out.println("Strong Level: "+kadak.strongLevel);
		System.out.println("Quantity: "+kadak.quantity);
		System.out.println("Bussiness Scale: "+kadak.bussinessScale);
		System.out.println("Sugar Level: "+kadak.sugarLevel);
		System.out.println("Fssai Approved: "+kadak.fssaiApproved);
		System.out.println("Leaf Shape: "+kadak.leafShape);
		System.out.println("Aroma: "+kadak.aroma);
		System.out.println("Steaming Time: "+kadak.steamingTime+"Sec");

	}

}
