package TELUSKO;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PasTri_Memoization {

	static Map<String, Integer> map = new HashMap<String, Integer>();

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num = sc.nextInt();
		for (int i = 0; i < num; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(PasTri(i,j) + " ");
			}
			System.out.println();
		}
	}

	public static int PasTri(int i, int j) {
		if(i == 0 || j== 0 || j ==i) {
			return 1;
		}

		else if(map.get(i+","+j) != null){
			return map.get(i+","+j);
		}else{
			int result = PasTri(i-1,j-1)+PasTri(i-1,j);
			map.put(i+","+j, result);
			return result;
		}    
	}
}
