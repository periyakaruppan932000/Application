package com.application;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main {
	
	
	static Map<String,String> logincr=new HashMap<String,String>();
	
	public static Map<String, String> LogInCredentials()
	{
		
		
		logincr.put("user1","user1@123");
		logincr.put("user2","user2@123");
		logincr.put("admin","admin@123");
		return logincr;
		
		
	}

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//boolean flag=false;
		Guest g=new Guest();
		User u=new User();
		Admin a=new Admin();
		//g.viewMenu();
		Scanner scan=new Scanner(System.in);
		System.out.println("username:");
		String uname=scan.nextLine();
		System.out.println("Password:");
		String pass=scan.nextLine();
		Map<String,String> login=LogInCredentials();
		//System.out.println(login);
		
		Set<String> keys=logincr.keySet();////////get the key values from LogInCredentials and stores in keys
		Iterator<String> it=keys.iterator();///////iterate over keys(keySet)
		
		while(it.hasNext())
		{
			String username=it.next();       //////////Get keys
			
			String password=logincr.get(username);   ///////////Get values for corresponding keys
			
			if(username.equals(uname)&&password.equals(pass))
			{
				System.out.println("Logged in successfully");
				g.flag=true;
				
			}
			
			if(uname.contains("admin"))
			{
				
				a.flag=true;
				
				
				System.out.println("1)Add food"+"\n"+"2)View Menu");
				int n=scan.nextInt();
				
				switch(n)
				{
				case 1:
					a.addFood();
					break;
		
				case 2:
					a.viewMenu();
					
					break;
				
				}
				
			}
			
			if(g.flag==false&&a.flag==false)
			{
				System.out.println("Account not found. Please register first...");
				
				String[] s=g.getRegistered();
				for(int i=0;i<s.length;i++)
				{
					logincr.put(s[0], s[1]);
				}
				
				System.out.println(logincr);
				System.out.println("Account created successfully");
				
			}
			
		}
		
		

	}


	}


