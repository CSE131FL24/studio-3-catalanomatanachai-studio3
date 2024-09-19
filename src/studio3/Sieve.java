package studio3;

import java.util.Scanner;

public class Sieve {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("n value?");
		int n = in.nextInt();
		if(n < 2) {
			System.out.println("there are no prime numbers less than 2");
		}
		boolean[] isPrime = new boolean[n + 1];
		
		for (int i = 2; i <= n; i++) {
			isPrime[i] = true;
		}
		for (int i = 2; i * i <= n; i++) {
			if (isPrime[i]) {
				for (int j = i * i; j <= n; j += i) {
					isPrime[j] = false;
				}
			}
		}
		System.out.println("Prime numbers up to " + n + ":");
		for (int i = 2; i <= n; i++) {
			if(isPrime[i]) {
				System.out.print(i + " ");
			}
		}
	}
}
