package stringequals;

public class StringEquals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String s1 = "Hello";
      String s2 = "Hello";
      String s3 = new String ("Hello");
      
      System.out.println(s1 == s2);
      System.out.println(s1 == s3);
      System.out.println(s1.equals(s3));
	}

}
