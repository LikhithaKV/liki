package programs180220;

public class PrimeRange {

	static boolean flag=false;
	
	public static void prime(int no) {
		for(int i=2;i<no;i++) {
			if(no%i==0) {
				flag=true;
			}
		}
	
	if(flag) {
		System.out.println(no+" is not prime");
	}
	else {
		System.out.println(no+" is prime");
	}
}
	
	public static void main(String[] args) {
	
		
	for(int j=2;j<=100;j++) {
		prime(j);
		
	}		
}}
