package backjoonTest;

import java.util.Scanner;

public class CompareTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		System.out.print(" ");
		int B = sc.nextInt();
		if (A>B) {
			System.out.println(">");
		} else if (A<B) {
			System.out.println("<");
		} else if (A==B) {
			System.out.println("==");
		} else if (A<=-10000 || A>=10000 || B<=-10000 || B>=10000) {
			System.out.println("");
		}

	}

}
