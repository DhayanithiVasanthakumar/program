package com.program.loop;

import java.util.Scanner;
public class Star {
	Scanner input=new Scanner(System.in);
	int n=input.nextInt();
	
	public void star() {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i;j++)
				System.out.print(" ");
			
			for(int k=1;k<=i;k++)
			System.out.print("*");
			
			System.out.println();
		}
	}
	public static void main(String[]args) {
		Star result=new Star();
		result.star();
	}
}


