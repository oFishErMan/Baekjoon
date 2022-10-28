package otherTest;

public class MadUpTest {

	public static int[] solution(int[] numbers, int[] start, int[] finish) {
		int[] answer = new int[start.length];

		for (int i = 0; i < start.length; i++) {
			while (start[i] <= finish[i]) {
				answer[i] += numbers[start[i]++];
			}

		}

		return answer;
	}

	public static void main(String[] args) {
		int[] number = { 100, 101, 102, 103, 104, 105 };
		int[] start = { 0, 2 };
		int[] finish = { 4, 4 };

		int[] intarr = solution(number, start, finish);

		for (int a : intarr) {
			System.out.println(a);
		}
	}

}
