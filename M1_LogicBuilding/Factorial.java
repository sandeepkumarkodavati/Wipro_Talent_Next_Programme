package M1_LogicBuilding;
import java.util.*;

public class Factorial {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
    int N=sc.nextInt();
    int fact=1;
	for(int i=1;i<=N;i++){
		fact=i*fact;
		}
	System.out.println(fact);
	}
}

