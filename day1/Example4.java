package day1;

import java.util.*;

public class Example4 {

	public static void main(String[] args) {
		System.out.println("Enter a:");
		Scanner sc = new Scanner(System.in);
		int a= sc.nextInt();
		System.out.println("Enter b:");
		int b=sc.nextInt();
		int c=a+b;
		if(c%2==0) {
			System.out.println("Sum is even");
		}
		else {
			System.out.println("Sum is odd");
		}

	}

}
