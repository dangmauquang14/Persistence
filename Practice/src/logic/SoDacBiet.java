package logic;

import java.util.Scanner;

public class SoDacBiet {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập số cần check: ");
		int number = sc.nextInt();
		System.out.println(CheckSpecialNumber(number));
	}
	
	public static boolean CheckSpecialNumber(int number) {
		int sum = 0;
		for(int i = 0; i < number/2; i++) {
			sum += i;
			if(sum == number) {
				return true;
			}
		}
		return false;
	}
}
