package Questions;

public class state {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		hg a=new hg();
		hg b=new hg();
		hg c=new hg();
		hg d=new hg();
		hg e=new hg();
		a.counter();
		b.counter();
		c.counter();
		d.counter();
		e.counter();
		a.display();

	}

}


class hg{
	 int count =0;
public void counter() {
	count++;
}
	
public void display() {
	System.out.println(count);
}	
	
}