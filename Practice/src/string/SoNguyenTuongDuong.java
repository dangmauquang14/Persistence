package string;

public class SoNguyenTuongDuong {

	public static void main(String[] args) {
		System.out.println(Analysis(12,18));
	}
	private static boolean Analysis(long a, long b) {
		int n = (int) ((a > b) ? Math.sqrt(a) : Math.sqrt(b)); //xac dinh chieu dai cua mang

		long temp = ((a > b) ? a : b);
		long temp1 = ((a > b) ? b : a);

		long[] arr = new long[n];
		int count = 0;
		// phân tích thừa số nguyên tố cho số lớn hơn
		for (long i = 2; i <= temp; i++) {
			if (temp % i == 0) {
				arr[count++] = i;
				temp /= i;
			}
		}
		// lấy số nhỏ hơn chia cho các thừa số phân tích được
		for (int i = 0; i < count; i++) {
			if (temp1 % arr[i] != 0)
				return false;
		}
		return true;
	}
}
