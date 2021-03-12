package programs180220;

public class Binary {

	public static void main(String[] args) {
		int a=1;
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=4;j++) {
			if((i+j)>=(5))
			System.out.print("* ");
			else
				System.out.print(" ");
			}
			System.out.println();
		}
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=4;j++) {
			if(i<j)
			System.out.print("* ");
			else
				System.out.print(" ");
			}
			System.out.println();
		}
		
	}
}
	
	

