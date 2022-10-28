package backjoonTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Solution {
    public int[] solution(int[][] v) {
    	
    	
        int[] answer = new int[1];
        
        answer[0] = v[0][0]^v[1][0]^v[2][0];
		answer[1] = v[0][1]^v[1][1]^v[2][1];
        

        return answer;
    }
}


public class KakaoTest {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        /*int a = Integer.parseInt(br.readLine());
        for (int i=0;i<a;i++) {
        	for(int j=0;j<i+1;j++) {
        		System.out.print("*");
        	}
        	System.out.println();
        }
*/
		
	}

}
