package day1;

import java.util.*;
public class Example3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int N=sc.nextInt();
		if(N%2 == 0) {
			System.out.println("Even number");
		}
		else {
			System.out.println("Odd number");
		}
	}

}
