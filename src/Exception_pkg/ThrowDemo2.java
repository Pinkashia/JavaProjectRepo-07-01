package Exception_pkg;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

// For Checked or Compile time exception we have to use throws along with throw
public class ThrowDemo2 {
	
	public void FileRead() throws IOException 
	{
		FileReader f1 = new FileReader("E:\\btes\\file1.txt");
		BufferedReader br= new BufferedReader(f1);
		System.out.println(br.read());
		//throw new FileNotFoundException();
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		ThrowDemo2 obj= new ThrowDemo2();
		obj.FileRead();

	}

}
