class SuperDepartment1
 
{
	public String DepartmentName()
	
	{ return "Welcome to SuperDepartment"; }
		
	public String getTodaysWork()
	
	{ return "No Work as of now"; }
		
	public String getWorkDeadline()
	
	{ return "Nil "; }
		
	public String isTodayAHoliday()
	
	{ return " Today is not a holiday"; }
		
}	

   class AdminDepartment extends SuperDepartment1
	{
		public String DepartmentName()
		
		{	return "Welcome to Admin Department ";}
		
		public String getTodaysWork()
		
		{	return "Complete your documents Submission";}
		
		public String getWorkDeadline()
		
		{   return " Complete by EOD ";}
		
	 }
   class HrDepartment  extends SuperDepartment1
    {
	    public String DepartmentName()
	    { return "Welcome to Hr Department "; }
		  
	    public String getTodaysWork()
	    { return "Fill today’s worksheet and mark your attendance"; }
	 	
	    public String getWorkDeadline()
	    { return " Complete by EOD "; }
		  
	    public String doActivity()
	    { return " team Lunch"; }
		    
     }
   class TechDepartment extends SuperDepartment1
    {
	   public String DepartmentName()
	    
	   { return " Welcome to Tech Department  "; }
		  
	    public String getTodaysWork()
	    
	    { return "Complete coding of module 1"; }
	 	
	    public String getWorkDeadline()
	    
	      { return " Complete by EOD "; }
		  
	    public String getTechStackInformation()
	     
	      { return " core Java"; }
      }


 public class SuperDepartment
 {
	 public static void main(String[] args)
		{
			// TODO Auto-generated method stub
		 SuperDepartment1 Obj1=new SuperDepartment1();
		 /*System.out.println(Obj1.DepartmentName());
		 System.out.println(Obj1.getTodaysWork());
		 System.out.println(Obj1.getWorkDeadline());
		 System.out.println(Obj1.isTodayAHoliday());*/
		 
		 
		 SuperDepartment1 Obj4=new AdminDepartment();
		 System.out.println(Obj4.DepartmentName());
		 System.out.println(Obj4.getTodaysWork());
		 System.out.println(Obj4.getWorkDeadline());
		 System.out.println(Obj4.isTodayAHoliday());
		 
		 SuperDepartment1 Obj2=new HrDepartment();
		 System.out.println(Obj2.DepartmentName());
		 System.out.println(Obj2.getTodaysWork());
		 System.out.println(Obj2.getWorkDeadline());
		 HrDepartment Obj6=new HrDepartment();
		 System.out.println(Obj6.doActivity());
		 System.out.println(Obj2.isTodayAHoliday());
		 
		 SuperDepartment1 Obj3=new TechDepartment();
		 System.out.println(Obj3.DepartmentName());
		 System.out.println(Obj3.getTodaysWork());
		 System.out.println(Obj3.getWorkDeadline());
		 TechDepartment Obj5=new TechDepartment();
		 System.out.println(Obj5.getTechStackInformation());
		 System.out.println(Obj3.isTodayAHoliday());

		} 
 }
	


