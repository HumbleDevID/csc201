import java.util.Scanner;

public class Hex2Dec {
	// Main method
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);// Creating Scanner


		System.out.print("Enter a hexadecimal number: ");// Prompting user to enter a string
		String hex = input.nextLine();

		try {
			System.out.println("The decimal number for the hexidecimal value "
				+ hex + " is " + hexToDecimal(hex.toUpperCase()) + "."); // Output of Rrsults if value is acceptable.
		}
		catch (HexFormatException ex) {
			System.out.println(ex.getMessage()); // Output of results if value is not acceptable. Refers to separate HexFormatException class.
		}
	}

	//Numerical Value Conversion Method
	public static int hexToDecimal(String hex) throws HexFormatException {
		int decimalValue = 0;
		for (int i = 0; i < hex.length(); i++) {
			if (!((hex.charAt(i) >= '0' && hex.charAt(i) <= '9') ||
				 (hex.charAt(i) >= 'A' && hex.charAt(i) <= 'F')))
				throw new HexFormatException(hex);
			char hexChar = hex.charAt(i);
			decimalValue = decimalValue * 16 + hexCharToDecimal(hexChar);
		}

		return decimalValue;
	}
	//Character Conversion Method
	public static int hexCharToDecimal(char ch) {
		if (ch >= 'A' && ch <= 'F')
			return 10 + ch - 'A';
		else
			return ch - '0';
	}
}
