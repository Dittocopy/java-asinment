package wed;

/*2)package assignment;*/



public class VowelorConsonant {
	// java program to check whether input
	// character is a vowel or consonant
	  // Function to find whether an input
    // character is vowel or not
	public static void main(String[] args) {
		char ch ='i';
		if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' )
            System.out.println(ch + " is vowel");
		else
			System.out.println(ch+ "is consonant");
	}
}