package com.program.basic;


public class Array {
	int []data= {5,10,15,20};
	int sum=0;
	double avg=0;
	
	public void run() {
		for(int i:data) {
			sum+=i;
		}
		int size =data.length;
		
		avg=((double)sum/(double)size);
		
		System.out.println("the sum is"+sum);
		System.out.println("the avg is"+avg);
	}
	public static void main(String[]args) {
		Array ans=new Array();
		ans.run();
	}

}


