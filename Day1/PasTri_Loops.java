package TELUSKO;

import java.util.Scanner;

public class PasTri_Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in); 
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		int spaces = num; 
		int number = 1;

		for(int i=0;i<num;i++) { 
			//nested for loop for spaces
			for (int s = 1; s<= spaces; s++) { 
				System.out.print(" ");
			}
			number = 1;
			for (int j=0;j<=i;j++) {
				System.out.print(number + " ");
				number =number * (i-j)/(j+1);
			}
			spaces--; 
			System.out.println();
		}
	}

}
