package Questions;

public class Question {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		mobile fd=new mobile();
		fd.display(2, "iphone");
		fd.displayname();
		
		
		

	}

}


class mobile{
	int price;
	String name;
	
static int count =0;
	
public void display(int price,String name) {
	this.price=price;
	this.name=name;
	System.out.println(price+name);
	
}

public void displayname(){
	System.out.println(price+name);
}
}