package backjoonTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Test2675 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int T = Integer.parseInt(br.readLine());
		for (int i = 0; i < T; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			int R = Integer.parseInt(st.nextToken());
			String S = st.nextToken();
			char sum[] = new char[S.length()];
			for (int j = 0; j < S.length(); j++) {
				sum[j] = S.charAt(j);
			}
			for (int x = 0; x < S.length(); x++) {
				for (int y = 0; y < R; y++) {
					System.out.print(sum[x]);
				}
			}
			System.out.println();
		}

	}

}
