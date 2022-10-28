package backjoonTest;

import java.util.Arrays;
import java.util.Scanner;

public class Test2480 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int d[] = {a,b,c};
		Arrays.sort(d);

		
		if (a==b && a==c) {
			System.out.println(10000+(1000*a));
		} else if (a==b || a==c || b==c ) {
			if (a==b)
				System.out.println(1000+(100*a));
			else if (a==c)
				System.out.println(1000+(100*a));
			else
				System.out.println(1000+(100*b));
		} else {
			System.out.println(d[2]*100);
		}
				

	}

}
