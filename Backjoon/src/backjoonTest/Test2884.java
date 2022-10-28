package backjoonTest;

import java.util.Scanner;

public class Test2884 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int M = sc.nextInt();
		sc.close();
		M -= 45;
		if (H <= 0 && M < 0) {
			H = 23;
			M += 60;
		} else if (H > 0 && M < 0) {
			H--;
			M += 60;
		}
		System.out.println(H + " " + M);

	}

}
