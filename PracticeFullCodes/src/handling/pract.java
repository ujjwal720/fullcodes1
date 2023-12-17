package handling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class pract {

	public static void main(String[] args) throws IOException  {
		// TODO Auto-generated method stub

		File a=new File("C:\\Users\\DELL\\Downloads\sample_resume.pdf");
		File b=new File("C:\\\\Users\\\\DELL\\\\Downloads\\sample_resume2.pdf");
		FileInputStream g=null;
		FileOutputStream f=null;
		
		g=new FileInputStream(a);
		
		
	System.out.println(g.available());
		
		
	}

}
