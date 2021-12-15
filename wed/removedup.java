package wed;

public class removedup {

	public static String unique(String s)
    {
        String str = new String();
        int len = s.length();
         
        for (int i = 0; i < len; i++)
        {
            
            char c = s.charAt(i);
             
            if (str.indexOf(c) < 0)
            {
                str += c;
            }
        }
         
        return str;
    }
 
    public static void main(String[] args)
    {
        String s = "hello i am suraj hello suraj";
         
        System.out.println(unique(s));
    }
}
