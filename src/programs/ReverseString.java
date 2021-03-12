package programs;

public class ReverseString {
	
	public static void add(String s) {
		int n = s.length();
		if(n<=1)
			System.out.print(s);
		else {
			System.out.print(s.charAt(n-1));
			add(s.substring(0, n-1));
		}
	}
	public static void main(String[] args) {
		/*String  s="Likhitha";  //using charAt method
		int a = s.length();
		for (int i=a-1;i>=0;i--)
			System.out.print(s.charAt(i));*/
		
		/*String s="java is a programming language";  //using toCharArray method
		char[] a = s.toCharArray();
		for (int i = a.length-1; i>=0; i--) {
			System.out.print(a[i]);*/
		
		add("java is a programming language"); //using recursive calling
		}
	}


