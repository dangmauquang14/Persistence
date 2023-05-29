package test;

import java.util.Arrays;

public class TimSoNguyenBiThieu {
	public static void main(String[] args) {
		// General: Random n-1 elements which is from [1-n]
		// Finding missing element
		int[] numbers = { 3, 4, 1, 6, 5 };
		System.out.println("Missing element: " + findMissingNumber(numbers));
	}

	private static int findMissingNumber(int[] numbers) {
		int foundElement = 0;

		// Step 1: Sort array of number ascending, descending
		Arrays.sort(numbers);

		// 1 2 3 4 5 6
		// T T T F T T
		// --> 1 2 3 5 6 (n-1)*n

		// Step 2: Iterate elements in array
		// If elements[i] != elements[i-1] + 1 ==> found = elements[i-1] + 1
		for (int i = 1; i < numbers.length; i++) {
			if (numbers[i] - numbers[i - 1] != 1) {
				foundElement = numbers[i - 1] + 1;
				break;
			}
		}
		return foundElement;
	}
	
	/*
	Second way
		private static int findMissingNumber(int[] numbers) {
			// Step 1: Find max element = elements.length + 1 ==> N = 6
			int N = numbers.length + 1;
	
			// Step 2: Find sum of N elements = N*(N+1)/2 ==> SUM = 21
			int sum = N * (N + 1) / 2;
	
			// Step 3: SUM(21) - SUM(numbers[k])(19) = 2
			int sumOfElements = 0;
			for (int number : numbers) {
				sumOfElements += number;
			}
	
			return sum - sumOfElements;
		}
		
	ThirdWay
	private static int findMissingNumber(int[] numbers) {
		// Step 1: Find max element = elements.length + 1 ==> N = 6
		int N = numbers.length + 1;

		// Step 2: Find multiply of elements from 1 to N
		int mulOfElements = 1;
		for (int i = 1; i <= N; i++) {
			mulOfElements *= i;
		}

		// Step 3: Find multiply of elements in array which is missing number
		int mulOfMissingElements = 1;
		for (int number : numbers) {
			mulOfMissingElements *= number;
		}

		// Step 4: Step2Resul/Step3Result
		return mulOfElements / mulOfMissingElements;
	}
	*/
}
