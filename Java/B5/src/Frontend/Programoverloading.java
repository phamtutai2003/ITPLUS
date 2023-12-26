package Frontend;




public class Programoverloading {
	public  static int sum (int a, int b) {
		return a+b;
	}
	public static float sum (float a, float b) {
		return a+b;
	}
	public static double tinhtong (double a, double b) {
		return a-b;
	}
	public static void nhapso(int a) {
		System.out.println("So int");
	}
	public static void nhapso(double a) {
		System.out.println("So double");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println( tinhtong(3,4));
		
		nhapso(5);
		nhapso(5.0);
		
	}

}
