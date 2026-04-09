package com.practice;
import java.util.HashMap;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 HashMap <String, Integer> studentGrades = new HashMap<>();
		 studentGrades.put("Alice", 95);
		 studentGrades.put("Bob", 82);      
		 System.out.println(studentGrades.get("Alice"));
	}

}

