package test;

public class TimDoDaiLonNhatCuaDayCon {

	public static void main(String[] args) {
		String s = "aaabaaabbaaaaa";
		subString(s);
	}

	private static void subString(String string) {

		String maxString = "";
		String minString = "";
		int largestLength = 0;
		int smallestLength = string.length();
		int length = 1;
		int indexMin = 0;
		int indexMax = 0;

		for (int i = 1; i < string.length(); i++) {
			if (string.charAt(i - 1) == string.charAt(i)) {
				length++;

			} else {

				if (length < smallestLength) {
					smallestLength = length;
					indexMin = i - length;
					minString = string.substring(indexMin, i);
				}

				length = 1;
			}
			if (length > largestLength) {
				largestLength = length;
				indexMax = i - length + 1;
				maxString = string.substring(indexMax, i + 1);
			}

		}
		System.out.println(
				"Độ dài lớn nhất của dãy con đúng: " + largestLength + "   " + maxString + "   [" + indexMax + "]");
		System.out.println(
				"Độ dài nhỏ nhất của dãy con đúng: " + smallestLength + "   " + minString + "   [" + indexMin + "]");

	}
	/*
	 * public static void main(String[] args) { String str = "aaabbbddddcaab"; int
	 * count = 1; int longest = 1; int shortest = 1;
	 * 
	 * for (int i = 1; i < str.length(); i++) {
	 * 
	 * if (str.charAt(i) == str.charAt(i - 1)) { count++; } else { if (count >
	 * longest) { longest = count; } if (count < shortest) { shortest = count; }
	 * count = 1; }
	 * 
	 * } System.out.println("Độ dài lớn nhất của dãy con đúng: " + longest);
	 * System.out.println("Độ dài nhỏ nhất của dãy con đúng: " + shortest);
	 * 
	 * }
	 */
}
