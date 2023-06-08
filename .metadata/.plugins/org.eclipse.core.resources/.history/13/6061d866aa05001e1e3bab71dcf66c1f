package string;

import java.util.Scanner;

public class ChuyenDoiHoVaTen {
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		do {
			System.out.println("Nhập họ và tên: ");
			String name = sc.nextLine();

			if (name.matches("[a-zA-Z\s]{1,}")) {
				System.out.println(format(name));
				break;
			}
		} while (true);
	}

	private static String format(String text) {
		String formattedWord = "";
		String[] words = text.split("[\\s]{1,}");
		for (String word : words) {
			char firstLetter = word.charAt(0);
			formattedWord += Character.toUpperCase(firstLetter) + word.substring(1).toLowerCase() + " ";
		}
		return formattedWord;
	}

}
