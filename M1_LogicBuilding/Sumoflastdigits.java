package M1_LogicBuilding;
import java.util.*;
import java.math.*;

public class Sumoflastdigits {
	static int Findsumoflastdigits(int a,int b) {
		int sum=Math.abs(a%10)+Math.abs(b%10);
		return sum;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number:");
		int input1=sc.nextInt();
		System.out.println("Enter second number:");
		int input2=sc.nextInt();
		System.out.print("Sum of last digits:");
		System.out.println(Findsumoflastdigits(input1,input2));

	}

}
