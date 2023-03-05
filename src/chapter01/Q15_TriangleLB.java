package chapter01;

import java.util.Scanner;

public class Q15_TriangleLB {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a;
		
		do {
			System.out.print("숫자를 입력하세요 : ");
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
	
	static void triangleLB(int n) {
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	static void triangleLU(int n) {
		for(int i = 1; i<= n; i++) {
			for(int j = 1; j <= n-i+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	static void triangleRU(int n) {
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= i-1; j++)		// i-1개의 ' '를 출력
				System.out.print(' ');
			for(int j = 1; j <= n-i+1; j++)		// n-i+1개의 '*'를 출력
				System.out.print('*');
			System.out.println();
		}
	}
	
	static void triangleRB(int n) {
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= n-i; j++)
				System.out.print(' ');
			for(int j = 1; j <= i; j++)
				System.out.print('*');
			System.out.println();
		}
	}
}
