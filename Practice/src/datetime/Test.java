package datetime;

public class Test {
	public static void main(String[] args) {
		Integer a = 5;
		print(a);
	}
	
	public static  <T extends Number> void print(T number){
		System.out.println(number);
	}
}


