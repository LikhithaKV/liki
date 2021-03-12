package programs;

import java.util.Scanner;

public class CountParticularWordsInString {

	public static void main(String[] args) {
		System.out.println("Enter the string");
		Scanner sc=new Scanner(System.in);
		String s = sc.nextLine();
		String[] s1 = s.split(" ");
		int the=0;
		int a=0;
		for (int i = 0; i < s1.length; i++) {
			if(s1[i].equals("the"))
				the++;
			else if(s1[i].equals("a"))
				a++;
		}
		
		System.out.println("no of a's = "+a);
		System.out.println("no of the's = "+the);
	}

}
