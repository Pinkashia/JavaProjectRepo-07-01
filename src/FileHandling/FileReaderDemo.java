package FileHandling;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file1 = new File("E:\\Projects_Reference_Data-Bootcamp\\filehandling.txt");
		FileWriter writer1 = new FileWriter(file1); 

		// Writes the content to the file
		writer1.write("This is file writer demo"); 
		writer1.close();


		// Creates a FileReader Object
		FileReader fr=new FileReader(file1);    
		int i;    
		while((i=fr.read())!=-1) 
		{
			System.out.print((char)i);    
			
		}
		fr.close();
	}

}
