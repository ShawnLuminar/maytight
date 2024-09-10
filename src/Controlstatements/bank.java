package Controlstatements;

class bank1
{
      public void withdraw() 
      {
    	System.out.println("withdraw");
    	
      }

	public void deposit()
	{
		// TODO Auto-generated method stub
		System.out.println("deposit");
	}
}   

  class sbi extends bank1
      {
    	public void sbiinterest() 
    	  {
    	    System.out.println("sbiinterest ");
          }

		public void income() 
		{
			// TODO Auto-generated method stub
			
		}
	 }
    	class hdfc extends bank1
    	{
    		public  void loan() 
    		{
    			System.out.println("hdfc loan");
    		}
    	}
    			public class bank 
    			{
    				public static void main(String[]args) 
    				{
    					sbi obj= new sbi();
    					obj.deposit();
    					obj.withdraw();
    					obj.sbiinterest();
    					hdfc objl=new hdfc();
						
						 
						objl.deposit();
    					 objl.withdraw();
    					 objl.loan();
    					
    					
    				}
    			}
    			
    		
    	
    	

		
      

    			
    			
