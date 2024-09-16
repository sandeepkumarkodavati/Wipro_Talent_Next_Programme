package day1;
import java.util.*;

public class Example2 {

	public static void main(String[] args) {
		System.out.println("Enter a:");
		Scanner sc = new Scanner(System.in);
		int a= sc.nextInt();
		System.out.println("Enter b:");
		int b=sc.nextInt();
		if(a>b) {
			System.out.println(a+"is greater");
		}
		else {
			System.out.println(b+"is greater");
		}
	}

}
