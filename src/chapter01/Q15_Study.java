package chapter01;

import java.util.Scanner;

public class Q15_Study {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a;
		
		do {
			System.out.print("별 갯수 지정 : ");
			a = sc.nextInt();
		} while (a <= 0);
		
		triangleLB(a);
		System.out.println();
		triangleLU(a);
		System.out.println();
		triangleRU(a);
		System.out.println();
		triangleRB(a);
		
		
	}
	
	static void triangleLB(int a) {
		for(int i = 1; i <= a; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
	
	static void triangleLU(int a) {
		for(int i = 1; i <= a; i++) {
			for(int j = 1; j <= a-i+1; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
	
	static void triangleRU(int a) {
		for(int i = 1; i <= a; i++) {
			for(int j = 1; j <= i-1; j++)
				System.out.print(" ");
			for(int j = 1; j <= a-i+1; j++)
				System.out.print("*");
			System.out.println("");
		}
	}
	
	static void triangleRB(int a) {
		for(int i = 1; i <= a; i++) {
			for(int j = 1; j <= a-i; j++)
				System.out.print(" ");
			for(int j = 1; j <= i; j++)
				System.out.print("*");
			System.out.println("");
		}
	}
}
