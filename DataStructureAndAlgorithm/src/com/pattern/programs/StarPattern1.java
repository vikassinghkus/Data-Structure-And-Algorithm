package com.pattern.programs;

import java.util.Scanner;

public class StarPattern1 {

	public static void Pattern1(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <=n; j++) {
				System.out.print("*"+" ");
			}
			System.out.println();
		}
	}
	public static void Pattern2(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <=i; j++) {
				System.out.print("*"+" ");
			}
			System.out.println();
		}
	}
	public static void Pattern3(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <=i; j++) {
				System.out.print(j+1 +" ");
			}
			System.out.println();
		}
	}
	public static void Pattern4(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <=i; j++) {
				System.out.print(i+1 +" ");
			}
			System.out.println();
		}
	}
	public static void Pattern5(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 1; j <=n-i; j++) {
				System.out.print("*" +" ");
			}
			System.out.println();
		}
	}
	public static void Pattern6(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 1; j <=n-i; j++) {
				System.out.print(j +" ");
			}
			System.out.println();
		}
	}
	
	public static void Pattern7(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <n-i-1; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k <2*i+1; k++) {
				System.out.print("*");
			}
			for (int j = 0; j <n-i-1; j++) {
				System.out.print(" ");
			}
			System.out.println();
		}
	}
	public static void Pattern8(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <i; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k <2*n-(2*i+1); k++) {
				System.out.print("*");
			}
			for (int j = 0; j <i; j++) {
				System.out.print(" ");
			}
			System.out.println();
		}
	}
	public static void Pattern9(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <n-i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the number");
//		int n = sc.nextInt();
		int n=5;
		// TODO Auto-generated method stub
		Pattern9(n);
	}

}
