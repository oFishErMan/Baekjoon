package backjoonTest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Test2438 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		int N = Integer.parseInt(br.readLine());
		
		for(int i=0; i<N;i++) {
			for (int y=0; y<i+1;y++) {
				System.out.print("*");
			}
			System.out.println();
		}
		br.close();
		bw.flush();
		bw.close();
	}

}
