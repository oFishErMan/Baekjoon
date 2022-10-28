package backjoonTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Test2 {

	int get1(int num) {
		int sum = num % 10;
		return sum;
	}

	int get10(int num) {
		int sum = (num % 100) / 10;
		return sum;
	}

	int get100(int num) {
		int sum = (num % 1000) / 100;
		return sum;
	}

	int getHan(int a, int b, int c) {
		int han = 0;
		if ((a - b) * 2 == a - c)
			han++;
		return han;
	}

	int getHan(int a, int b) {
		int han = 1;
		return han;
	}

	int getHan(int a) {
		int han = 1;
		return han;
	}
}

public class Test1065 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int cnt = 0;
		Test2 t2 = new Test2();
		int N = Integer.parseInt(br.readLine());

		for (int i = 1; i < N + 1; i++) {
			if (i < 10) {
				cnt++;
			} else if (i < 100) {
				cnt++;
			} else if (i == 1000) {

			} else {
				cnt += t2.getHan(t2.get1(i), t2.get10(i), t2.get100(i));
			}

		}
		System.out.println(cnt);

	}

}
