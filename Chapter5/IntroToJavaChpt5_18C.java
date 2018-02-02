public class IntroToJavaChpt5_18C {
	public static void main(String[] args) {
		// Demonstration of Pattern C
		int numberOfLines = 6;
		System.out.println("Displaying Pattern C");
		for (int rows = 1; rows <= numberOfLines; rows++) {
			for (int start = numberOfLines - rows; start >= 1; start--) {
				System.out.print("  ");
			}
			for (int columns = rows; columns >= 1; columns--) {
				System.out.print(columns + " ");
			}
			System.out.println();
		}
	}
}
