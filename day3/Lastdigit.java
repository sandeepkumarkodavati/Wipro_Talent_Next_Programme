package day3;

import java.util.*;
import java.math.*;

public class Lastdigit {
	static int Findlastdigit(int N) {
		return Math.abs(N%10);
				
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int N =sc.nextInt();
        System.out.println(Findlastdigit(N));
	}

}
