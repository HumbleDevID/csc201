import java.util.Scanner;
import java.util.InputMismatchException;

public class ExceptionTryIt {
    //Scanner keyinput = new Scanner(System.in);
    public static double value = 1.0, summation 0.0;
    public static double CompleteSum(double val, double sum) {
      try {
          value = keyinput.nextDouble();
          summation += value;
        } catch (InputMismatchException e){
            System.out.println("Your input is invalid, please try again!");
              keyinput.nextLine();
            }
          }
          return summation;

    public static void main(String[] args) {
      Scanner keyinput = new Scanner(System.in);
      //double value = 1.0, summation = 0.0;

      do {
            System.out.println("Enter a Value (To Terminate, enter 0):");
              CompleteSum();
              /* try {
                  value = keyinput.nextDouble();
                  summation += value;
          } catch (InputMismatchException e){
            System.out.println("Your input is invalid, please try again!");
                keyinput.nextLine();
          } */
      } while(value != 0);
      System.out.println("The Complete sum is " + summation);
    }
}
