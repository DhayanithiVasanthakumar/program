package com.program.filehandle;
import java.io.FileWriter;

public class WriteFile {

	public static void main(String[]args) {
		try {
			FileWriter file=new FileWriter("C:\\java\\test4");
			file.write("hi dhaya");
			file.close();
			
			System.out.println("file writtern sucessfully");
		}catch(Exception e) {
			System.out.println("error");
		}
	}
}
