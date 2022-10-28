package backjoonTest;

import java.util.Scanner;

public class Test8393 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		int index = 0;
		for (int i =1; i<n+1; i++) {
			index += i;
			
		}
			System.out.println(index);
	}

}
