package advance;

/******************************************************************************
 * 
 * Online Java Debugger. Code, Run and Debug Java program online. Write your
 * code in this editor and press "Debug" button to debug program.
 * 
 *******************************************************************************/

public class Main {
	public static void main(String[] args) {

		int num = 1355;
		int temp = num;
		int countNum = 0;
		while (temp > 0) {
			countNum++;
			temp = temp / 10;
		}

		int temp2 = num;
		int reminder = 0;
		int arm = 0;
		while (temp2 > 0) {
			reminder = temp2 % 10;
			int multi = 1;
			for (int i = 0; i <= countNum; i++) {
				multi = reminder * i;
			}
			arm = arm + multi;
			temp2 = temp2 / 10;
		}
		if (num == arm) {
			System.out.println("armstrong");
		} else {
			System.out.println("not armstrong");
		}

	}
}
