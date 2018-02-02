public class IntroToJavaChpt5_18A {
	public static void main(String[] args) {
		// Demonstration of Pattern A
		System.out.println("Displaying Pattern A");
		for (int rows = 1; rows <= 6; rows++) {
			for (int columns = 1; columns <= rows ; columns++) {
				System.out.print(columns + " ");
			}
			System.out.println();
		}
	}
}
