package com.program.loop;

import java.util.Scanner;
public class LoopEx {
	Scanner input=new Scanner(System.in);
	int sum=0;
	int num=0;
	
	public void ans() {
		do {
			sum+=num;
			System.out.println(sum);
			num=input.nextInt();
		}while(num>=0);
	}
	public static void main(String[]args) {
		LoopEx output=new LoopEx();
		output.ans();
	}

}

