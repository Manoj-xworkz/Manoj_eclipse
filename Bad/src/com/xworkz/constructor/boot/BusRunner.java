package com.xworkz.constructor.boot;

import com.xworkz.constructor.things.Bus;

public class BusRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bus ksrtc= new Bus();
		System.out.println("************Default Values******************");
		System.out.println("Bus No:"+ksrtc.no);
		System.out.println("Starting Point:"+ksrtc.starting);
		System.out.println("Destination Point:"+ksrtc.destination);
		
		ksrtc.no=8965;
		ksrtc.starting="Banglore";
		ksrtc.destination="Shimoga";
		
		System.out.println("************After Instantiation******************");
		System.out.println("Bus No:"+ksrtc.no);
		System.out.println("Starting Point:"+ksrtc.starting);
		System.out.println("Destination Point:"+ksrtc.destination);

	}

}
