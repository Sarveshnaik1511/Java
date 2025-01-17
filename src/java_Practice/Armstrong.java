package java_Practice;

import java.util.Scanner;

class Armstrong {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter nth number");
		int n = sc.nextInt();
		sc.close();

		for (int i = 0; i <= n; i++) {
			int temp = i;
			int count = 0;
			while (temp > 0) {
				count++;
				temp = temp / 10;
			}

			int temp2 = i;
			int rem = 0;
			int arm = 0;
			while (temp2 > 0) {
				rem = temp2 % 10;
				int multi = 1;

				for (int j = 0; j < count; j++) {
					multi = multi * rem;
				}
				arm = arm + multi;
				temp2 = temp2 / 10;
			}
			if (i == arm) {
				System.out.println(i);
			}
		}
	}
}
