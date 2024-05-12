package com.program.basic;



	import java.util.Scanner;

	public  class Recur {
		Scanner input=new Scanner(System.in);
		
		static int fact(int n) {
			if(n!=0) {
				return n*fact(n-1);
			}
			else
				return 1;
		
		}
		public static void main(String[]args) {
			int num=4,result;
			result=fact(num);
			System.out.println(result);
		}
		

	}


