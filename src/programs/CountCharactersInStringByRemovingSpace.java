package programs;

public class CountCharactersInStringByRemovingSpace {

	public static void main(String[] args) {
		String s="Likhitha is a good girl";
		int count=0;
		//String q = s.replace(" ", "");
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)!=' ')
		count++	;
		}
		System.out.println(count);
	}

}
