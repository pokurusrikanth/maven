package javapractice;

import java.io.File;

public class Fileutils {

	
	public static boolean verify_file_exists(String filepath) {
		File file=new File(filepath);
		if(file.exists()) {
			return true;
		}else {
			return false;
		}
	}
	public static String get_file_extension(String filepath) {
		String extension="";
		if(verify_file_exists(filepath)) {
			File file=new File(filepath);
			if(file.isFile()) {
			String	filename=file.getName();
			String[] names=filename.split("\\.");
			 extension=names[names.length-1];
			
				
			}else {
				System.out.println("the given path is not valid please give valid file path");
			}
		}else {
			System.out.println("file is not exists in given file path");
		}
	
		return extension;
	}
	
		
		
		
		
		
		
		
		
		
	
	
	
}
