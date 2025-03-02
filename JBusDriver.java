//package twodarray;
//
//import java.util.Scanner;
//
//public class JBusDriver {
//
//	public static void main(String[] args) {
//		
//		JBus j = JBus.createJBus();
//		Scanner sc=new Scanner(System.in);
//		j.addUser("Hrishi",25,'M',8765432109l,"hc@gmail.com",123456789);
//		j.addUser("Ishu",19,'F',9588432109l,"ishu@gmail.com",129588789);
//		j.addUser("Abhi",20,'M',8765434455l,"abhi@gmail.com",144556789);
//		j.addUser("Varsha",26,'F',8733442109l,"vb@gmail.com",800756789);
//		j.addUser("Sarthak",21,'M',8762211109l,"sg@gmail.com",1234221189);
//		j.addUser("Ashwini",26,'F',8767788109l,"aj@gmail.com",1237788789);
//		
//		j.printDB();
//		
//		j.sortByAgeOfGender();
//		
//		j.printDB();
//		j.search("Varsha",26,'F',8733442109l,"vb@gmail.com",800756789);
//		
//		j.update("Sarthak",21,'M',8762211109l,"sg@gmail.com",1234221189);
//		j.printDB();
//		
//		j.deleteData("Ashwini",26,'F',8767788109l,"aj@gmail.com",1237788789);
//		j.printDB();
//	}
//
//}
//

package twodarray;

import java.util.Scanner;

public class JBusDriver {

    public static void main(String[] args) {
        JBus j = JBus.createJBus(); // Assuming JBus has a static method to create an instance
        Scanner sc = new Scanner(System.in);
//        System.out.println("-------------------------------------------------------------");
        while(true)
        {
        	System.out.println("----------------------JBus Application------------------------");
            System.out.println("1.Add the Data\n2.Update the data\n3.Delete the data\n4.Search the data\n5.Details of Passengers\n6.Display Sored Passengers by Gender\n7.Exit");
            System.out.println("-------------------------------------------------------------");
            System.out.println("Select the Option you want to perform");
            int ch=sc.nextInt();
            switch(ch)
            {
            	case 1:
            	{

            		System.out.println("How many users do you want to add?");
                    int numberOfUsers = sc.nextInt(); // Get the number of users
                    sc.nextLine(); // Consume the leftover newline

                    for (int i = 0; i < numberOfUsers; i++) {
                        System.out.println("Enter details for User " + (i + 1));
                        sc.nextLine();
                        System.out.print("Enter Name: ");
                        String name = sc.nextLine();

                        System.out.print("Enter Age: ");
                        int age = sc.nextInt();

                        System.out.print("Enter Gender (M/F): ");
                        char gender = sc.next().charAt(0);

                        System.out.print("Enter Phone Number: ");
                        long phno = sc.nextLong();

                        System.out.print("Enter Email: ");
                        sc.nextLine(); // Consume leftover newline
                        String email = sc.nextLine();

                        System.out.print("Enter Aadhaar Number: ");
                        long adhaar = sc.nextLong();
                        sc.nextLine(); // Consume leftover newline

                        // Add the user to the database
                        j.addUser(name, age, gender, phno, email, adhaar);
                    }
            	}
                    break;
                    
            	case 2:
            	{
            		System.out.println("\nEnter details of the user to update (new phone number):");
            		sc.nextLine();
        	        System.out.print("Enter Name: ");
        	        String updateName = sc.nextLine();
        	        System.out.print("Enter Age: ");
        	        int updateAge = sc.nextInt();
        	        System.out.print("Enter Gender (M/F): ");
        	        char updateGender = sc.next().charAt(0);
        	        System.out.print("Enter Old Phone Number: ");
        	        long oldPhno = sc.nextLong();
        	        System.out.print("Enter Email: ");
        	        sc.nextLine(); // Consume leftover newline
        	        String updateEmail = sc.nextLine();
        	        System.out.print("Enter Aadhaar Number: ");
        	        long updateAdhaar = sc.nextLong();
        	        System.out.print("Enter New Phone Number: ");
//        	        long newPhno = sc.nextLong();
//        	        sc.nextLine(); // Consume leftover newline

        	        j.update(updateName, updateAge, updateGender, oldPhno, updateEmail, updateAdhaar);
            	}   
            	        break;
            		
            	case 3:
            	{
            		System.out.println("\nEnter details of the user to delete:");
                    sc.nextLine();
                    System.out.print("Enter Name: ");
                    String deleteName = sc.nextLine();
                    System.out.print("Enter Age: ");
                    int deleteAge = sc.nextInt();
                    System.out.print("Enter Gender (M/F): ");
                    char deleteGender = sc.next().charAt(0);
                    System.out.print("Enter Phone Number: ");
                    long deletePhno = sc.nextLong();
                    System.out.print("Enter Email: ");
                    sc.nextLine(); // Consume leftover newline
                    String deleteEmail = sc.nextLine();
                    System.out.print("Enter Aadhaar Number: ");
                    long deleteAdhaar = sc.nextLong();

                    j.deleteData(deleteName, deleteAge, deleteGender, deletePhno, deleteEmail, deleteAdhaar);
            	}
            	break;
            	
            	case 4:
            	{
            		System.out.println("\nEnter details of the user to search:");
                    sc.nextLine();
                    System.out.print("Enter Name: ");
                    String Name = sc.nextLine();
                    System.out.print("Enter Age: ");
                    int Age = sc.nextInt();
                    System.out.print("Enter Gender (M/F): ");
                    char Gender = sc.next().charAt(0);
                    System.out.print("Enter Phone Number: ");
                    long Phno = sc.nextLong();
                    System.out.print("Enter Email: ");
                    sc.nextLine(); // Consume leftover newline
                    String Email = sc.nextLine();
                    System.out.print("Enter Aadhaar Number: ");
                    long Adhaar = sc.nextLong();
                    
                    j.search(Name, Age, Gender, Phno, Email, Adhaar);
            	}
            	break;
            	
            	case 5:
            		j.printDB();
            		break;
            		
            	case 6:
            		j.sortByAgeOfGender();
            		j.printDB();
            		break;
            	
            	case 7:
            		System.exit(0);
            		break;
            		
            	default:
            		System.out.println("Choose Only above option");
            }
        }
//        
//        System.out.println("\nDatabase after adding users:");
//        j.printDB();
//
//        // Example: Update user
//       
//        System.out.println("\nDatabase after updating:");
//        j.printDB();
//
//        // Example: Delete user
//        
//        System.out.println("\nDatabase after deleting:");
    }
}

