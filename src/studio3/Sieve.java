package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter an integer: ");
		int n = in.nextInt();
		int [] values = new int[n + 1]; 
		for (int i = 1; i < n ; i++) {
			values[i]= i+1; 
		}
		for(int i = 1; i < n; i++) {
			System.out.println(values[i]); 
		}
		int r = 2; 
		while(r <= n/2) {
			for(int value : values) {
				if (value % r == 0 && value != r) { 
					value = 0; 
					for(int i = 1; i < n; i++) {
						System.out.println(values[i]); 
					}
				}
			}
			r++; 
		}

	}

}
