public class IntroToJavaChpt5_18B {
	public static void main(String[] args) {
		// Demonstration of Pattern A
		System.out.println("Displaying Pattern B");
		for (int rows = 6; rows >= 1; rows--) {
			for (int columns = 1; columns <= rows; columns++) {
				System.out.print(columns + " ");
			}
			System.out.println();
		}
	}
}
