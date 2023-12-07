package FileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

//Java FileInputStream & FileOutputStream classes obtains input/output bytes from/to a file.
public class FileInputStream_Demo {
	
	

	public static void main(String[] args) throws IOException  {
		// TODO Auto-generated method stub
		
		File f1= new File("E:\\Projects_Reference_Data-Bootcamp\\filehandling.txt");
		
		FileOutputStream f_out = new FileOutputStream(f1);
		String s= "Writing back to file";
		f_out.write(s.getBytes());		
		
		
		//File f1= new File("E:\\Projects_Reference_Data-Bootcamp\\filehandling.txt");
		//FileInputStream file_obj = new FileInputStream(f1);
		//InputStream file_obj = new FileInputStream(f1);
		FileInputStream file_input_obj = new FileInputStream("E:\\Projects_Reference_Data-Bootcamp\\filehandling.txt");
		
		int temp;
		while(( temp= file_input_obj.read()) != -1)
		{
			System.out.print((char)temp);
		}
		
		

	}

}
