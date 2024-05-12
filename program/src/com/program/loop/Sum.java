package com.program.loop;

import java.util.Scanner;
public class Sum {
	Scanner input=new Scanner(System.in);
	int n=input.nextInt();
	int sum=0;
	
	public void process() {
		for(int i=0;i<=n;i++) {
			sum+=i;
		}
		System.out.println(sum);
	}
	public static void main(String[]args) {
		Sum ans=new Sum();
		ans.process();
	}

}

