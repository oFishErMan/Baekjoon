package backjoonTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test1157 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int[] arr = new int[26];
		char[] arr2 = new char[1];
		int index = 0;
		int cnt = 0;
		int cnt2 = 0;

		for (int i = 0; i < str.length(); i++) {
			if ('A' <= str.charAt(i) && str.charAt(i) <= 'Z') {
				arr[str.charAt(i) - 'A']++;
			} else {
				arr[str.charAt(i) - 'a']++;
			}
		}

		for (int i = 0; i < 26; i++) {
			if (index < arr[i]) {
				index = arr[i];
			}
		}
		try {
			for (int i : arr) {
				if (index == i) {
					char ch = (char) (cnt + 'A');
					arr2[cnt2] = ch;
					cnt2++;
				}
				cnt++;
			}
			System.out.println(arr2[0]);
		} catch (Exception e) {
			System.out.println("?");
		}

	}

}
