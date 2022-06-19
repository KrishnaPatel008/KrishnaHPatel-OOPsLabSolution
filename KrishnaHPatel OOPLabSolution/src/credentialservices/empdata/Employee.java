package credentialservices.empdata;

public class Employee 
{
   String Emp_firstName;
   String Emp_lastName;
   
   
   public Employee(String Emp_firstName,String Emp_lastName)   // parameterized construction
   {
	   this.Emp_firstName = Emp_firstName;
	   this.Emp_lastName = Emp_lastName;
   }
   
   public void setFirst_Name(String First_name)
   {
	   Emp_firstName=First_name;
	   
   }
   public void setLast_Name(String Last_name)
   {
	   Emp_lastName=Last_name;
	   
   }
   public String getFirst_Name()
   {
	   return Emp_firstName;
	 
   }
   public String getLast_Name()
   {
	   return Emp_lastName;
	 
   }
}
