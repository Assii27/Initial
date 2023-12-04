
public class Test {

	/*public static void main(String[] args) {
		int num1=10;
		double num2 = 20.12;
		
		System.out.println(num1);
		System.out.println(num2);
		num1=(int) num2; // Narrowing
		System.out.println(num1);

	}*/
	/*public static void main(String[] args) {
		double num1=66.55; // Widening
		int num2 = (int) 20.12; // narrowing
		char name = (char) num1; // narrowing
		System.out.println(name);
		
		
		long num3 = 999;
		float num4 = 123.456f;
		//num4 = num3; // widening
		System.out.println(num4);
		//num3 = (long) num4;
		System.out.println(num3);
	

	}*/
	
	/*public static void main(String[] args) {
		boolean status=true;
		char name = 'a';
		
		System.out.println(status);
		System.out.println(name);
		
		status= name; //error - no explicit type casting is possible
		System.out.println(status);

	}*/
	
	/*public static void main(String[] args) {
		byte status=66;
		char name = 120;
		int num2 = 99999999;
		System.out.println(status);
		System.out.println(name);
		
		name= (char) status; 
		System.out.println(name);

	}*/
	
	public static void main(String[] args) {
		float status=66;
		
		boolean num1 =status;
		byte num2 = (byte) status;
		short num3 = (short) status;
		long num4 = (long)status;
		int num5 = (int) status;
		double num6 = status;
		char name =   (char) status;
		System.out.println(status);
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(num4);
		System.out.println(num5);
		System.out.println(num6);
		System.out.println(name);
		

	}
}
