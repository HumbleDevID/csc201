import java.util.Scanner;

public class AuthenticationLoopA { // begin AuthenticationLoopA Assignment...
  public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        boolean pass = true;
        String username;
        String password;
        int count = 0;

        do{
        System.out.println("Proceed to Login:");
        System.out.println("Enter your Username: ");
        username = input.next();

        System.out.println("Enter Your Password: ");
        password = input.next();
    //users check = new users(username, password);

    if(username.equals("HumbleDevID") && password.equals("ToANewBegining2"))
    {
      System.out.println("Login successful!");
      System.out.println("You are entering a new level in your programming skills!");
      pass = false;
      // Enter a possible program/main class here, if you wish.
    }
    else
    {
       System.out.println("Invalid username and password");
       System.out.println("Uh Oh, Looks like you'll need to try again.");
     }
     count ++;
   } while (count <= 2&&pass );
  }
}
