package LabPractice;
import java.util.Scanner;
public class ac {
	public static void main (String [] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int M = in.nextInt();
		
		if(M < 0 || M < N ) {
			System.out.print("No");
		}
		if(M >= N) {
			System.out.print("Yes");
		}
	}

}
