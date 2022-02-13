package main;

import java.util.Arrays;
import java.util.Scanner;

public class Gifts {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int numberOfEmp = scanner.nextInt();

		int[] rankOfEmp = new int[numberOfEmp];

		for (int i = 0; i < rankOfEmp.length; i++) {
			rankOfEmp[i] = scanner.nextInt();
		}

		int[] numberOfgifts = new int[numberOfEmp];

		Arrays.fill(numberOfgifts, 1);

		for (int i = 1; i < rankOfEmp.length; i++) {
			if (rankOfEmp[i] > rankOfEmp[i - 1]) {
				numberOfgifts[i] = numberOfgifts[i - 1] + 1;
			}
		}

		for (int i = rankOfEmp.length - 2; i >= 0; i--) {
			if (rankOfEmp[i] > rankOfEmp[i + 1]) {
				numberOfgifts[i] = Math.max(numberOfgifts[i], numberOfgifts[i + 1] + 1);
			}
		}

		System.out.println(Arrays.stream(numberOfgifts).sum());

		scanner.close();

	}

}
