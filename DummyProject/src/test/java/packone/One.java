package packone;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class One {
	@Test
public void my1() {
	WebDriver driver = new ChromeDriver();
	driver.get("http://localhost:8888/");
}
}
