package fundamentals;
import java.util.*;

public class Handson1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int N =sc.nextInt();
		if(N>0) {
			System.out.println("positive");
		}
		else if(N<0) {
			System.out.print("negative");
		}
		else {
			System.out.println("Zero");
			
		}

	}

}
