package backjoonTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test10870 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a1 = Integer.parseInt(br.readLine());
		System.out.println(fivo(a1));
	}

	public static int fivo(int a) {
		if(a==0) return 0;
		if(a==1) return 1;
		
		return fivo(a-1) + fivo(a-2);
		
	/*	int b = 0;
		int c = 1;
		int result = 0;

		if (a == 1)
			return 1;
		else {
			for (int i = 0; i < a - 1; i++) {
				result = b + c;
				b = c;
				c = result;
			}

			return result;
		}
*/
	}
}
