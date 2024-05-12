package com.program.oops;



	class outer{
		
		 class inner{
			public void show() {  // static inner na public bathila static varum
			System.out.println("dhaya");
			}
		}
	}
	
	public class InnerClass {
	public static void main(String[]args) {
		
		outer out=new outer();
		
		outer.inner run=out.new inner();//inga  outer.inner =new outer.inner() nu varum
		run.show();
	}
}


