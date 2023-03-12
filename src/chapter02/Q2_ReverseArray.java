package chapter02;

import java.util.Arrays;
import java.util.Scanner;

public class Q2_ReverseArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("요솟수 : ");
		int num = sc.nextInt();
		
		int[] x = new int[num];
		
		for(int i = 0; i < num; i++) {
			System.out.print("x[" + i + "] : ");
			x[i] = sc.nextInt();
		}
		
		reverse(x);
		
		System.out.println("요소를 역순으로 정렬했습니다.");

	}
	
	static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}
	
	static void reverse(int[] a) {
		System.out.println(Arrays.toString(a));
		for(int i = 0; i < a.length / 2; i++) {
			System.out.println("x[" + i + "]와 x[" + (a.length -i - 1) + "]를 교환합니다." );
			swap(a, i, a.length - i - 1);
			System.out.println(Arrays.toString(a));
		}
	}
}
