package chapter01;

import java.util.Scanner;

public class Q8_Sum {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 a : ");
		int a = sc.nextInt();
		System.out.print("정수 b : ");
		int b = sc.nextInt();
		
		System.out.println("합 : " + sumof(a, b));
	}
	
	static int sumof(int a, int b) {
		
		int max = 0;
		int min = 0;
		
		if(a < b) {
			max = b;
			min = a;
		} else {
			max = a;
			min = b;
		}
		
		int sum = 0;
		
		for(int i = min; i <= max; i++) {
			sum += i;
		}
		return sum;
	}
}
