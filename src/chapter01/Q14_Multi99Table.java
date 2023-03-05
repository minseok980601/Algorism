package chapter01;

import java.util.Scanner;

public class Q14_Multi99Table {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a;
		
		System.out.println("사각형을 출력합니다.");
		System.out.print("단 수 : ");
		a = sc.nextInt();
		
		for(int i = 1; i <= a; i++) {
			for(int j = 1; j <= a; j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}
}
