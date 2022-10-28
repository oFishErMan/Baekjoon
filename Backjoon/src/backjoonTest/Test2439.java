package backjoonTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test2439 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		
		
		int N = Integer.parseInt(br.readLine());
		
		for(int i=0; i<N;i++) {
			
			for (int j=N;j>i+1;j--) {
				System.out.print(" ");
			}
			
			for (int y=0; y<i+1;y++) {
				System.out.print("*");
			}
			System.out.println();
		}
		br.close();

	}

}
