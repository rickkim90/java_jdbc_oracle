package com.eddy;

import java.util.Scanner;

public class Sum {
	static int zero = 0;
	static int first = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			int a = sc.nextInt();
			fibonacci(a);
			System.out.println(zero + " " + first);
			zero = 0; first = 0;
		}

	}

	static int fibonacci(int n) {
		if (n == 0) {
			// System.out.println(0);
			zero++;
			return 0;
		} else if (n == 1) {
			// System.out.println(1);
			first++;
			return 1;
		} else {
			return fibonacci(n - 1) + fibonacci(n - 2);
		}
	}

}
