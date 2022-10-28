package backjoonTest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Test15552 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		int T = Integer.parseInt(br.readLine());
		
		for (int i=0;i<T;i++) {
			st = new StringTokenizer(br.readLine());
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			
			bw.write(A+B + "\n");		
		}
		/*		
		for (int i=0;i<T;i++) {
            String[] strs = br.readLine().split(" ");
            int A = Integer.parseInt(strs[0]);
            int B = Integer.parseInt(strs[1]);
            bw.write(A+B + "\n");	
		}
		*/
		br.close();
		bw.flush();
		bw.close();
		

	}

}
