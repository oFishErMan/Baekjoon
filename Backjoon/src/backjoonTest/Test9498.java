package backjoonTest;

import java.util.Scanner;

public class Test9498 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		sum = sc.nextInt();
		if (90<=sum && sum <=100) System.out.println("A");
		else if (80<=sum && sum <= 89) System.out.println("B");
		else if (70<=sum && sum <= 79) System.out.println("C");
		else if (60<=sum && sum <= 69) System.out.println("D");
		else System.out.println("F");

	}

}
