package com.program.oops;


	// this program is crt but output is diffrent

	abstract class Abt{
		abstract void dhaya(); 
	}
		class As extends Abt{
			void dhaya() {
			System.out.println("hello");
			}
			
			public static void main(String[]args) {
				As run=new As();
				run.dhaya();
			}
		}

