package backjoonTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Test10807 {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(in.readLine());
		String str = in.readLine();
		int v = Integer.parseInt(in.readLine());
		int index = 0;
		StringTokenizer st = new StringTokenizer(str," ");
		while(st.hasMoreTokens()) {
			int i = Integer.parseInt(st.nextToken());
			if (i == v)
				index++;
		}
		System.out.println(index);
	}

}
