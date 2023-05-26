package logic;

import java.util.Random;
import java.util.Scanner;

public class PhanTuYenNgua {
	static int m, n;

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.print("Nhap so hang: ");
		m = ip.nextInt();
		System.out.print("Nhap so cot: ");
		n = ip.nextInt();
		int arr[][] = new int[m][n];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				arr[i][j] = new Random().nextInt(10);
			}
		}

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(arr[i][j] + "  ");
			}
			System.out.println();
		}

		System.out.println("Phan tu yen ngua la: " + check(arr));

	}

	public static int check(int arr[][]) {
		int min = 0;
		int max = Integer.MIN_VALUE;
		int n = 0;
		for (int i = 0; i < m; i++) {
			min = arr[i][0];
			for (int j = 1; j < n; j++) {
				if (min > arr[i][j]) {
					min = arr[i][j];
					n = j;
				}
			}
			for (int j = 1; j < m; j++) {
				if (max < arr[j][n]) {
					max = arr[j][n];
				}
			}

			if (max == min) {
				return min;
			}
		}
		return 0;
	}

}