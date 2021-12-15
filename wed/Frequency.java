package wed;

public class Frequency{
	
     public static void main(String[] args) {  
    	 
    	String str = "Hello I am suraj Mondal 1223";  
        int[] freq = new int[str.length()];   
        
        //Converts given string into character array
        char string[] = str.toCharArray();     
          
        for(int x = 0; x <str.length(); x++) {  
            freq[x] = 1;  
            for(int y = x+1; y <str.length(); y++) {  
                if(string[x] == string[y]) {  
                    
                	freq[x]++;  
                    
                	//Set string[j] to 0 to avoid printing visited character   
                    string[y] = '0';
                }  
            }  
        }
          
        //Displays the each character and their corresponding frequency
        
        System.out.println("frequencies of their corresponding Characters");  
        for(int i = 0; i <freq.length; i++) {  
            if(string[i] != ' ' && string[i] != '0')  
                System.out.println(freq[i] + "-" + string[i]);  
        }  
    }  
}  