package tester;

import static com.app.utils.Utils.*;
import static com.app.utils.Collection.*;
import java.util.*;
import com.app.core.Voulenteers;
import java.util.ArrayList;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
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
			   System.out.println("3) Quit");
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
			   case 3:{
				   exit=true; 
				   try (ObjectOutputStream out = 
							new ObjectOutputStream
							(new FileOutputStream("voulenteers.ser"))) {
						out.writeObject(l);
						System.out.println("data write over...");
					} catch (Exception e) {
						e.printStackTrace();
					}
			   }
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
