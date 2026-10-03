package tasks;

import java.util.Scanner;


public class selection_tasks_2 {

	public static void main(String[] args) {
		
		//If elif else
		
		//Find the largest number among three integers
//		int a = 33;
//		int b = 43;
//		int c = 14;
//		
//		if (a>b && a>c) {
//			System.out.println(a + " is greater");
//		}
//		
//		else if (b>a && b>c) {
//			System.out.println(b + " is greater");
//		}
//		
//		else {
//			System.out.println(c + " is greater");
//		}
	
		
		//Check if a given number is greater than 0, if yes then print 'Positive'. If the given number is lesser than 0, then print 'Negative'. If the given number is exactly equal to 0, then print 'Zero'
//		int a = 45;
//		
//		if (a > 0) {
//			System.out.println("Positive");
//		}
//		
//		else if (a < 0) {
//			System.out.println("Negative");
//		}
//		
//		else {
//			System.out.println("Zero");
//		}
		
		//Write a program that functions as a basic calculator. The program will prompt the user to input two numbers and a mathematical operation (+, -, x, /). It will then perform the selected operation and display the result on the screen.
        Scanner s = new Scanner(System.in);
        
        System.out.println("Enter first number: ");
        int a = s.nextInt();
        
        System.out.println("Enter the operation: ");
        char o = s.next().charAt(0);
        
        System.out.println("Enter the second number: ");
        int b = s.nextInt();
        
        if (o == '+') {
            System.out.println(a + " + " + b + " = " + (a + b));
        } else if (o == '-') {
            System.out.println(a + " - " + b + " = " + (a - b));
        } else if (o == '*') {
            System.out.println(a + " x " + b + " = " + (a * b));
        } else if (o == '/') {
            System.out.println(a + " / " + b + " = " + (a / b));
        } else {
            System.out.println("Invalid operator!"); 
        }
	        
	}

}
