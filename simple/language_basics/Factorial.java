package simple;

import java.util.Scanner;

public class Factorial {

	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.close();
		System.out.println("Factorial of " + n + " is " + fact(n));
	}
	
	static int fact(int n){
		int res= 1;
		while(n>0) {
			res *= n;
			n--;
		}
		return res;
	}
}
