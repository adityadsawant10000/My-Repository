package Generic;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest  implements Constants{
	public WebDriver driver;
	@BeforeClass
	void beforeClass(){
		WebDriverManager.edgedriver();
		driver=new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(ITO));
		driver.get(url);
	}
	@AfterClass
	void afterClass() {
		driver.close();
	}
}
