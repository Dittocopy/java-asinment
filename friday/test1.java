package friday;

public class test1 extends Thread{

	public void run(){  
        System.out.println("Running thread is daemon...");  
}  
public static void main (String[] args) {  
    test1 td= new test1();  
    td.start();  
    setDaemon(true);   
 }  

}
