package chapter01;

import java.util.Scanner;

public class Q16_Triangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a;
		
		do {
			System.out.print("별 개수 입력 : ");
			a = sc.nextInt();
		} while (a <= 0);
		
		spira(a);
		System.out.println();
		npria(a);
	}
	
	static void spira(int n) {
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= n-i; j++)
				System.out.print(" ");
			for(int j = 1; j <= (i-1)*2+1; j++)
				System.out.print("*");
			System.out.println();
		}
	}
	
	static void npria(int n) {
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= n-i; j++)
				System.out.print(" ");
			for(int j = 1; j <= (i-1)*2+1; j++)
				System.out.printf("%d", i % 10);
			System.out.println();
		}
	}
}
