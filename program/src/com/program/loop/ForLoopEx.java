package com.program.loop;

public class ForLoopEx {

	public static void main(String[]args) {
		String[] array = { "a", "b" };

		try {
			for (int i = 0; i < array.length; i++) {
				System.out.println(array[i]);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	
}
