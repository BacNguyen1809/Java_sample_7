/*
	* @author bacng
	* @ Date Jun 11, 2022
*/
package exercise.forLoop;

public class SumAverageRunningInt {
	public static void main(String[] args) {
		int sum = 0;
		double average;
		int lowerBound = 1;
		int upperBound = 100;
		int count =0;
		for(int i = lowerBound;i<=upperBound;i++) {
			sum += i;
			count++;
		}
		average = sum/count;
		System.out.println("Average of all: "+ average);
	}

}
