package programs;

import java.util.Scanner;

public class RemoveDuplicateStringInAraay {

	public static void main(String[] args) {
		System.out.println("Enter the String");
		Scanner sc=new Scanner(System.in);
		String s = sc.nextLine();
		String[] a = s.split(" ");
		for (int i = 0; i < a.length; i++) {
			if(a[i]!=null) {
				for (int j = i+1; j < a.length; j++) {
					if(a[i].equals(a[j])) 
						a[j]=null;
					
				}
			}
			
		}
for (int i = 0; i < a.length; i++) {
	if(a[i]!=null)
		System.out.println(a[i]);
}
	}

}
