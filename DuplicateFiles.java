package GUI;
import java.util.Scanner;

public class DuplicateFiles {
	public static void main(String []args) {
		
		
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
	   // int n = in.nextInt();
	    int ID = in.nextInt();
		String f = in.next();
		
		String[]  arr = new String[t];
		
		for (int i = 0 ; i < t; i ++) {
			if(f.equals(f.toUpperCase()))
				System.out.println("invalid file name");
			else if(f.equals(f))
				System.out.println(ID);
		
		
			
		}
	
		
		
	}
	public static void num(int ID) {
	
		if(ID < 1 && ID > 100000) {
			System.out.println("invalid number of files");}

	}
	
	public int filename(String [] arr, String f,int ID) {
		for (int i = 0 ; i < arr.length; i ++) {
			if(arr[i].equals(arr[i++])) {
				return ID;}
		
		}
		return ID;
	}
 
}
