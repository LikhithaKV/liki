package programs180220;

public class Palindrome {
	static String s1="";
	public static void palindrome(String s) {
		if(s.length()<=1)
			s1=s1+s;
		else {
			s1=s1+s.charAt((s.length()-1));
			palindrome(s.substring(0,s.length()-1));
		}
	}
	
		
	
	public static void main(String[] args) {
	String s="madam";	
   palindrome(s);
	  
   if(s1.equals(s)) {
			System.out.println("palindrome");
   }
		else {
			System.out.println("not palindrome");
		}
	}
   
	}

