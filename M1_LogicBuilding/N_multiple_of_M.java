package M1_LogicBuilding;
import java.util.*;

public class N_multiple_of_M {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int M=sc.nextInt();
		if(N%M==0) {
			System.out.println("TRUE");
		}
		else {
			System.out.println("FALSE");
		}
	}

}
