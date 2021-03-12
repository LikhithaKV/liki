package programs;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {

		for (int i = 1; i < 101; i++) {
			if(i%2==0) {
				System.out.println("not a prime");
			}
			else {
				if(i%1==i && i%i==1)
					System.out.println(i);
			}	
		}
	}
}

