package FileRead;

import java.io.FileInputStream;
import java.util.Properties;

public class FileRead {
	
	
	public static Properties Read(String driver_path) {
		Properties p= new Properties();
			try {
		FileInputStream fl=new FileInputStream(driver_path);
		p.load(fl);	
			
			
		} catch (Exception e) {
		System.out.println(e.getMessage());	
		
		}
			return p;
	}

}
