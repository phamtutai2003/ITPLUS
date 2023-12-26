package Ex2;

import java.util.Scanner;

public class Factorial{
 
	public static long factorial(int n)

{
        if (n == 0) {
            return
 
1;
        } else {
            return n * factorial(n - 1);
        }
    }
 
	public static void main(String[] args){
    	
    	Scanner sc = new Scanner(System.in);

        // Nhập vào số tự nhiên n
        System.out.print("Nhập vào số tự nhiên n: ");
        int n = sc.nextInt();

        // Tính n!

        
        long result = factorial(n);

        // In ra kết quả
        System.out.println("n! = " + result);
    }
}
