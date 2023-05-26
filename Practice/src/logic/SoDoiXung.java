package logic;

import java.util.Scanner;

/**
 * Nhập vào một số bất kỳ. Kiểm tra số đó có phải là số đối xứng hay không
 * 		Tạo ra 1 mảng để lưu từng số bằng cách chia lấy dư chia lấy dư cho 10 -> lấy
 * 		số đó lưu vô mảng sau đó lấy dãy số đã cho chia lấy phần nguyên cho 10 để
 * 		tiếp tục
 */

public class SoDoiXung {
	public static void main(String[] args) {
		System.out.println("Nhập số: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[5];
		for (int i = 0; i < a.length; i++) {
			int b = n % 10;
			n = n / 10;
			System.out.print(b + " ");
			a[i] = b;
		}	
		System.out.println("\n" + a.length);
		boolean check = true;
		for (int index = 0; index < a.length; index++) {
			if (a[index] != a[a.length - 1 - index]) {
				System.out.println("\nĐây không phải là số đối xứng");
				check = false;
				break;
			}
		}
		if (check == true) {
			System.out.println("\nĐây là số đối xứng");
		}
	}

}