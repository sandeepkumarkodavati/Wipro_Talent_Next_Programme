package M1_LogicBuilding;
import java.util.*;

public class Is_Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int count=0;
		
		for(int i=1;i<=N;i++) {
			if(N%i==0) {
				count++;
			}
			if(count==2) {
				System.out.println("Prime");
				
			}
			else {
				System.out.println("Not Prime");
			}
		}

	}

}
