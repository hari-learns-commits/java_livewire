package tasks;

import java.util.Scanner;

public class buzz_number {

	public static void main(String[] args) {
		// A number is said to be Buzz Number if it ends with 7 or is divisible by 7. Example: 1007 is a Buzz Number. Define a class Buzz number to read a number and check if it is a Buzz number or not.
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (number % 7 == 0 || number % 10 == 7) {
            System.out.println(number + " is a Buzz Number.");
        } 
        
        else {
            System.out.println(number + " is not a Buzz Number.");
        }

	}

}
