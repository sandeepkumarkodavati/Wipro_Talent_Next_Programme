package fundamentals;

import java.util.*;

public class handson2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number:");
		int First=sc.nextInt();
		System.out.println("Enter second number:");
		int Second=sc.nextInt();
		if((First%10)==(Second%10)) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
		}

}
