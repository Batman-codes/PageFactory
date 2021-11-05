package base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;
import utills.ReadExcel;

public class BaseClass {
	public static ChromeDriver driver;
	public String myExcel;
	public static Properties prop;
	
	@BeforeMethod 
	//@Parameters("url")
	public void preconditions() throws IOException {
		
		// Set up path for the file to be accessed
		FileInputStream fis = new FileInputStream("./src/test/resources/english.properties");
		
		//Create object for properties file
		prop = new Properties();
		
		//Load the properties file
		prop.load(fis);
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	@AfterMethod
	public void closeBrowser() {
		driver.quit();
	}
	
	@DataProvider(name = "fetchData")
	public String[][] getDataFromExcel() throws IOException{
		ReadExcel read = new ReadExcel();
		return read.readExcelData(myExcel);
	}

}
