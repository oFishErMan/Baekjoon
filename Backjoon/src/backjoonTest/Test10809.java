package backjoonTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test10809 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		br.close();
		int a[] = new int[26];

		for (int i = 0; i < 26; i++) {
			a[i] = -1;
		}

		// j�� ���ĺ� i�� ��Ʈ�� �ڸ���

		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);

			if (a[ch - 'a'] == -1) {
				a[ch - 'a'] = i;
			}
		}
		for (int b : a) {
			System.out.print(b + " ");
		}

	}

}
