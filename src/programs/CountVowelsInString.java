package programs;

import java.util.Scanner;

public class CountVowelsInString {

	public static void main(String[] args) {
		System.out.println("Enter the string");
		Scanner sc=new Scanner(System.in);
		String s = sc.nextLine();
		int a = 0;
		int e = 0;
		int i = 0;
		int o = 0;
		int u = 0;
		char[] c = s.toCharArray();
		for (int j = 0; j < c.length; j++) {
			if(c[j]=='a')
				a++;
			else if(c[j]=='e')
				e++;
			else if(c[j]=='i')
				i++;
			else if(c[j]=='o')
				o++;
			else if(c[j]=='u')
				u++;
		}
		System.out.println("a = "+a);
		System.out.println("e = "+e);
		System.out.println("i = "+i);
		System.out.println("o = "+o);
		System.out.println("u = "+u);
	}

}
