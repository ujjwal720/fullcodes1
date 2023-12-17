
public class inherit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ac a=new ac();
		a.us();
		a.m();
	

	}

}


class ab{
	public static int a=10;
	
	int x;
	
	static {
		System.out.println("Parent sttaic");
	}
	
	{
		System.out.println("Parent instance");
	}
	
	public void us() {
		x=30;
	}
}

class ac extends ab{

	static {
		
		System.out.println(a +"Child");
		System.out.println("child sttaic");
	}
	
	{
		System.out.println("Child instance");
		System.out.println(x);
		x=600;
		System.out.println(x);
	}
	
	public void m() {
		System.out.println(x);
	}
}
