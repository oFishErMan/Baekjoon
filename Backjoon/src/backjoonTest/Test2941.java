package backjoonTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test2941 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String[] str2 = {"c=","c-","dz=","d-","lj","nj","s=","z="};
		
		for (int i=0;i<str2.length;i++) {
			if(str.contains(str2[i])) {
				str = str.replace(str2[i], "!");
			}
		}
		System.out.println(str.length());

	}
}