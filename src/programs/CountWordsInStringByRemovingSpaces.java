package programs;

public class CountWordsInStringByRemovingSpaces {

	public static void main(String[] args) {
		String s="Likhitha is a good girl";
		String[] q = s.split(" ");
		int count=0;
		for(int i=0;i<q.length;i++) {
			count++;
		}
		System.out.println(count);
	}

}
