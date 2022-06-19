package credentialservices;
import java.util.Scanner;
import credentialservices.empdata.Employee;
public class Driver {

	public static void main(String[] args) {
		System.out.println("Please Enter your first and Last Name:");
		Scanner sc1=new Scanner(System.in);
		
		String fname=sc1.next();
		String lname=sc1.next();
		
		Employee emp=new Employee(fname,lname);
		CredentialService cs=new CredentialService();
		String generatedemail;
		char[] generatedpassword;
		
		System.out.println("Please enter the department from the following:");
		System.out.println("1: Technical \n"
				+ "2. Admin \n"
				+ "3. Human Resource \n"
				+ "4. Legal");
		
		Scanner sc=new Scanner(System.in);
		int option=sc.nextInt();
		
		if(option==1)
		{
			generatedemail=cs.generateEmailAddress(emp.getFirst_Name().toLowerCase(),emp.getLast_Name().toLowerCase(),"tech");
			generatedpassword=cs.generatePassword();
			cs.showCredentials(emp, generatedemail, generatedpassword);
			
		}
		else if(option==2)
		{
			generatedemail=cs.generateEmailAddress(emp.getFirst_Name().toLowerCase(),emp.getLast_Name().toLowerCase(),"adm");
			generatedpassword=cs.generatePassword();
			cs.showCredentials(emp, generatedemail, generatedpassword);
			
		}
		else if(option==3)
		{
			generatedemail=cs.generateEmailAddress(emp.getFirst_Name().toLowerCase(),emp.getLast_Name().toLowerCase(),"hr");
			generatedpassword=cs.generatePassword();
			cs.showCredentials(emp, generatedemail, generatedpassword);
			
		}
		else if(option==4)
		{
			generatedemail=cs.generateEmailAddress(emp.getFirst_Name().toLowerCase(),emp.getLast_Name().toLowerCase(),"lg");
			generatedpassword=cs.generatePassword();
			cs.showCredentials(emp, generatedemail, generatedpassword);
			
		}
		else
		{
			System.out.println("Enter a valid Option");
		}
		
		sc.close();
		

		

	}

}
