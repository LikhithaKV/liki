package programs180220;

public class Duplicatearray {

	public static void main(String[] args) {
		String c="likhitha";
		char[] a = c.toCharArray();
		for(int j=0;j<a.length;j++) {
			if(a[j]!=0) {
				for(int i=j+1;i<a.length;i++) {
					if(a[j]==a[i]) {
						a[i]=0;
					}
				}
			}
		}
		for(int j=0;j<a.length;j++) {
			if(a[j]!=0) 	
		System.out.print(a[j]);
	}
		}
}
