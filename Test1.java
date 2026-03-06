package java_260210;

import java.util.Random;

public class Test1 {
	
	public static void main(String[] args) {
		int[][] arr = new int[3][4];
		Random random = new Random();
		int sum=0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = random.nextInt(10);
				sum+=arr[i][j];
				System.out.print(arr[i][j] + " ");
			}
		System.out.println();
		
		}
		System.out.println("합은 " + sum);
	}
	
	
}	
