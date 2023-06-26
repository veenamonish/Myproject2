package mvn.SeleniumMavenSetUp1;
import  org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SeleniumTestNG1
{
	@Test
public void Test()
{
	WebDriver driver=new ChromeDriver();
	driver.get("https://testng.org/testng-eclipse-update-site.");
}
}
