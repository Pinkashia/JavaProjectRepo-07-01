package FileHandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Java BufferedReader class is used to read the text from a character-based input stream
public class BufferedReaderDemo {
	
	public static void read_file() throws IOException
	{
		FileReader fr=new FileReader("E:\\Projects_Reference_Data-Bootcamp\\filehandling.txt");    
		BufferedReader br=new BufferedReader(fr);    

		int i;    
		while((i=br.read())!=-1)
		{  
			System.out.print((char)i);  
		}  
		br.close();    
		fr.close();    
	}
	
	public static void read_console() throws IOException
	{
		InputStreamReader r=new InputStreamReader(System.in);    
	    BufferedReader br=new BufferedReader(r);            
	    System.out.println("Enter topic name: ");  
	    
	    String name=br.readLine();    
	    System.out.println("Topic1: "+name); 
	    
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		read_console();
		read_file();
		


	}

}
