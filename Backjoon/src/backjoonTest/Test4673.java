package backjoonTest;

import java.util.HashSet;
import java.util.Iterator;

class Test1 {

	int self(int num) {
		int sum = num;
		/*result += num + (num % 10) + ((num % 100) / 10) + ((num % 1000) / 100) + ((num % 10000) / 1000)
				+ ((num % 100000) / 10000);*/
		while(num !=0) {
			sum += num %10;
			num = num/10;
		}
		return sum;
	}
}

public class Test4673 {

	public static void main(String[] args) {
		Test1 ts = new Test1();
		HashSet<Integer> set1 = new HashSet<>();

		for (int i = 1; i < 10001; i++) {
			set1.add(i);
		}

		for (int i = 1; i < 10001; i++) {
			/*for (int j = 1; j < 10001; j++) {
				if (i == ts.self(j))
					set1.remove(i);
			}*/
			set1.remove(ts.self(i));
		}
		Iterator iter = set1.iterator();
		for (int i = 1; i < 10001; i++) {
			while (iter.hasNext())
				System.out.println(iter.next());
		}
	}
}
