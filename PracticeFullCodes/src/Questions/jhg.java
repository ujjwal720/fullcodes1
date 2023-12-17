package Questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class jhg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<Integer> a=new ArrayList<Integer>(Arrays.asList(100,2,1,3,5));
int count=1;
Collections.sort(a);
int[] b=new int[a.get(a.size()-1)];
for(int i=0;i<=b.length-1;i++) {
	b[i]=count;
	count++;
}
for(int i=0;i<=b.length-1;i++) {
if(b[i]!=a.get(i)) {
	System.out.println(b[i]);
	break;}
}
		
		
	}

}
