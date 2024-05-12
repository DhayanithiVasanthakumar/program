package com.program.oops;



	interface Interface{
		void dhaya();
	}

	class b implements Interface{
		public void dhaya() {
			System.out.print("hi");
		}
		
		public static void main(String[]args) {
			b run=new b();
			run.dhaya();
		}
	}


