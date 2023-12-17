package amcat;

public class program2 {

	public static void main(String[] args) {
int d=16;		// TODO Auto-generated method stub
int n=0;
for(int i=1;i<=4;i++) {	
for(int j=1;j<=8;j++) {
if(j<=4) {
if(j>=i && j<=4) {
  n++;
	System.out.print(n);
}
else {
	System.out.print(" ");
}
}
if(j>4) {
	
if(i==1 &&(j>=5 && j<=8 )) {
	d++;
	System.out.print(d);
}
else {
	System.out.print(" ");
}
	
}

}


System.out.println();
}		

	
		
		
	

}

}