package Questions;

public class inherit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  grandfather a=new father();
		   a.fg();
		
	}

}


class son extends father{
	public void fo() {
		System.out.println("The following is an fo");
	}
}



class father extends grandfather{
	
	public void  fd() {
		System.out.println("The following is an fd");
	}
}


class grandfather{
	
	
	public void fg() {
		System.out.println("The following is parent class");
	}
}