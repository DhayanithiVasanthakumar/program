package com.program.basic;

import java.util.Scanner;
public class Break {
	Scanner input=new Scanner(System.in);
	int sum=0;
	int n=input.nextInt();
	
	public void run() {
		while(true) {
			if(n<0) {
				break;
			}
			sum+=n;
		}
		System.out.println(sum);
	}
	public static void main(String[]args) {
		Break ans=new Break();
		ans.run();
	}

}


