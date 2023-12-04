
public class Test {

	public static void main(String[] args) {
		int num1 = 10;
		double num2= 20;
		System.out.println(num1);
		System.out.println(num2);
		
		num2=num1; // Widening
		System.out.println(num2);
		
		long num3 = 999999999;
		float num4 = 123.456f;
		System.out.println(num3);
		System.out.println(num4);
		num4=num3;
		System.out.println(num4);
		
		int num5 = 'a';
		

	}

}
