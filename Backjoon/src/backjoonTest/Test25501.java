package backjoonTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test25501 {
	public static int a = 0;

	public static int recursion(String s, int l, int r) {
		if (l >= r) {
			a++;
			return 1;
		}

		else if (s.charAt(l) != s.charAt(r)) {
			a++;
			return 0;
		}

		else {
			a++;
			return recursion(s, l + 1, r - 1);
		}

	}

	public static int isPalindrome(String s) {
		return recursion(s, 0, s.length() - 1);
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int num = Integer.parseInt(br.readLine());
		String str = null;
		int[][] intArr = new int[num][2];

		for (int i = 0; i < num; i++) {
			str = br.readLine();
			intArr[i][0] = isPalindrome(str);
			intArr[i][1] = a;
			a = 0;
		}
		for (int i = 0; i < num; i++) {
			System.out.print(intArr[i][0] + " " + intArr[i][1]);
			System.out.println();
		}

	}

}
