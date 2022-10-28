package backjoonTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test8958 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int a = Integer.parseInt(br.readLine());
		String[] a1 = new String[a];

		for (int i = 0; i < a; i++) {
			a1[i] = br.readLine();
		}

		for (int i = 0; i < a; i++) {
			int cnt = 0;
			int sum = 0;
			for (int j = 0; j < a1[i].length(); j++) {

				if (a1[i].charAt(j) == 'O')
					cnt++;
				else
					cnt = 0;
				sum += cnt;
			}
			System.out.println(sum);
		}

	}

}
