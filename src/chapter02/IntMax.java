package chapter02;

public class IntMax {

	public static void main(String[] args) {
		
		int[] a = {10, 5, 30, 29, 18};
		
		int max = a[0];
		
		for(int i = 0; i < a.length; i++) {
			if(a[i] > max)
				max = a[i];
			System.out.println("최댓값 : " + max);
		}
	}
}
