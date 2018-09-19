/**Pogram: Sum of Integer Program
*File: SumOfInteger.java
*Summary: Computes the sum of a 5-digit integer
*Author: Pearl Jomalon
*Date: September 16, 2018
**/


import java.util.Scanner;

public class SumOfInteger {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		System.out.print("Enter 5-digit number:");
		int number = scanner.nextInt();
		int sumOfInteger = findSumOfInteger (number);
		System.out.print("Sum of 5-digit number is:" + sumOfInteger);
		
		scanner.close();
	
	}
	public static int findSumOfInteger (int number)  {
		int sum = 0;
		while (number > 0)  {
			int digit = number % 10;
			number = number / 10;
			sum += digit;
			
		}
		return sum;
	}

}
