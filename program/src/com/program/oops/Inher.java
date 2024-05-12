package com.program.oops;



	class parent{
		int a;
		
		void display() {
			System.out.println("kumar");
		}
	}
	
	class child1 extends parent{
		int b;
	
		void show() {
			System.out.println("dhaya");
		}
	}
	
	class child2 extends parent{
		int c;
		
		void run() {
			System.out.println("aswini");
		}
	}
	public class Inher {
	public static void main(String[]args) {
		child1 c=new child1();
		c.a=70;
		c.b=45;
		
		
		System.out.println(c.a);
		System.out.println(c.b);
		
		c.display();
		c.show();	
		
	}
}

