package java_Practice;

public class SmallestAndLargestnumber {
	public static void main(String[] args) {

		int[] num = { 4, 6, 5, 2, 56, 8, 7, 6, };

		int min = num[0];
		int max =num[0];
		for (int i = 0; i < num.length; i++) {
			if (num[i] < min) {
				min = num[i];
			}
			if (num[i]>max) {
				max =num[i];
			}
			
		}
		System.out.println(min);
		System.out.println(max);

	}
}
