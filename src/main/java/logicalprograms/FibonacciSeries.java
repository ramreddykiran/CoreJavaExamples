package logicalprograms;

import java.util.Arrays;
import java.util.List;

public class FibonacciSeries {
	// it prints fibonacciSeries for given count
	public void fibSeries1(int input) {
		int n1 = 0;
		int n2 = 1;
		int n3;
		System.out.print(n1 + "," + n2);
		int i = 2;
		while (i < input) {
			n3 = n1 + n2;
			System.out.print("," + n3);
			n1 = n2;
			n2 = n3;
			i++;
		}
	}
	// it prints fibonacciSeries  until it reaches given number
	public void fibSeries2(int input) {
		int n1 = 0;
		int n2 = 1;
		int n3 =0;
		
		System.out.print(n1 + "," + n2);
		while (n3<= input) {
			n3 = n1 + n2;
			if (n3<=input){
			System.out.print("," + n3);
			}
			n1 = n2;
			n2 = n3;
			
		}
	}
	
	public static void main(String[] args) {
		FibonacciSeries fibonacciSeries = new FibonacciSeries();
		fibonacciSeries.fibSeries1(15);
		System.out.println();
		fibonacciSeries.fibSeries2(15);
	}

}
