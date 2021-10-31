import java.util.*;
	public class User {
		Admin a;
		Scanner sc=new Scanner(System.in);
		static boolean flag=false;
		static Map<String,Double> m1=new TreeMap<String,Double>();
		static List<String> l1=new ArrayList<String>();
		  public List<String> orderfood()
		{       
		     	//a.viewMenu();
		     	String s1,s2;
		     	 
		     	do
		     	{
		     	System.out.println("choose your food");
		     	s1=sc.nextLine();
		     	l1.add(s1);
		     	System.out.println("Do you want order more:y/n");
		        s2=sc.nextLine();
		     	}while(s2.equals("y"));
		     	
		     	for(String s:l1)
		     	{
		     		System.out.println(a.menu.get(s));
		     	}
		     	return l1;
		}
		 void addcart()
		 { 
			 double total=0;
			 System.out.println("items in your cart");
			 for(String s:l1)
	  	   {
				 m1.put(s,a.menu.get(s));
	  		    //System.out.println(a.menu.get(s));
				 Set<String> keys=m1.keySet();////////get the key values from LogInCredentials and stores in keys
					Iterator<String> it=keys.iterator();///////iterate over keys(keySet)
					//double total=0;
					//System.out.println("items in your cart");
					while(it.hasNext())
					{
						String item=it.next();       //////////Get keys
						System.out.println(item);
						double price=m1.get(item);
						///
						//double total=0;
						//System.out.println("items in your cart");
				        System.out.println("Item: "+item+" "+"Price: "+price);
				        total+=price;
				        System.out.println("inside Total: "+total);
				        
	  	           }
					//System.out.println("Total: "+total);
			        
	  	   }
			 System.out.println("Total: "+total);
		 }

	}


