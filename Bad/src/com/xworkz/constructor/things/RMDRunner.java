package com.xworkz.constructor.things;

public class RMDRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		RMD pan=new RMD();
		
		pan.originatedPlace="Pune";
		pan.causes="Mouth Cancer";
		pan.quantity="10pcs";
		pan.bussinessScale="Large";
		pan.marketShare=25;
		pan.profit=100;
		pan.mainIngredient="Arecanut";
		pan.foundedYear=1991;
		pan.revenue=100;
		
		
		System.out.println("************After Instantiation******************");
		System.out.println("Brand: "+pan.brand);
		System.out.println("Type: "+pan.type);
		System.out.println("Color: "+pan.color);
		System.out.println("Price: "+pan.price);
		System.out.println("Grain Size: "+pan.grainSize);
		System.out.println("Is Famous: "+pan.isFamous);
		System.out.println("Packing Type: "+pan.packingType);
		System.out.println("Manufacturing Date: "+pan.mfd);
		System.out.println("Expiry Date: "+pan.expDate);
		System.out.println("Originated Place: "+pan.originatedPlace);
		System.out.println("Causes: "+pan.causes);
		System.out.println("Quantity: "+pan.quantity);
		System.out.println("Bussiness Scale: "+pan.bussinessScale);
		System.out.println("Market Share: "+pan.marketShare);
		System.out.println("Profit: "+pan.profit);
		System.out.println("Main Ingredient: "+pan.mainIngredient);
		System.out.println("Founded Year: "+pan.foundedYear);
		System.out.println("Revenue: "+pan.revenue);

	}

}
