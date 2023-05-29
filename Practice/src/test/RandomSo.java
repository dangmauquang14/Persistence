package test;
/* Viết chương trình random 5 số nguyên ngẫu nhiên từ 20 – 30.
Yêu cầu: 5 số ngẫu nhiên không được trùng nhau */
import java.util.Random;

public class RandomSo {

	public static void main(String[] args) {
		int[] randomNums = new int[5];
		Random rd = new Random();
		for(int i = 0; i < randomNums.length; i++) {
			randomNums[i] = rd.nextInt(11) + 20;
				for(int j = 0; j <= i - 1; j++) {
					if(randomNums[j] == randomNums[i]) {
						i--;
					}
				}
		}
		for(int x : randomNums) {
			System.out.print(x + " ");
		}
	}
}
