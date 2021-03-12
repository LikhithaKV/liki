package practiseprograms;

public class ReverseEveryWordInString {

	public static void main(String[] args) {
		String s="I vl become auto eng";
		String[] s1 = s.split(" ");
		for(int i=0;i<s1.length;i++) {
			String word=s1[i];
			for(int j=word.length();i>=0;i--) {
			System.out.print(word.charAt(j));
			}
			System.out.println();
		}

	}

}
