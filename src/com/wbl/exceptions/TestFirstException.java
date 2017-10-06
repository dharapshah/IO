package com.wbl.exceptions;

public class TestFirstException {

	public static void main(String[] args) {
		
		try{
		
		int[]arr = {10,20,30};
		System.out.println(arr[3]);
		}
		catch(ArrayIndexOutOfBoundsException ae){
			System.out.println("Index out of bound exception!");
			/*or
			ae.printStackTrace();
			ae.getMessage();*/
			
		}finally{// this will print in both the scenarios i.e if we give correct array or incorrect array 
			System.out.println("File closing");
			
		}
		System.out.println("Hello World");
        System.out.println("Hellow World, how are you ?");
	
	}
	
}
