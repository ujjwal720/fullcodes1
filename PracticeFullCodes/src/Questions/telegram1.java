package Questions;

public class telegram1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
int[] a=new int[100];
int count =100;
for(int i=0;i<=a.length-1;i++) {
	a[i]=count;
	count++;
}

for(int i=0;i<=a.length-1;i++) {
	String g=Integer.toString(a[i]);
	char[] d=g.toCharArray();
if(d[2]=='1'||d[2]=='4'||d[2]=='9') {
	System.out.println(g);
}
	
}
		
		
		
		
		
		
	}

}
