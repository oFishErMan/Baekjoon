package backjoonTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Test2908 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		StringTokenizer st = new StringTokenizer(str, " ");
		String s1 = st.nextToken();
		String s2 = st.nextToken();
		int div = 100;
		int sum1 = 0;
		int sum2 = 0;
		for (int i = s1.length(); i > 0; i--) {
			int a = s1.charAt(i - 1) - '0';
			int b = s2.charAt(i - 1) - '0';
			if (div != 0) {
				sum1 += a * div;
				sum2 += b * div;
			}
			div = div / 10;
		}
		if (sum1 > sum2)
			System.out.println(sum1);
		else
			System.out.println(sum2);
	}

}
