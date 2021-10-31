import java.util.*;

	public class Main {
	static Map<String,String> logincr=new HashMap<String,String>();
		
		public static Map<String, String> LogInCredentials()
		{
			
			
			logincr.put("user1","user1@123");
			logincr.put("user2","user2@123");
			logincr.put("admin","admin@123");
			return null;
			
			
		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner sc=new Scanner(System.in);
			LogInCredentials();
			System.out.println("Home page");
			System.out.println("1.Register\n2.Login");
			Admin a =new Admin();
			Guest g=new Guest();
			User u=new User();
			int ab=sc.nextInt();
			switch(ab)
			{
			case 1:
					
					//System.out.println("Account not found. Please register first...");
					
					String[] s=g.getRegistered();
					for(int i=0;i<s.length;i++)
					{
						logincr.put(s[0], s[1]);
					}
					
					System.out.println(logincr);
					System.out.println("Account created successfully");
					
				
				break;
			case 2:
				sc.nextLine();
				System.out.println("username:");
				String uname=sc.nextLine();
				System.out.println("Password:");
				String pass=sc.nextLine();
				Map<String,String> login=LogInCredentials();
				//System.out.println(login);
				
				Set<String> keys=logincr.keySet();////////get the key values from LogInCredentials and stores in keys
				Iterator<String> it=keys.iterator();///////iterate over keys(keySet)
				
				while(it.hasNext())
				{
					String username=it.next();       //////////Get keys
					
					String password=logincr.get(username);   ///////////Get values for corresponding keys
					//System.out.println(a.flag);
					if(username.equals(uname)&&password.equals(pass))
					{
						System.out.println("Logged in successfully");
						g.flag=true;
						a.flag=true;
						u.flag=true;
						
					}
					//break;
				}
				
				if(uname.contains("admin")&& a.flag==true)
			    {
			    	
			    	while(a.flag==true)
					{
			    	System.out.println("1)Add food"+"\n"+"2)View Menu"+"\n"+"3)Exit");
					int n=sc.nextInt();
					
					switch(n)
					{
					case 1:
						a.addFood();
						break;
			
					case 2:
						a.viewMenu();
						
						break;
						
					case 3:
						a.flag=false;
						break;
					
					}	
			    }
					
			    }
				if(uname.contains("user")&&u.flag==true)
				{
					a.viewMenu();
					//List<String> l2=new ArrayList<String>();
				    u.orderfood();
					u.addcart();
					
				}
				break;
			}
			
	        
		}

		}
