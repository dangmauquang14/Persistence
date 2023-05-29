package test;

public class KiTuXuatHienNhieuNhatTrongChuoi {
	public static void main(String[] args) {

		String string = "aaaababbbddc";

		char mostUsedChar = 0;
		int largestLength = 0;
		int length = 1;

		for (int i = 1; i < string.length(); i++) {
			if (string.charAt(i - 1) == string.charAt(i)) {
				length++;
			} else {
				length = 1;
			}
			
			if (length > largestLength) {
				largestLength = length;
				mostUsedChar = string.charAt(i);
				
			}

		}
		System.out.println(
				"Độ dài lớn nhất của dãy con đúng: " + largestLength + mostUsedChar);
	}
}
