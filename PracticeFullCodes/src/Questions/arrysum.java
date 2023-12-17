package Questions;

public class arrysum {
	
	public static void main(String[] args) {
		int[] e= {1,2,3,4,5,6,7,8};
		sum a= new sum();
		a.display(e);
		a.reverse(e);
		
		
	}

}


class sum{
	int count=0;
	
public void display(int[] c) {
	
for(int i=0;i<=c.length-1;i++) {
	count=count+c[i];
}

System.out.println(count);

}	

public void reverse(int[] c) {
	for(int i=c.length-1;i>=0;i--) {
		System.out.println(c[i]);
	}
}
	
	
	
	
	
}