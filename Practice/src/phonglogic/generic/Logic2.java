package phonglogic.generic;

import java.util.Arrays;
import java.util.Scanner;

/*
	1.	Viết chương trình thực hiện các công việc sau:
	a.	Nhập ma trận A (m dòng, n cột) gồm các phần tử kiểu int. Sau đó, in toàn bộ ma trận A ra.
	b.	Tính tích các số là bội số của 3 nằm trên dòng đầu tiên của ma trận.
	c.	Tạo ra mảng một chiều X với X[i] sẽ chứa giá trị lớn nhất trên dòng i của ma trận A. In toàn
	 bộ mảng X ra.
 */
public class Logic2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int row = 3;
		int col = 2;
		int[][] matrix = new int[row][col];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.println("Nhập phần tử thứ " + i + " , " + j);
				matrix[i][j] = sc.nextInt();
			}

		}

		System.out.println("Mảng vừa nhập: ");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print(matrix[i][j] + "  ");
			}
			// sau khi viết xong 1 dòng thi xuống hàng
			System.out.println("\n");
		}

		// b.Tính tích các số là bội số của 3 nằm trên dòng đầu tiên của ma trận
		int mul = 1;

		for (int j = 0; j < col; j++) {
			if (matrix[0][j] / 3 != 0) {
				mul = mul * matrix[0][j];
			}
		}
		System.out.println(mul);
		
		// c.Tạo ra mảng một chiều X với X[i] sẽ chứa giá trị lớn nhất trên dòng i của ma trận A. 
		// In toàn bộ mảng X ra.
		int a[] = new int[row];
		int max;
		for (int i = 0; i < row; i++) {
			max = Integer.MIN_VALUE;
			for (int j = 0; j < col; j++) {
				a[i] = Math.max(max, matrix[i][j]);
			}
		}
		System.out.println(Arrays.toString(a));
	}
}
