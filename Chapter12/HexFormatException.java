// Implement HexFormatException class
public class HexFormatException extends NumberFormatException {
	private String hex; // Hex exception value

	//HexFormatException Used in Hex2Dec
	public HexFormatException(String hex) {
		super(hex + " is not a hexadecimal string.");
		this.hex = hex;
	}

	/** Return hex exception value */
	public String getHex() {
		return hex;
	}
}
