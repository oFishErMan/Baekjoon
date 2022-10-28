package backjoonTest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Test10952 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		while (true) {
			String[] strs = br.readLine().split(" ");
			int A = Integer.parseInt(strs[0]);
			int B = Integer.parseInt(strs[1]);

			if (A == 0 && B == 0)
				break;
			bw.write((A + B) + "\n");
			bw.flush();
		}
		br.close();
		bw.close();

	}

}
