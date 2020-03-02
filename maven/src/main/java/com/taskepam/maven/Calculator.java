package com.taskepam.maven;
import java.util.Scanner;
public class Calculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		MathOperation mp = new MathOperation();
		System.out.println("Enter the numbers to perform operations");
		double a = sc.nextInt();
		double b = sc.nextInt();
		System.out.println("Select the operations need to be done from --> +,-,*,/");
		System.out.println("Enter 1 for Addition" + "\n" +"Enter 2 for Substraction" + "\n" + "Enter 3 for Multiplication" + "\n" + "Enter 4 for Division");
		int option = sc.nextInt();
		switch(option){
		case 1:
			System.out.println("Answer is : " + mp.add(a,b));
			break;
		case 2:
			System.out.println("Answer is : " + mp.substract(a,b));
			break;
		case 3:
			System.out.println("Answer is : " + mp.multiply(a,b));
			break;
		case 4:
			System.out.println("Answer is : " + mp.divide(a,b));
			break;
		default:
			System.out.println("Invalid option entered");
			
		}
	}
}
