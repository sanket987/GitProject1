
public class ifelse {
	
	public static void main(String[] args) 
	{
	String s1 = "sanket";
	String s2= "prashuk";
	
	int s3 = s1.length();
	int s4 = s2.length();
	if(s3>s4) {
		System.out.println("s1 is longer");
	}
	else if(s4>s3) {
		System.out.println("s2 is longer");
	}
	else {
		System.out.println("Both are same length");
	}
	}

}
