package Questions;

public class encap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       dell a=new dell();
       a.setF(1);
       System.out.println(a.getF());
	}

}


class dell{
	
	private int gh;
	private int f;
	
	public int getF() {
		return f;
	}
	public void setF(int f) {
		this.f = f;
	}
	public int getGh() {
		return gh;
	}
	public void setGh(int gh) {
		this.gh = gh;
	}
	
	
	
}