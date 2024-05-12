package com.program.filehandle;

import java.util.Scanner;
import java.io.File;

public class ReadFile {

	public static void main(String[]args) {
		try {
			File file=new File("C:\\java\\test3.txt");
			
			Scanner input=new Scanner(file);
			
			while(input.hasNextLine()) {
				System.out.println(input.nextLine());
			}
			input.close();
		}catch(Exception e) {
			System.out.println("error");
		}
	}
}
