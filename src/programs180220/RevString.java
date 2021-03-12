package programs180220;

public class RevString {

	public static void revString(String s) {
		if(s.length()<=1)
			System.out.print(s);
		else {
			System.out.print(s.charAt((s.length()-1)));
			revString(s.substring(0,(s.length()-1)));
		}
	}
	public static void main(String[] args) {
		
   revString("likhitha");
	}

}
