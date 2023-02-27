package com.acts.number;

import java.util.Scanner;

public class GreatestNum {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first number: ");
		int num1 = sc.nextInt();
		
		System.out.println("Enter first number: ");
		int num2 = sc.nextInt();
		
		if(num1 > num2)
			System.out.println(num1 + " is greater than " + num2);
		else if(num1==num2)
			System.out.println("Both numbers are equal!");
		else
			System.out.println(num2 + " is greater than " + num1);

	}

}
