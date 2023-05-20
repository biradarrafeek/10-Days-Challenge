package TELUSKO;

import java.util.Iterator;
import java.util.Scanner;

public class PasTri_recursion {

	public static void print(int n) {
		for (int i = 0; i < n; i++) {
			for(int j=0;j<=i;j++) {
				System.out.print(PasTri(i,j)+ " ");
			}
			System.out.println();
		}
	}
	public static int PasTri(int i, int j) {
		if(j==0) {
			return 1;
		}
		else if(j==i) {
			return 1;
		}
		else {
			return PasTri(i-1, j-1)+PasTri(i-1,j);
		}

	}
	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int result=sc.nextInt();
		print(result);
	}
}
