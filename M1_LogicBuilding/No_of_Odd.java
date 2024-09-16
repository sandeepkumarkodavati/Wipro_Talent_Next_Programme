
package M1_LogicBuilding;
import java.util.*;

public class No_of_Odd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int count=0;
		int arr[]=new int[N];
		for(int i=0;i<N;i++) {
			arr[i]=sc.nextInt();
			if(arr[i]%2!=0) {
				count++;
			}
		}
		System.out.println(count);
	}

}
