package wed;

public class compare {

	public static void main(String[] args) {
		String str="hello";
		String str2="olk";
		StringBuffer str1= new StringBuffer(str);
		str.contentEquals(str1);
		System.out.print(str.contentEquals(str1));
	}

}
