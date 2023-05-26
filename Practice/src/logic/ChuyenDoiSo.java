package logic;
//Viết chương trình chuyển đổi một số tự nhiên ở hệ cơ số 10 thành số ở hệ cơ số 2
import java.util.Scanner;

public class ChuyenDoiSo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập vào số cần chuyển: ");
		int input = sc.nextInt();
		int sum = 0;
		int i = 1;
		do {
			int a = input % 2;
			sum = sum + (i * a);
			input = input / 2;
			i = i * 10;
		} while (input > 0);
		System.out.println("Số nhị phân là:" + sum);

	}	
}
