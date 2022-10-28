package backjoonTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test1316 {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	static boolean check() throws IOException {
		boolean[] blArr = new boolean[26];
		int prev = 0;
		String str = br.readLine();
		
		for (int i = 0; i < str.length(); i++) {
			int now = str.charAt(i);

			if (prev != now) {

				if (blArr[now - 'a'] == false) {
					blArr[now - 'a'] = true;
					prev = now;
				} // 2if

				else {
					return false;
				} // 2else

			}


		} // for

		return true;
	}// class

	public static void main(String[] args) throws IOException {
		
		int cnt = 0;
		int num = Integer.parseInt(br.readLine());

		for (int i = 0; i < num; i++) {
			if (check()==true)
				cnt++;

		}
		System.out.println(cnt);
	}

}
