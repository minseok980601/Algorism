package chapter01;

import java.util.Scanner;

public class Q2_Max4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("세값의 최솟값을 구하시오");
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		System.out.println("최솟값 : " + min3(a, b, c));
	}
	
	static int min3(int a, int b, int c) {
		int min = a;
		
		if(b < min) {
			min = b;
		} else if (c < min) {
			min = c;
		}
		
		return min;
	}
}
