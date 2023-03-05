package chapter01;

import java.util.Scanner;

public class Q11_SumForPos {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a;
		
		do {
			System.out.println("양의 정수를 입력하세요");
			a = sc.nextInt();
			
			if (a <= 0) {
				System.out.println("다시 입력해주세요.");
			}
		} while (a <= 0);
		
		int dights = 0;
		
		while (a > 0) {
			a /= 10;
			dights++;
		}
		
		System.out.println("그 수는 " + dights + "자리 입니다.");
		
	}
}
