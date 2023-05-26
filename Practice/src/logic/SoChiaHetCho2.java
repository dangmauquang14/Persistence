package logic;

//Bài 1:Viết chương trình kiểm tra 1 số có phải là lũy thừa của 2 hay không
public class SoChiaHetCho2 {
	
	public static void main(String[] args) {
		System.out.println(isPowerOf2(16));
	}
	
	private static boolean isPowerOf2(int n) {
		// log(n)/log(2) = SN ?
		double log = Math.log(n) / Math.log(2);
		System.out.println(n + " ==> " + log);
		return Math.ceil(log) == Math.floor(log);
	}
}
