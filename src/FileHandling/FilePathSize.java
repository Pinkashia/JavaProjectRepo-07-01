package FileHandling;

import java.io.File;

public class FilePathSize {

	public static void main(String[] args) {

		String fileName="file.txt";
		try{
			//file object
			File objfile=new File(fileName);
			//getting file path
			System.out.println("file path is:"+ objfile.getAbsolutePath());
			
			//getting filesize
			System.out.println("file size is:"+ objfile.length());
		}
		catch(Exception Ex){
			System.out.println("Exception:"+Ex.toString());

		}

	}
	
}
