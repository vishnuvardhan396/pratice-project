class TestFinallyBlock{  
	public static void main(String args[]){  
	try{
	int number=25/5;  
	System.out.println(number);  
	  }  
	catch(NullPointerException e)
	  {
		System.out.println(e);
	  }  
	finally
		{
System.out.println("The Execution of final block always happen ");
		}  
	System.out.println("after final the rest of the code....");
	  } 
	}  

