package com.program.filehandle;
import java.io.File;

public class CreateFile {

	public static void main(String[]args) {
		try {
			File file=new File("C:\\java\\test1");
			
			if(file.createNewFile()) {
				System.out.println("File is created");
			}
			else {
				System.out.println("File already in location");
			}
		}catch(Exception e) {
			System.out.println("Error");
		}
	}
}
