package M1_LogicBuilding;

import java.util.*;
import java.math.*;

public class Secondlastdigit {
	static int Findsecondlastdigit(int N) {
		N=Math.abs(N);
		if(N>10) {
		return (N/10)%10;
		}
		else {
			return -1;
		}
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int N =sc.nextInt();
        System.out.println(Findsecondlastdigit(N));
	}

}
