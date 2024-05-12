package com.program.loop;

import java.util.Scanner;

public class Nested {
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		
		public void table() {
			for(int i=0;i<=10;i++) {
				System.out.println(i);
				for(int j=0;j<=10;j++) {
					System.out.println(i*j);
				}
				
			}
			System.out.println();
		}
	public static void main(String[]args) {
		Nested last=new Nested();
		last.table();
	}
	
	

}

