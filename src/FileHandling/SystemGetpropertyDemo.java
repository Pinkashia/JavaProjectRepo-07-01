package FileHandling;

import java.io.FileInputStream;
import java.util.Properties;

public class SystemGetpropertyDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String path= System.getProperty("user.dir")+"\\src\\test\\java\\OrangeHRM\\configuration\\config.properties";
		System.out.print(path);
	


	}

}
