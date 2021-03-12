package programs;

public class SplitsWordsInSring {

	public static void main(String[] args) {
		String s="java is a programming language";
		String[] a = s.split(" ");
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}

	}

}
