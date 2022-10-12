package com.xworkz.constructor.boot;

import com.xworkz.constructor.things.Cigarette;

public class CigaretteRunner {
	
	public static void main(String[] args) {
		
		Cigarette smoke=new Cigarette();
		
		smoke.originatedPlace="Nippani";
		smoke.warningLabel="Smoking Is Injurious to Health";
		smoke.quantity=10;
		smoke.bussinessScale="Large";
		smoke.toxicLevel="High";
		smoke.profitMargin=52;
		smoke.flavor="Mix";
		smoke.marketShare=70;
		
		
		System.out.println("************After Instantiation******************");
		System.out.println("Company Name: "+smoke.companyName);
		System.out.println("Brand: "+smoke.brand);
		System.out.println("Type: "+smoke.type);
		System.out.println("Color: "+smoke.color);
		System.out.println("Price: "+smoke.price);
		System.out.println("Main Ingrident: "+smoke.mainIngrident);
		System.out.println("Is Famous: "+smoke.isFamous);
		System.out.println("Packing Type: "+smoke.packingType);
		System.out.println("Manufacturing Date: "+smoke.mfd);
		System.out.println("Expiry Date: "+smoke.expDate);
		System.out.println("Originated Place: "+smoke.originatedPlace);
		System.out.println("Warning Label: "+smoke.warningLabel);
		System.out.println("Quantity: "+smoke.quantity);
		System.out.println("Bussiness Scale: "+smoke.bussinessScale);
		System.out.println("Toxic Level: "+smoke.toxicLevel);
		System.out.println("Profit Margin: "+smoke.profitMargin);
		System.out.println("Flavor: "+smoke.flavor);
		System.out.println("Market Share: "+smoke.marketShare);

		
	}

}
