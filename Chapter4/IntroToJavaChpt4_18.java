import java.util.Scanner;

public class IntroToJavaChpt4_18{
    public static void main(String[] args)
    {
        Scanner keyinput = new Scanner(System.in);

        System.out.println("Welcome to A Case Study on Switch Cases");
        System.out.println("Consecutively enter in a 'Course of Study' code, then the number of years studied by a student:");
        System.out.println("Applicable 'Course of Study' codes: M = Mathematics, C = Computer Science, I = Information Technology.");
        String status = keyinput.next();

        char majorChoice = Character.toUpperCase(status.charAt(0));
        char yearsStudied = status.charAt(1);

        String majorName = "";
        String yearName = "";

        if (majorChoice == 'M' || majorChoice == 'I' || majorChoice == 'C')
        {
            switch(majorChoice)
            {
                case 'M':
                    majorName = "Mathematics.";
                    break;
                case 'C':
                    majorName = "Computer Science.";
                    break;
                case 'I':
                    majorName = "Information Technology.";
                    break;
                default:
                    majorName = "[INVALID INPUT]";
                    break;
            }

            switch(yearsStudied)
            {
                case '0':
                    yearName = "Noob.";
                    break;
                case '1':
                    yearName = "Freshman.";
                    break;
                case '2':
                    yearName = "Sophmore.";
                    break;
                case '3':
                    yearName = "Junior.";
                    break;
                case '4':
                    yearName = "Senior.";
                    break;
                case '5':
                    yearName = "Super Senior.";
                    break;
                case '6': case '7': case '8': case '9':
                    yearName = "Graduate Student.";
                    break;
                default:
                    yearName = "[INVALID INPUT]";
                    break;
            }
            System.out.println("Your Major is " + majorName);
            System.out.println("You Are a " + yearName);
        }
        else{
            System.out.println("Invalid Input. Why don't you try again?");
        }
    }
}
