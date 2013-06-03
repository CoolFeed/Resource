package gerry.java.basic;

import java.io.File;

public class ReadDirectory {
	
	public static void systemOutPath(File f){
		if(f == null) return;
		
		System.out.println("path: " + f.getName() + "\nAbsolute: " + f.getAbsolutePath());

		System.out.println();
		
		if(f.isDirectory()){
			File[] subs = f.listFiles();
			if(subs != null){
				for(int i=0; i<subs.length;i++)
					ReadDirectory.systemOutPath(subs[i]);
			}
		}
	}
	public static void main(String[] args){
		String path = null;
		
		if(args != null && args.length > 0){
			path = args[0];
		}
		
		File root = new File(path);
		ReadDirectory.systemOutPath(root);
	}
}
