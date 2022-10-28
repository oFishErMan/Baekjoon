package backjoonTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Test1152 {

	public static void main(String[] args) throws IOException {
		BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int index=0;
		st = new StringTokenizer(br.readLine()," ");
		while(st.hasMoreElements()) {
			String str = st.nextToken();
			index++;
		}
		System.out.println(index);
	}
}
