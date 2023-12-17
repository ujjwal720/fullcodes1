package amcat;

public class pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    int k =4; 
        int i = 1; 
        int j = 20; 
        String s1="",s2=""; 
        for(int index = 0;index<k;index++) 
        { 
            for(int j_index = index;j_index<k;j_index++) 
            { 
                s1 += i; 
                s2 = j+s2; 
                i++; 
                j--; 
            } 
            
            System.out.println(s1+s2); 
            s1=""; 
            s2=""; 
        } 

	}

}
