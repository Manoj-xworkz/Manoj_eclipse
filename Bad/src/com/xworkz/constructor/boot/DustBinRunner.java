package com.xworkz.constructor.boot;

import com.xworkz.constructor.things.DustBin;

public class DustBinRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DustBin waste=new DustBin();
		waste.capacity="10L";
		waste.material="Plastic";
		waste.location="Kitchen";
		waste.isSegrigated=true;
		waste.coverIncluded=true;
		waste.areaOfUse="Domestic";
		waste.avgWasteQuantity="12Kg";
		waste.cleanedReguraly=true;
		waste.ewasteCollected=false;
		
		System.out.println("************After Instantiation******************");
		System.out.println("Type: "+waste.type);
		System.out.println("Color: "+waste.color);
		System.out.println("Shape: "+waste.shape);
		System.out.println("Has Lid: "+waste.hasLid);
		System.out.println("Grain Size: "+waste.use);
		System.out.println("Use: "+waste.use);
		System.out.println("No of Dustbin: "+waste.noofDustbin);
		System.out.println("Is Regular: "+waste.isRegular);
		System.out.println("Disposal Interval: "+waste.disposalInterval);
		System.out.println("Capacity: "+waste.capacity);
		System.out.println("Material: "+waste.material);
		System.out.println("Location: "+waste.location);
		System.out.println("Is Segrigated: "+waste.isSegrigated);
		System.out.println("Cover Included: "+waste.coverIncluded);
		System.out.println("Area Of Use: "+waste.areaOfUse);
		System.out.println("Avg Waste Quantity: "+waste.avgWasteQuantity);
		System.out.println("Cleaned Reguraly: "+waste.cleanedReguraly);
		System.out.println("E-waste Collected: "+waste.ewasteCollected);

	}

}
