package day1;

import java.util.*;

public class Example1 {

	public static void main(String[] args) {
		System.out.println("Enter a number:");
        Scanner sc =new Scanner(System.in);
        int N= sc.nextInt();
        if(N>0) {
        	System.out.println("positive number");
        	}
        else if(N<0) {
           	System.out.println("negative number");
           	}
        else {
	        System.out.println("zero");
	        }
        }
	}
