package test;
// Viết chương trình tính tổng S = 4! +7! + 12! + 18!
public class GiaiThua {
	public static void main(String[] args) {
		long sum = Factorial(4) + Factorial(3) + Factorial(2);
		System.out.println("Tổng giai thừa là: " + sum);
	}
	
	public static long Factorial(int n) {
		long result = 1;

		for (int i = n; i > 0; i--){
			result = result * i;
		}
		
		return result;
	}
}
