package credentialservices;
import credentialservices.empdata.Employee;
import java.util.Random;


public class CredentialService 
{
	 
	public char[] generatePassword()
        {
        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz!@#$%^&*)(:+?/><0123456789";
        Random random=new Random();
        char[] password= new char[8];
        
        for(int i=0; i<8; i++)
        {
        	password[i]=chars.charAt(random.nextInt(chars.length()));
        }
        return password;
        }
		
	
	public String generateEmailAddress(String Emp_firstName,String Emp_lastName,String Department)
	{
		return Emp_firstName+Emp_lastName+"@"+Department+".abc.com";
	}
	
	public void showCredentials(Employee emp,String email, char[] generatedpassword)
	{
		System.out.println(emp.getFirst_Name()+"Your Generated Credentials are:");
		System.out.println("Email: "+ email);
		System.out.println("Password : ");
		System.out.println(generatedpassword);
	
	}
}
	
