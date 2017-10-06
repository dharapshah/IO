package com.wbl.exceptions;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BuffReader {

	public static void main(String[] args) {
	
		//File F = new File("Test.txt");
		
		try {
			File f = new File("Test.txt");
			f.createNewFile();
			FileReader fr = new FileReader(f);
			
			
		//	BufferedReader br = new BufferedReader(fr);
			
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
