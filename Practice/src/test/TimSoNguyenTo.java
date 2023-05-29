package test;

public class TimSoNguyenTo {
	public static void main(String[] args) {
		System.out.println(isPrimeNumber(100));
		System.out.println(findPrimeNumber(3));
	}
	
	public static boolean isPrimeNumber(int n) {
        // so nguyen n < 2 khong phai la so nguyen to
        if (n < 2) {
            return false;
        }
        // check so nguyen to khi n >= 2
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
	
	private static int findPrimeNumber(int index) {
		int i = 0;
		int count = 0;
		for (i = 0; i <= 10000000; i++) {

			if (isPrimeNumber(i)) {
				count++;
			}
			
			if (count == index) {
				break;
			}
		}
		return i;
	}
}
