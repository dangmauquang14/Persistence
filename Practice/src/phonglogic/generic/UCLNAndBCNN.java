package phonglogic.generic;
	// 14.Nhập 2 số nguyên dương a và b. Sau đó in ra ước số chung lớn nhất (USCLN) và
	// bội số chung nhỏ nhất (BSCNN) của 2 số nguyên dương a và b đó

public class UCLNAndBCNN {
	public static void main(String[] args) {
		int a = 4;
		int b = 3;
		System.out.println(ucln(a,b));
		System.out.println(bcnn(a,b));
	}
	
	private static int bcnn(int a, int b) {
		return (a * b) / ucln(a, b);
	}

	private static int ucln(int a, int b) {
		while (a != b) {
			if (a > b) {
				a = a - b;
			} else {
				b = b - a;
			}
		}
		return a;
	}
}
