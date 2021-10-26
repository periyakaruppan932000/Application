package com.application;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Admin {
	Scanner scan=new Scanner(System.in);
	static Map<String,Double> menu=new HashMap<String,Double>();
	static boolean flag=false;
	public void viewMenu()
	{
		
		menu.put("Dosa",15.00);
		menu.put("Rice",50.00);
		
		
		Set<String> keys=menu.keySet();////////get the key values from LogInCredentials and stores in keys
		Iterator<String> it=keys.iterator();///////iterate over keys(keySet)
		
		while(it.hasNext())
		{
			String item=it.next();       //////////Get keys
			
			double price=menu.get(item);   ///////////Get values for corresponding keys
			
			System.out.println("Item: "+item+" Price: "+price);
			
		}
		
		
		
	}
	public void addFood()
	{
		System.out.println("How many items you want to add ?");
		int n=scan.nextInt();
		scan.nextLine();
		String[] food=new String[n];
		//System.out.println("Add food-price");
		for(int i=0;i<food.length;i++)
		{
			System.out.println("food");
			String f=scan.next();
			System.out.println("price");
			double p=scan.nextDouble();
			
			/*food[i]=scan.nextLine();
			String a=food[i];
			System.out.println(food[i]);
			String[] b=new String[2];
			b=a.split("-");
			System.out.println(b[1]);*/
			menu.put(f, p);
			
		}
		
		viewMenu();
		
		
	}
	/*public void addMenu(String[] food)
	{
		
		//System.out.println(food);
		
		for(int i=0;i<food.length;i++)
		{
			String a=food[i];
			System.out.println(food[i]);
			String[] b=new String[2];
			b=a.split("-");
			
			System.out.println(b);
			//menu.put(b[0], b[1]);
		}*/
	

}
