package programs;

public class CountNoOfPairsWhichSumUpTo7 {

	public static void main(String[] args) {
		int count=0;
		 String pairs = "";
		int a[]= {2,4,7,5,8,10,1,3,6,9};
		for(int i=0;i<a.length;i++) {
			if(a[i]<7) {
				for(int j=i+1;j<a.length;j++) {
					if(a[i]+a[j]==7) {
						count++;
					System.out.println(a[i]+" "+a[j]+"  ");
					}
				}
			}
		}
System.out.println(count); 

	}

}
