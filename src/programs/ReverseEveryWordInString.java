package programs;

public class ReverseEveryWordInString {

	public static void main(String[] args) {
		String s="Likhitha is a good girl";
		String[] q = s.split(" ");
		String revword = "";
		String revsen = "";
		for(int i=0;i<q.length;i++) {
			if(i%2==0) {
			String word = q[i];
			for(int j=word.length()-1;j>=0;j--) {
				System.out.print(word.charAt(j));
			}
			}
			else
				System.out.print(" "+q[i]+" ");
	}
		}
			}
			