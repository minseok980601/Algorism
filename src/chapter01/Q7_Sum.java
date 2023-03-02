package chapter01;

import java.util.Iterator;
import java.util.Scanner;

public class Q7_Sum {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1부터 n까지 더한값을 출력");
		System.out.print("n값 : ");
		int n = sc.nextInt();
		
		int sum = 0;
		
		for(int i = 1; i<= n; i++) {
			sum += i;
		}
		
		System.out.println("1부터 " + n + "까지의 합은 " + sum + "입니다.");
		
		
	}
}
