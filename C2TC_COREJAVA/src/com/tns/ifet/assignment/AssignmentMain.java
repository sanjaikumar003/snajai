package com.tns.ifet.assignment;
import com.tns.ifet.assignment.Manager; 
import com.tns.ifet.assignment.Developer; 
import com.tns.ifet.assignment.EmployeeUtillities;

public class AssignmentMain {
		    public static void main(String[] args) { 
	        Manager manager = new Manager("John", 101, 90000, "Sales"); 
	        Developer developer = new Developer("Alice", 102, 80000, "Java"); 
	        EmployeeUtillities.printEmployeeDetails(manager); 
	        EmployeeUtillities.printEmployeeDetails(developer); 
	    } 
	} 