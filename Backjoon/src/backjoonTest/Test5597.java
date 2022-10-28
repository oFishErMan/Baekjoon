package backjoonTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test5597 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		boolean[] boolArr = new boolean[30];
		int num1 = 0;
		int num2 = 0;
		for (int i = 0; i < 28; i++) {
			int a = Integer.parseInt(in.readLine());
			boolArr[a-1] = true;
		}
		for (int i = 0; i < boolArr.length; i++) {
			if (!boolArr[i]) {
				if (num1 == 0)
					num1 = i+1;
				else if (num2 == 0)
					num2 = i+1;
			}

		}
		System.out.println(num1);
		System.out.println(num2);
	}
}
