package com.xworkz.constructor.boot;

import com.xworkz.constructor.things.Developer;

public class DeveloperRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Developer java= new Developer();
	System.out.println("************Default Values******************");
	System.out.println("Name:"+java.name);
	System.out.println("Brand:"+java.education);
	System.out.println("Price:"+java.experience);
	System.out.println("Flavor:"+java.salary);
	System.out.println("Flavor:"+java.company);
	
	java.name="Manoj G";
	java.education="B.E";
	java.experience="Fresher";
	java.salary=30000;
	java.company="Google";
	
	System.out.println("************After Instantiation******************");
	System.out.println("Name:"+java.name);
	System.out.println("Brand:"+java.education);
	System.out.println("Price:"+java.experience);
	System.out.println("Flavor:"+java.salary);
	System.out.println("Flavor:"+java.company);
	}


	
}
