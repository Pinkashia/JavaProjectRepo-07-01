package FileHandling;

import java.io.File;

public class ListFileDir {

	public static void main(String a[])
    {
       File file = new File("E:\\SDET Assignments\\Java_Assignments");
       String[] fileList = file.list();
       for(String name:fileList){
           System.out.println(name);
       }
   }
}
