package logic;
//Viết chương trình kiểm tra 1 số có phải là lũy thừa của 2 hay không
public class LuyThua {
	public static void main(String[] args) {
		System.out.println("==> " + isPower(3,9));
	}
	
	private static boolean isPower(int a, int b) {
		// log(n)/log(2) = SN ?
		double log = a > b ? Math.log(a)/Math.log(b) : Math.log(b)/Math.log(a);
		return Math.ceil(log) == Math.floor(log);
	}
}
