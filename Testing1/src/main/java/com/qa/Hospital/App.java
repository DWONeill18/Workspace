package com.qa.Hospital;

import java.util.ArrayList;
import java.util.HashMap;


public class App {

public static void main(String[]args) {
	
	
		
	Patient patient1 = new Patient("Jay", "medicine", 3);
	Patient patient2 = new Patient("Ian", "paracetamol", 4);
	

	System.out.println(patient1.getName());
	
	Patient.getList();
	for (int i =0; i < Patient.getList().size(); i++) {
		
		System.out.println(Patient.getList().get(i).getName());
		
	}
	
	
//	HashMap<String, Nurse> nurseMap = new HashMap<String, Nurse>();
//	
//	String nursed = "Angela";
//	
//	nurseMap.put("NurseName", nursed);
//	
//	System.out.println(nurseMap.get("NurseName"));
//	
	
	HashMap<Integer, Nurse> nurseMap = new HashMap<Integer, Nurse>();
	
	Nurse nursed1 = new Nurse(1, "Anglea", 42);
	Nurse nursed2 = new Nurse(2, "Bob", 52);
	

	nurseMap.put(1, nursed1);
	nurseMap.put(2, nursed2);
			
	
//	System.out.println(nurseMap.get("name").id);
//	System.out.println(nurseMap.get("name2").id);
//	System.out.println(nurseMap.get("name").name);
//	System.out.println(nurseMap.get("name2").name);
//	System.out.println(nurseMap.get("name").age);
//	System.out.println(nurseMap.get("name2").age);
//	System.out.println(nurseMap.get("2").age);
	System.out.println(nurseMap.get(2).name);
	
	
	
	for (int i =0; i < nursed1.size(); i++) {
		
			System.out.println(nurseMap.get(i).name);
	}
	
	}

}

	



