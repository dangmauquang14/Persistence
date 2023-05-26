package utils;

public class Utils {
	
	private Utils() {
		
	}
	
	public static void swap(String[] source, int i, int j) {
		String tmp = source[i];
		source[i] = source[j];
		source[j] = tmp;
	}
	
	public static void sort(String[] source, CompareStringHelper helper) {
		for (int round = 0; round < source.length; round++) {
			for (int i = 0; i < source.length - round - 1; i++) {
				if (helper.compare(source[i], source[i + 1]) >  0) {
					swap(source, i, i + 1);
				}
			}
		}
	}
	
	public static void swap(int[] source, int i, int j) {
		int tmp = source[i];
		source[i] = source[j];
		source[j] = tmp;
	}
}
