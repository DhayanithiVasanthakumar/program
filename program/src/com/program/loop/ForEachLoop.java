package com.program.loop;

public class ForEachLoop {

	public void sum() {
		int[] num={1,8,9,7};
		int sum=0;
		
		for(int number:num) {
			sum+=number;
		}
		System.out.println(sum);
	}
	public static void main(String[]args) {
		ForEachLoop last=new ForEachLoop();
		last.sum();
	}

}
