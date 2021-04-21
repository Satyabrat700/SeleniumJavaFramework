package property;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

public class PropertiesFile {
	static Properties prop=new Properties();

	public static void main(String[] args) throws IOException {
	
		property();
		Setproperty();
		
		}
	
	public static void property() throws IOException {
		
			
		
				
				
				InputStream input;
				try {
					input = new FileInputStream("C:\\Users\\satya\\eclipse-workspace\\JavaProject\\src\\test\\java\\property\\config.properties");
					prop.load(input);	
					
					String browser= prop.getProperty("browser");
					
					System.out.println(browser);
				} catch (FileNotFoundException e) {
					// 
					e.printStackTrace();
				}
				
			
			
			
		}
	
	public static void Setproperty() throws IOException {
		
		
		
		
		
 
		try {
		OutputStream  output= new FileOutputStream("C:\\Users\\satya\\eclipse-workspace\\JavaProject\\src\\test\\java\\property\\config.properties");
			prop.setProperty("browser", "IE");
			prop.store(output, null);;
			
			String browser= prop.getProperty("browser");
			
			System.out.println(browser);
		} catch (FileNotFoundException e) {
			// 
			e.printStackTrace();
		}
		
	
	
	
}


	}


