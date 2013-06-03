package gerry.java.basic;

import java.io.*;

public class ReadFile {

	public static void main(String[] args){
		String path = null;
		if(args != null && args.length > 0){
			path = args[0];
		}
		
		if(path != null){
			try {
				BufferedReader in = new BufferedReader( new FileReader(path));
				String line;
				try {
					while((line = in.readLine())!= null){
						System.out.println("Data: " + line);
					}
				} catch (IOException e) {

				}
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
		}
		
		testString();
			
	}
	
	public static void testString(){
		String ss ="";
		System.out.println(ss.toString());
	}
}
