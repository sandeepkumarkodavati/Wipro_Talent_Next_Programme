package M1_LogicBuilding;

import java.util.*;

public class IsEven {
	 static int Even(int N){
		if(N%2== 0) {
			return 2;
		}
		return 1;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int N=sc.nextInt();
		System.out.println(Even(N));

	}

}

