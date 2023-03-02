package chapter01;

import java.util.Scanner;

public class Q1_Max4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("네 값의 최댓값을 적으시오");
		System.out.println("a의 값");
		int a = sc.nextInt();
		System.out.println("b의 값");
		int b = sc.nextInt();
		System.out.println("c의 값");
		int c = sc.nextInt();
		System.out.println("d의 값");
		int d = sc.nextInt();
		
		System.out.println("최댓값 : " + max4(a, b, c, d));
		
	}
	
	static int max4(int a, int b, int c, int d) {
		int max = a;
		
		if (b > max) {
			max = b;
		}
		if (c > max) {
			max = c;
		}
		if (d > max) {
			max = d;
		} 
		
		return max;
	}
}
