package practicenaveen;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class naveenfirst {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		File a=new File("C:\\Users\\DELL\\Downloads\\1Rivet Intern Handbook v.1.2.pdf");
		File b=new File("C:\\\\Users\\\\DELL\\\\Downloads\\\\2Rivet Intern Handbook v.1.2.pdf");

		FileInputStream FileInputStream=null;
		FileOutputStream FileOutputStream=null;
		
		
		FileInputStream=new FileInputStream(a);
		FileOutputStream=new FileOutputStream(b);
		
		
		System.out.println(FileInputStream.available());
		
	char c1=	(char)FileInputStream.read();
	char c2=	(char)FileInputStream.read();
	char c3=	(char)FileInputStream.read();
	char c4=	(char)FileInputStream.read();
	char c5=	(char)FileInputStream.read();
	char c6=	(char)FileInputStream.read();
	char c7=	(char)FileInputStream.read();
	char c8=	(char)FileInputStream.read();
	System.out.println(c8);
     System.out.println(FileInputStream.available());
	}

}
