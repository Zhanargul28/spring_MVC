package tester;

import static com.app.utils.Collection.populatedata;
import static com.app.utils.Utils.*;
import java.util.*;
import com.app.core.Developers;
import java.util.ArrayList;
public class Tester {

	public static void main(String[] args) throws Exception{
		Scanner sc=new Scanner(System.in);
		try {
		ArrayList <Developers> devArray = populatedata();
		 boolean exit=false;
		 while(!exit){
		   try {
			   System.out.println("Menu");
			   System.out.println("1) Developer Registration");
			   System.out.println("2) Developer Details");
			   System.out.println("3) Developers Filter by Role");
			   System.out.println("4) Developers Filter by Role & Experience");
			   System.out.println("5) Quit");
			   System.out.println("Please enter the option");
			   switch(sc.nextInt()){
			   case 1:
				   System.out.println("Enter Developer details " +
			   "\nemail, password, firstName, lastName " +
						   "\ncountryOfResidence, countryOfCitizenship, phoneNumber " +
			   "\npreferredSalary select {USD, RUB, EUR, KZT} " +
						   "\npreferredRole select {WebFrontend, WebBackend, Fullstack, Mobile, MachineLearning, Research} " +
			   "\nenglishProficiency select {Great, Average, Basic}, yearsOfExperience " +
						   "\nyearsOfRemoteExperience");
				   Developers dev = new Developers(sc.next(), sc.next(), sc.next(), sc.next(), sc.next(), sc.next(), sc.next(), sc.next(), sc.next(), 
						   sc.next(), sc.nextInt(),sc.nextInt());
				   devArray.add(dev);	
				   break;
			   case 2:
				   System.out.println("To show Developer details enter id: ");
				   int id = sc.nextInt();
				   Boolean isExist = false; 
				   for(Developers item:devArray)
					   if (item.getId().equals(id)) {
						   System.out.println(item);
						   isExist = true;
				           break;
					   }
				   if(!isExist)System.out.println("This id is not exist...");
		           break;   
			   case 3:
				   System.out.println("To show Developers enter role: ");
				   String role = sc.next();
				   for (Developers s : filterByRole(role, devArray)) {
		                System.out.println(s);
		            }
		           break; 
			   case 4:
				   System.out.println("To show Developers enter Role & Experience > : ");
				   for (Developers s : filterByRoleExperience(sc.next(), sc.nextInt(), devArray)) {
		                System.out.println(s);
		            }
		           break;
			   case 5:
				   exit=true; 
			   }
		  } catch (Exception e) {
				e.printStackTrace();
			}
			  }
			} finally {
				if(sc!=null)
				sc.close();
				}
		
	}
}
