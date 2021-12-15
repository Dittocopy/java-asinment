package wed;

public class mexstring {

	static final int combination = 117;
    static char getMaxOccuringChar(String str)
    {
        
        int count[] = new int[combination];
      
        int len = str.length();
        for (int i=0; i<len; i++)
            count[str.charAt(i)]++;
      
        int max = -1; 
        char result = ' ';   
      
        
        for (int i = 0; i < len; i++) {
            if (max < count[str.charAt(i)]) {
                max = count[str.charAt(i)];
                result = str.charAt(i);
            }
        }
      
        return result;
    }
     
    public static void main(String[] args)
    {
        String str = "okletsgoforitlll,ml";
        System.out.println("Max occurring character is " +
                            getMaxOccuringChar(str));
    }
}
