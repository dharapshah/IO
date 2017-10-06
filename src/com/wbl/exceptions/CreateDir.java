package com.wbl.exceptions;

import java.io.File;
import java.io.IOException;

public class CreateDir {

	public static void main(String[] args) {
		
		File dir = new File("My Directory");
		dir.mkdir();
		File file = new File ("My Directory", "Test3.txt");
		try {
			file.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}

}
