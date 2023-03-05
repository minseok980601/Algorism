package chapter01;

import java.util.Scanner;

public class Q10_SumForPos {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a;
		int b;
		int c;
		
		System.out.print("a의 값 : ");
		a = sc.nextInt();
		
		do {
			System.out.print("b의 값 : ");
			b = sc.nextInt();
			
			if (a > b) {
				System.out.println("a보다 큰 값을 입력하세요!");
			}
		} while (a > b);
		
		c = b - a;
		
		System.out.println("b - a는" + c + "입니다.");
		
		
	}
}
