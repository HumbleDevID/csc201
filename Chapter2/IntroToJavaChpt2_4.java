import java.util.Scanner; //Bringing in Scanner Utility

public class IntroToJavaChpt2_4 {
	public static void main(String[] args) {
		Scanner lbsinput = new Scanner(System.in);  //Adding a New Scanner
		double kilolbs = 0.454;  //Declare Fixed Variables

		System.out.print("Enter a Numerical Weight in Pounds (lbs):");  // Prompt for User
		double lbs = lbsinput.nextDouble();

		double kilo = lbs * kilolbs;  // Conversion

		System.out.println(lbs + " Pounds is " + kilo + " in Kilograms! Throw Away Your Calculator!");  //Output Displayed
		System.out.println("Execute the Program Again to Make Another Conversion.");
	}
}
