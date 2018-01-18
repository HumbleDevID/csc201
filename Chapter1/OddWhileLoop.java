import java.util.*;
 public class OddWhileLoop {
     public static void main(String[] args){
       System.out.println("Odd Numbers Delivered Using a While Loop:");
       int i = 1;
	      do {
				    System.out.print(i);
            System.out.print(",");
            i+=2;
        } while (i < 100);
    System.out.println(" ");
    System.out.println("Done.");
    }
}
