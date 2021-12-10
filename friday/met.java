package friday;

public class met extends Thread {

	 public void start()  
	    {  
	      try {  
	          System.out.println("thread is executing now........");  
	      } catch(Exception e) {
	    	  System.out.println("hello.....");
	      }   
	    }  
	    public static void main (String[] args) {  
	        met m1= new met();  
	        m1.start();
	        m1.run();
	        m1.run();
	    }  

}
