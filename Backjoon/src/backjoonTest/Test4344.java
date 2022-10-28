package backjoonTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Test4344 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int C = Integer.parseInt(br.readLine());
		

		for (int i = 0; i < C; i++) {
			int sum = 0;
			int cnt = 0;
			double avg = 0;
			st = new StringTokenizer(br.readLine(), " ");
			int[] arr = new int[Integer.parseInt(st.nextToken())];
			for (int j = 0; j < arr.length; j++) {
				arr[j] = Integer.parseInt(st.nextToken());
			}
			for (int x = 0; x < arr.length; x++) {
				sum += arr[x];
			}
			avg = sum / arr.length;

			for (int y = 0; y < arr.length; y++) {
				if ((double) arr[y] > avg)
					cnt++;
			}
			System.out.println(String.format("%.3f", ( ((double)cnt / arr.length)) * 100) + "%");
		}
	}

}
