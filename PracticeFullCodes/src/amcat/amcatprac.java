package amcat;

public class amcatprac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=0;
		int p=0;
		for(int i=4;i>=1;i--) {
			n++;
			p++;
			for(int j=1;j<=4;j++) {
		if(i==p &&(j>=1 && j<=n)) {
		     System.out.print("*");
		}
		
		else {
			System.out.print(" ");
		}
			}
            
			System.out.println();
			
			
		}

	}
}
