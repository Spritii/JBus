package twodarray;

public class JBus {
	static int index = 0;
	static int objCount = 0;
	private final String name = "jbus";
	private final String owner = "Hrishi Chaphekar";
	private final int regNo = 6463454;
	private String hq = "Deccan Pune";
	
	private User[] db = new User[5];

	private JBus()
	{
		
	}
	
	public static JBus createJBus()
	{
		if(objCount == 0)
		{
			objCount++;
			System.out.println("Object created!");
			return new JBus();
		}
		System.out.println("Object already created!");
		return null;
	}
	public String getName()
	{
		return name;
	}
	public String getOwner()
	{
		return owner;
	}
	public int getRegNo()
	{
		return regNo;
	}
	public String getHq()
	{
		return hq;
	}
	public void printDB()
	{
		for(int i = 0 ; i< db.length ; i++)
		{
			if(db[i] != null)
			{
				System.out.println(db[i]);
			}
		}
		System.out.println("-------------------------------------------------------------------------------------------------");
	}
	public void setHq(String hq)
	{
		this.hq = hq;
	}
	
	public void addUser(String name, int age, char gender, long phno,String email, long adhaar) 
	{
		if(!checkUser(name, age, gender, phno, email, adhaar)) {
			if(index==0 || index<db.length-1)
			{
				db[index] = new User(name ,age ,gender , phno , email, adhaar);
				index++;
			}
			else 
			{
				User updated [] = new User[2*db.length];
				for(int i = 0; i<db.length ; i++)
				{
					updated[i] = db[i];
				}
				db = updated;
				
				db[index] = new User(name , age, gender , phno, email , adhaar);
				index++;
			}
			System.out.println("User added!");
		}
		else
		{
			System.out.println("User already present in DB");
		}
	}
		
	public void search(String name,int age,  char gender , long phno ,String email ,long adhaar)
	{
		if(checkUser(name, age, gender, phno, email, adhaar))
		{
			System.out.println("User Found");
		}
		else
		{
			System.out.println("User not found");
		}
	}
	

	public void update(String name,int age,  char gender , long phno ,String email ,long adhaar)
	{

		if(checkUser(name, age, gender, phno, email, adhaar))
		{
			for(int i = 0; i<db.length ; i++)
			{
				if((db[i] != null &&
			            db[i].phno == phno &&
			            db[i].name.equals(name) &&
			            db[i].age == age &&
			            db[i].gender == gender &&
			            db[i].email.equals(email) &&
			            db[i].adhaar == adhaar))
				{
					this.db[i].phno=888888888L;
				}
			}
		}
		else
		{
			System.out.println("User not found");
		}
	}
	
	public void deleteData(String name,int age,  char gender , long phno ,String email ,long adhaar)
	{

		if(checkUser(name, age, gender, phno, email, adhaar))
		{
			for(int i = 0; i<db.length ; i++)
			{
				if((db[i] != null &&
			            db[i].phno == phno &&
			            db[i].name.equals(name) &&
			            db[i].age == age &&
			            db[i].gender == gender &&
			            db[i].email.equals(email) &&
			            db[i].adhaar == adhaar))
				{
					this.db[i]=null;
				}
			}
		}
		else
		{
			System.out.println("User not found");
		}
	}
	
	
	private boolean checkUser(String name,int age,  char gender , long phno ,String email ,long adhaar)
	{
		User u = new User(name, age, gender, phno, email, adhaar);
		for(int i = 0; i<db.length; i++)
		{
			if(db[i] == null)
			{
				return false;
			}
			else if(db[i].equals(u))
			{
				return true;
			}
		}
		return false;
	}
	
	public void arrangeByGender()
	{
		int start = -1, end = index;
		while(start<=end)
		{
			do {
				start++;
			}while (db[start]!=null && db[start].gender!='m');
			do{
				end--;				
			}while(end >= 0 && db[end].gender !='f' );
			if(start >= end)
			{
				break;				
			}
			User temp = db[start];
			db[start] = db[end];
			db[end] = temp;
			
		}
	}
	
	public void sortByAgeOfGender()
	{
		arrangeByGender();
		int start = 0, end = 0;
		for(int i = 0 ; i<index ; i++)
		{
			if(db[i].gender=='M') 
			{
				end = i - 1;
				break;
			}
		}
//		System.out.println(start);
//		System.out.println(end);
		for(int i = 0; i<end ;i++)
		{
			for(int j = 0; j < end-i; j++)
			{
				if(db[j].age>db[j+1].age)
				{
					User temp = db[j];
					db[j] = db[j+1];
					db[j+1] = temp;
				}
			}
		}
	}
}
