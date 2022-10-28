package backjoonTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.StringTokenizer;

class Solution1 {
	public int[] solution(String today, String[] terms, String[] privacies) throws ParseException {
		int sum1 = 0;
		int sum2 = (Integer.parseInt(today.substring(0, 4)) * 336) + (Integer.parseInt(today.substring(5, 7)) * 28)
				+ Integer.parseInt(today.substring(8, 10));
		int limit =0;
		
		StringTokenizer st1 = null;

		SimpleDateFormat df = new SimpleDateFormat("yyyy.MM.dd");
		String[] strArr1 = new String[privacies.length * 2];
		String[] strArr2 = new String[100];
		String[] strArr3 = new String[terms.length * 2];
		int[] intArr1 = new int[20];
		for (int i = 0; i < privacies.length; i++) {
			st1 = new StringTokenizer(privacies[i], " ");
		}
		while (st1.hasMoreTokens()) {
			int num = 0;
			strArr1[num++] = st1.nextToken();
		}
		for (int i = 0; i < strArr1.length; i += 2) {
			int num = 0;
			strArr2[num++] = strArr1[i];
		}
		for (int i = 0; i < strArr2.length; i++) {
			boolean[] bl = new boolean[strArr2.length];
			String str1 = strArr2[i];
			int year = Integer.parseInt(str1.substring(0, 4));
			int month = Integer.parseInt(str1.substring(5, 7));
			int day = Integer.parseInt(str1.substring(8, 10));
			sum1 = (year * 336) + (month * 28) + day;
		}
		for (int i = 0; i < terms.length; i++) {
			st1 = new StringTokenizer(terms[i]," ");
		}
		while (st1.hasMoreTokens()) {
			int num = 0;
			strArr3[num++] = st1.nextToken();
		}
		for (int i = 1; i < strArr3.length; i += 2) {
			int num = 0;
			intArr1[num++] = Integer.parseInt(strArr3[i]);
		}
		
		int[] answer = {};
		return answer;
	}
}

public class KakaoTest1 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		Date d = new Date();

		String str = br.readLine();

	}

}
