package extentreports;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportsDemo {
	
	static ExtentReports extent;
	static ExtentSparkReporter spark;
	
	@BeforeClass
	public void starttest() {
		extent = new ExtentReports();
		spark = new ExtentSparkReporter("target/Spark.html");
	}
	
	@Test
	public void extenttest() {
		spark.config().setTheme(Theme.STANDARD);
		spark.config().setDocumentTitle("AutomationReport");
		spark.config().setReportName("ReportDemo");
		
		extent.attachReporter(spark);
		
		//create test node in the report
		ExtentTest test = extent.createTest("Login test").assignAuthor("Sriram");
		test.pass("Login Test Successfull");
		test.info("url loaded");
		test.fail("login test completed successfully");
		
		//create test node in the report
		ExtentTest test1 = extent.createTest("HoomePage test").assignAuthor("Sriram");
		test1.pass("HomePage Successfull");
		test1.info("value entered");
		test1.fail("Homepage test fails");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.goog"
				+ ""
				+ ""
				+ "le.co.in");
		if(driver.getTitle().equals("Google1")) {
			test.log(Status.PASS,"Navigated to the specified URL");
		}
		else {
			test.log(Status.FAIL, "Test Failed");
		}
		driver.quit();
	}
	
	@AfterMethod
	public void teardown() {
		extent.flush();
	}
	
}
