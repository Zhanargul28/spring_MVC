package tester;

import static com.app.utils.Utils.*;
import static com.app.utils.Collection.*;
import java.util.*;
import com.app.core.Voulenteers;
import java.util.ArrayList;
public class Tester {

	public static void main(String[] args) throws Exception{
		Scanner sc=new Scanner(System.in);
		try {
		ArrayList <Voulenteers> l= populatedata();
		 boolean exit=false;
		 while(!exit){
		   try {
			   System.out.println("Menu");
			   System.out.println("1) Voulenteer Registration");
			   System.out.println("2) Voulenteer Details");
			   System.out.println("3) Voulenteers Sort by DOB");
			   System.out.println("4) Voulenteers Sort by Name");
			   System.out.println("5) Quit");
			   System.out.println("Please enter the option");
			   switch(sc.nextInt()){
			   case 1:
				   System.out.println("Enter Voulenteer details id, name, dob:");
				   l.add(validateInputs(sc.nextInt(),sc.next(),sc.next(),l));	
				   break;
	
			   case 2:
				   System.out.println("To show Voulenteer details enter id: ");
				   int id=sc.nextInt();
				   for(Voulenteers v:l)
					   if (v.getId().equals(id)) {
						   System.out.println(v);
				           break;
					   }
				   System.out.println("This id is not exist...");
		           break;   
			   case 3:
				   for (Voulenteers s : getSortBydOB(l)) {
		                System.out.println(s);
		            }
		           break; 
			   case 4:
				   for (Voulenteers s : getSortByName(l)) {
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