package backjoonTest;

import java.util.Scanner;

public class Test2525 {

	public static void main(String[] args) {
		int D = 0;
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		sc.close();

		if (B + C > 60) {
			D = (B + C) % 60;
			A += (int) (B + C) / 60;
			A = A % 24;
			System.out.println(A + " " + D);
		} else {
			if (B + C == 60) {
				A++;
				A = A % 24;
				System.out.println(A + " " + 0);
			} else
				System.out.println(A + " " + (B + C));
		}
	}

}
