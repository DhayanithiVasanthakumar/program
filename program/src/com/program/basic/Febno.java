package com.program.basic;
import java.util.Scanner;

public class Febno {
	Scanner input=new Scanner(System.in);
	int n=input.nextInt();
	int result;
	int v1=1;
	int v2=1;
	
	public void feb() {
		for(int i=0;i<=n;i++) {
			result=v1+v2;
			v1=v2;
			v2=result;
		}
		System.out.println(result);
	}
	public static void main(String[]args) {
		Febno ans=new Febno();
		ans.feb();
	}
	

}


