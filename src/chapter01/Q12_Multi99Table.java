package chapter01;

public class Q12_Multi99Table {

	public static void main(String[] args) {
		
		System.out.print(" |");
		for(int i = 1; i <= 9; i++) {
			System.out.printf("%3d", i);
		}
		System.out.println("");
		System.out.println("-+---------------------------");
		for(int a = 1; a <= 9; a++) {
			System.out.print(a + "|");
			for(int b = 1; b <= 9; b++) {
				System.out.printf("%3d", a * b);
			}
			System.out.println("\n");
		}
		
		System.out.println(" |");
	}
}
