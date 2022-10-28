package backjoonTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test10872 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine());
		System.out.println(factorical(a));
		
		
	}
	
	
	public static int factorical(int a) {
		if(a<=1)
			return 1;
		return a * factorical(a-1);
	}
}
