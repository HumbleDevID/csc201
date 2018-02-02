public class IntroToJavaChpt5_18D {
	public static void main(String[] args) {
		// Demonstration of Pattern D
		System.out.println("Displaying Pattern D");
		for (int rows = 0; rows < 6; rows++) {
			for (int spaces = 0; spaces < rows; spaces++) {
				System.out.print("  ");
			}
			for (int columns = 0; columns < 6 - rows; columns++) {
				System.out.print((columns + 1) + " ");
			}
			System.out.println();
		}
	}
}
