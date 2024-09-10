package Controlstatements;



class cars
{
      public void business() 
      {
    	System.out.println("luxurious range rover 3.00 cr");
    	
      }

	public void design() {
		// TODO Auto-generated method stub
		
	}
}     class sport extends cars
      {
    	public void performance() 
    	{
    	System.out.println("nissan gtr is available");
    	}

		public void design() {
			// TODO Auto-generated method stub
			
		}}
    	class luxury extends sport
    	{
    		public void design() 
    		{
    			System.out.println("rolls royce is beauty");
    		}}
    			public class royaldrive{
    				public static void main(String[]args) 
    				{
    					sport c= new sport();
    					c.business();
    					c.performance();
    					c.design();
    					
    					luxury l=new luxury();
    					l.design();
    					l.business();
    					l.performance();
    				}
    			public class hierarchial {
    				public static void main(String[] args) {
    					//Todo Auto-generated method stub
    					luxury ob=new luxury();
    					ob.design();
    					ob.performance();
    					
    					sport l1=new sport();
    					cars li = null;
						li.design();
    					li.business();
    				}
    			}
    			
    		
    	
    	

		
      
}
    			
    			
