package LabOne;

public class LabOne {
	
	public static void firstTask() {
		//Task number one
		System.out.println("Hello, World!");
		//print hello world
	}
	
	public static void secondTask() {
		//Task number two
		int x = 10;
		String message = "The Number is";
		System.out.println(message + " " + x);
		//print message and variable
	}
	
	public static void thirdTask() {
		//Task number three
		int number = 15;
		if (number/2 == 0) {
			System.out.println("Even");
			//print even if number is even
		} else {
			System.out.println("Odd");
			//print off if number is odd
		}
	}
	
	public static void fourthTask() {
		//Task number 4
		for (int i = 0; i < 5; i++) {
			System.out.println(i);
		//print 0, 1, 2, 3, 4
		}
		
	}
	
	public static String fifthTask(String name) {
		//Task number 5
		return "Hello, " + name;
		//return string + name
		
	}
	//Exercise six on other file
	
	public static void seventhTask() {
		//Task number 7
		int[] num = {1, 2, 3, 4, 5};
		for (int nums : num) {
			System.out.println(nums);
		}
		
		//print numbers with for-each
		
	}
	
	public static void eighthTask() {
		//Task number 8
		try {
			int NaN = 10/0;
		} catch (ArithmeticException e){
			System.out.println("Division by zero is not allowed");	
		}
		//Handle an exception
		
		
	}
	
	public static void main(String[] args) {
		
		firstTask();
		secondTask();
		thirdTask();
		fourthTask();
		System.out.println(fifthTask("Tony"));
		seventhTask();
		eighthTask();
	}

}
