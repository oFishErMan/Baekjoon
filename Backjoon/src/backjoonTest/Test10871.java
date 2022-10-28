package backjoonTest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Test10871 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] strs = br.readLine().split(" ");
		String[] strs2 = br.readLine().split(" ");
		int N = Integer.parseInt(strs[0]);
		int X = Integer.parseInt(strs[1]);
		
		int[] A = new int[N];

		for (int i = 0; i < N; i++) {
			A[i] = Integer.parseInt(strs2[i]);
		}
		for (int a : A) {
			if (a < X)
				bw.write(a + " ");
			else
				;
		}
		br.close();
		bw.flush();
		bw.close();

	}

}
