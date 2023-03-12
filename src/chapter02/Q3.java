package chapter02;

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("값을 넣으시오 : ");
		int a = sc.nextInt();
		
		int[] plus = new int[a];
		
		for(int i = 0; i < a; i++) {
			System.out.print("plus[" + i + "] = ");
			plus[i] = sc.nextInt();
		}
		
		System.out.println("총 합 : ");
		
		sum(plus);
		
	}
	
	static void sum(int[] a) {
		int num = 0;
		
		for(int i = 0; i < a.length; i++)
			num += a[i];
		
		System.out.println(num);
	}
}
