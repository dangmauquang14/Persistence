package logic;

import java.util.Arrays;

public class TimSoChiXuatHien1LanTrongMang {
	public static void main(String[] args) {
		int[] elements = {3, 15, 21, 19, 3, 15, 17, 21};
		int[] foundElements = getUniqueElements(elements);
		sort(foundElements);
		for (int element : foundElements) {
			System.out.print(element + "  ");
		}
	}
	
	// 3, 15, 21, 19, 3, 15, 17, 21, 3
	// t  t   t   f  t  t   f   t   t
	private static int[] getUniqueElements(int[] elements) {
		boolean[] flags = new boolean[elements.length];
		for (int pivotIndex = 0; pivotIndex < elements.length; pivotIndex++) {
			if (flags[pivotIndex]) continue; // neu so do da ton tai thi se bo qua
			for (int i = 0; i < elements.length; i++) {
				if (pivotIndex != i && elements[pivotIndex] == elements[i]) {
					flags[pivotIndex] = true;
					flags[i] = true;
				}
			}
		}
		int[] result = new int[elements.length];
		int count = 0;
		for (int i = 0; i < flags.length; i++) {
			if (!flags[i]) {
				result[count++] = elements[i];
			}
		}

		return Arrays.copyOfRange(result, 0, count);
	}
	
	public static void sort(int[] elements) {
		for (int select = elements.length - 1; select > 0; select--) {
			for (int run = 0; run < select; run++) {
				if (elements[run] > elements[select]) {
					// swap
					int tmp = elements[run];
					elements[run] = elements[select];
					elements[select] = tmp;
				}
			}
		}
	}
}
