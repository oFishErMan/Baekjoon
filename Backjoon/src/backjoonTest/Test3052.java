package backjoonTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Test3052 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		HashSet<Integer> h = new HashSet<>();

		for (int i = 0; i < 10; i++) {
			h.add(Integer.parseInt(br.readLine()) % 42);
		}
		br.close();
		System.out.println(h.size());
	}
}