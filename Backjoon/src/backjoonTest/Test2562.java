package backjoonTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test2562 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] a = new int[9];
		int max = a[0];
		int max2 = a[0];
		int b = 0;
		int c = 0;
		int index =0;
		for (int i = 0; i < 9; i++) {
			a[i] = Integer.parseInt(br.readLine());
		}
		for (int j : a) {
			b++;
			if (j > max) {
				max = j;
				c = b;
			}
		}
		// 위와 아래의 결과값은 같음
		for (int i=0;i<9;i++) {
			if (a[i]>max2) {
				max2 =a[i];
				index = i+1;
			}
		}

		System.out.println(max);
		System.out.println(c);
		System.out.println(index);

	}

}
