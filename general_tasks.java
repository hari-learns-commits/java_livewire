package tasks;

public class general_tasks {

	public static void main(String[] args) {
	
	// Hello World Program		
		System.out.println("Hello World");
		
	//arithmetic operations
		int a = 12;
		int b = 27;
		
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);
		
	//algebraic operations
		int c = 5;
		int d = 6;
		
		//(a+b)^2
		System.out.println("(a+b)^2 = " + (c+d) * (c+d));
		
		//(a-b)^2
		System.out.println("(a-b)^2 = " + (c-d) * (c-d));
		
		//(a^2) - (b^2)
		System.out.println("a^2 - b^2 = " + (c*c) * (d*d));
		
		
		//Area of a triangle
		int base = 9;
		int height = 11;
		double area = 0.5 * base * height;
		System.out.println("Area of the given Triangle is : " + area);
		
		
		//swapping with third variable
		int var1 = 10;
		int var2 = 20;
		
		int temp = var1;
		var1 = var2;
		var2 = temp;
		
		System.out.println("Variable 1 = " + var1);
		System.out.println("Variable 2 = " + var2);
		
		
		//Swapping without a third variable
		int var_1 = 100;
		int var_2 = 200;

		var_1 = var_1 + var_2;
		var_2 = var_1 - var_2;
		var_1 = var_1 - var_2;

		System.out.println("Variable 1 = " + var_1);
		System.out.println("Variable 2 = " + var_2);
		
		
		//km to miles
		int km = 10;
		double miles = km * 0.63;

		System.out.println(km + " kilometers = " + miles + " miles");
		
		
		//celsius to farenheit
		double celsius = 25;
        double fahrenheit = (celsius * 1.8) + 32;

		System.out.println("Celsius = " + celsius);
		System.out.println("Fahrenheit = " + fahrenheit);
		
		
		//finding the last digit of a number
		int num = 43353;
		int last_digit = num % 10;
		
		System.out.println("The last digit of " + num + " is " + last_digit);
		
		
		//finding the last two digits of a number
		int number = 1828395;
		int last_two_digits = number % 100;
		
		System.out.println("The last two digits of " + number + " is " + last_two_digits);
		
		
		//

	}

}
