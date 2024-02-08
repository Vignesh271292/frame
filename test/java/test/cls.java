package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class cls {
public static void main(String[] args) throws Throwable {
	WebDriverManager.edgedriver().setup();
	WebDriver driver = new EdgeDriver();
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	String currenturl = driver.getCurrentUrl();
	System.out.println(currenturl);
	String title = driver.getTitle();
	System.out.println(title);
	driver.switchTo().newWindow(WindowType.TAB);
     driver.get("https://www.amazon.in/mobile-phones/b/?ie=UTF8&node=1389401031&ref_=nav_cs_mobiles");
     driver.navigate().back();
     driver.navigate().refresh();
     Thread.sleep(3000);
     driver.navigate().forward();
     driver.close();


}
}