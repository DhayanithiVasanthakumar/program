package com.program.filehandle;
import java.io.File;

public class CheckFile {

	public static void main(String[]args) {
		File file=new File("C:\\java\\test.txt");
		
		if(file.exists()) {
			System.out.println("File is available");
		}
		else {
			System.out.println("File is not available"); 
		}
	}
}
