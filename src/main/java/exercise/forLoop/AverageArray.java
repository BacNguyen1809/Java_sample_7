/*
	* @author bacng
	* @ Date Jun 11, 2022
*/
package exercise.forLoop;

import java.util.Scanner;

public class AverageArray {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Input length Array: ");
		int sum = 0;
		double average =0.0d;
		int n = Integer.parseInt(scanner.nextLine());	
		int[] arr = new int [n];
		//input value for Array
		for (int i = 0; i < n; i++) {
			System.out.println("Input Array[ "+i+" ]");
			arr[i] = Integer.parseInt(scanner.nextLine());
		}
		//Calculate Average Array
		for (int i = 0; i < n; i++) {
			sum += arr[i];			
		}
		average = sum/n;
		System.out.println("Average of all elemet in Array: "+average);
		
		
	}
	

}
