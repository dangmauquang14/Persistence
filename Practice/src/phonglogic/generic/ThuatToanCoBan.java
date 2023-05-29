package phonglogic.generic;

import java.util.Arrays;

public class ThuatToanCoBan {
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Nhập n: ");
//		int n = sc.nextInt();
		int n = 8;

		// 1. In dãy số 1, 2, 3, 4, 5 … n (n là số được nhập vào từ bàn phím)
		// bằng vòng lặp for;
		System.out.println("1==============");
		for (int i = 1; i <= n; i++) {
			System.out.print(i + " ");
		}
		System.out.println();

		// 2. In dãy số 1, 3, 5, 7, 9 … n (n là số được nhập vào từ bàn phím)
		// bằng vòng lặp for và bằng 2 cách khác nhau.;
		System.out.println("2==============");
		for (int i = 1; i <= n; i += 2) {
			System.out.print(i + " ");
		}

		for (int i = n; i >= 1; i -= 2) {
			System.out.print(n - i + 1 + " ");
		}

		System.out.println();
		// 3. In dãy số 2, 4, 6, 8, 10 … 2n (n là số được nhập vào từ bàn phím)
		// bằng vòng lặp for
		System.out.println("3==============");
		for (int i = 1; i <= n; i++) {
			System.out.print(i * 2 + " ");
		}

		System.out.println();
		// 4. Viết chương trình tính tổng S sau đây bằng cách sử dụng vòng lặp for
		System.out.println("4==============");
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			sum += i;
		}
		System.out.println(sum);

		// 5. Viết chương trình tính tổng S sau đây bằng cách sử dụng vòng lặp for
		// S=1 + 1/2 + 1/3 +....+ 1/n (Số n được nhập vào từ bàn phím"
		System.out.println("5==============");
		double sum5 = 0;
		for (int i = 1; i <= n; i++) {
			sum5 += (double) 1 / i;
		}
		System.out.println(sum5);

		/*
		 * 6.In dãy số 2, -4, 6, -8, 10 … n (n là số được nhập vào từ bàn phím)
		 * bằng cách sử dụng vòng lặp for và bằng 2 cách khác nhau. Gợi ý: cách 1 dùng
		 * toán tử %, cách 2 dùng 1 biến để xác định dấu âm và dấu dương. (*)
		 * 
		 */
		System.out.println("6==============");
		for (int i = 2; i <= n; i += 2) {
			System.out.print(i + " ");
		}
		System.out.println();

		// 7.Tính giai thừa của số n (n là số được nhập vào từ bàn phím) bằng
		// cách sử dụng vòng lặp for.
		System.out.println("7==============");
		int factorial = 1;
		for (int i = 1; i <= n; i++) {
			factorial *= i;
		}
		System.out.println(factorial);

		// 8.In dãy số 1, 2, 3, 4, 5 … n (n là số được nhập vào từ bàn phím)
		// bằng vòng lặp while.
//		System.out.println("8==============");
//		int i = 1;
//		while(i <= n) {
//			System.out.print(i++ + " ");
//		}
//		System.out.println();

		// 9.In dãy số 1, 3, 5, 7, 9 … n (n là số được nhập vào từ bàn phím)
		// bằng vòng lặp while và bằng 2 cách khác nhau.
		System.out.println("9==============");
		int j = 1;
//		while(j <= n) {
//			System.out.print(j + " ");
//			j+=2;
//		}
//		System.out.println();

		while (true) {
			if (j >= n) {
				break;
			}
			System.out.print(j + " ");
			j += 2;
		}
		System.out.println();

		// 10.In dãy số 1, 2, 3, 5, 8, 13, …n (n là số được nhập vào từ bàn
		// phím) bằng vòng lặp while.
//		System.out.println("10==============");
//
//		int f0;
//		int f1 = 1;
//		int fn = 2;
//		int i = 0;
//		while (i <= n) {
//			i++;
//			if (i == 1 || i == 2) {
//				System.out.print(i + " ");
//				continue;
//			}
//			f0 = f1;
//			f1 = fn;
//			fn = f0 + f1;
//			if (fn <= n) {
//				System.out.print(fn + " ");
//			}	
//		}

//		for (i = 1; i <= n; i++) {
//			if (i == 1 || i == 2) {
//				System.out.print(i + " ");
//				continue;
//			}
//			f0 = f1;
//			f1 = fn;
//			fn = f0 + f1;
//			if (fn <= n) {
//				System.out.print(fn + " ");
//			}
//		}

		// 11.In dãy số 1, 3, 7, 15, 31, …n (n là số được nhập vào từ bàn phím)
		// bằng vòng lặp while.
//		System.out.println();
//		System.out.println("11==============");
//		int i = 1;
//		while (i <= n) {
//			System.out.print(i + " ");
//			i = 2*i +1;
//		}
		
		// 12.In dãy số 1, -3, 7, -15, 31, … (n là số được nhập vào từ bàn phím) bằng vòng lặp while.
//		System.out.println();
//		System.out.println("12==============");
//		
//		int i = 1;
//		int fn = 1;
//		while (i <= n) {
//			if(fn <= n && -fn <= n) {
//				System.out.print(fn + " ");
//			}
//			if(i % 2 != 0) {
//				fn = -2*fn - 1;
//			} else
//				fn = -2*fn + 1;
//			i++;
//		}
		
		// 13.Tính tổng và tích các chữ số của một số m, m được nhập từ bàn phím:
		// (Ví dụ : m = 234 => S = 2 + 3 + 4 = 9, P = 2 * 3 * 4 = 24)
		System.out.println();
		System.out.println("13==============");
		int m = 345;
		int total = 0;
		int mul = 1;
		
//		while(m > 0) {
//			total = total + m%10;
//			m = m/10;
//		}
//		System.out.println(total);

		while(m > 0) {
			mul = mul* (m%10);
			m = m/10;
		}
		System.out.println(mul);
		
	}
}
