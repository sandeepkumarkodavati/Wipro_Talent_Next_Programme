
package M1_LogicBuilding;
import java.util.*;

public class Evencount_Oddcount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int evencount=0;
		int oddcount=0;
		int arr[]=new int[N];
		for(int i=0;i<N;i++) {
			arr[i]=sc.nextInt();
			if(arr[i]%2==0) {
				evencount++;
			}
			else {
				oddcount++;
			}
		}
		System.out.println(evencount);
		System.out.println(oddcount);
	}

}
