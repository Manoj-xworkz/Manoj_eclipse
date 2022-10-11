package com.xworkz.constructor.boot;


import com.xworkz.constructor.things.DistrictCollector;

public class DistrictCollectorRunner {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	DistrictCollector dc= new DistrictCollector();
	System.out.println("************Default Values******************");
	System.out.println("Name:"+dc.name);
	System.out.println("Age:"+dc.age);
	System.out.println("District:"+dc.district);
	System.out.println("District:"+dc.batchNo);
	
	dc.name="Dr.Selvamani";
	dc.age=55;
	dc.district="Shimoga";
	dc.batchNo=80;
	
	System.out.println("************After Instantiation******************");
	System.out.println("Name:"+dc.name);
	System.out.println("Age:"+dc.age);
	System.out.println("District:"+dc.district);
	System.out.println("Batch No:"+dc.batchNo);

	}
}
