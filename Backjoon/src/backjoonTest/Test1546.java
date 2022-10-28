package backjoonTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Test1546 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		
		double a=0.0;
		int N = Integer.parseInt(br.readLine());
		double sum =0;
		int[] arr = new int[N];
		st = new StringTokenizer(br.readLine()," ");
		for (int i=0;i<N;i++) {
			
			arr[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr);
		double M = (double)arr[N-1];
		for (int i : arr) {
			a =(((double)i/M)*100);
			sum+=a ;
		}
		
		System.out.println(sum/N);
		
	}

}
