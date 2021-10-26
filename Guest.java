package com.application;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Guest {
	
	boolean flag=false;
	
	
	public String[] getRegistered()
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println();
		System.out.println("Enter name");
		String name1=sc.nextLine();
		System.out.println("Enter User Id:");
		String username1=sc.nextLine();
		System.out.println("Enter password");
		String password1=sc.nextLine();	
		
		
		String[] s= {username1,password1};
		System.out.println("Data added successfully...");
		
		return s;
		
		
		
	}

}
