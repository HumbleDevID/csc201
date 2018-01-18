import java.util.*;
 public class EvenForLoop {
     public static void main(String[] args){
       System.out.println("Even Numbers Delivered Using a For Loop:");
	for (int i = 1; i < 101; i++) {
			if (i % 2 != 1) {
				System.out.print(i);
        System.out.print(",");
			}
		}
    System.out.println(" ");
    System.out.println("Done.");
    }
}
